package com.example.sse_mcp_server_demo2.tool;

import com.example.sse_mcp_server_demo2.domain.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    private RestTemplate restTemplate = new RestTemplate();

    @Tool(description = "Get all product in databases")
    public List<Product> getAllProduct() {
        ParameterizedTypeReference<List<Product>> paramsTypeRef = new ParameterizedTypeReference<List<Product>>() {};
        ResponseEntity<List<Product>> responseEntity = restTemplate.exchange("http://localhost:8060/products", HttpMethod.GET, null, paramsTypeRef);

        List<Product> products = responseEntity.getBody();
        log.info("MCP products:{}", products);

        return products;
    }
}
