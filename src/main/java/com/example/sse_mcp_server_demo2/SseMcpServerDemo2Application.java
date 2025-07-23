package com.example.sse_mcp_server_demo2;

import com.example.sse_mcp_server_demo2.tool.ProductService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SseMcpServerDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SseMcpServerDemo2Application.class, args);
	}

	@Bean
	public ToolCallbackProvider productTools() {
		return MethodToolCallbackProvider.builder().toolObjects(new ProductService()).build();
	}
}
