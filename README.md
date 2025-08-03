# sse-mcp-server-demo2

## claude desktop configuration
```json
{
  "mcpServers": {

    "HRManager" : {
      "command" : "uv",
      "args": [
        "run",
        "--with",
        "mcp[cli]",
        "mcp",
        "run",
        "/Users/nexweb/project/works/weather/main.py"
      ]
    },

    "customerAccount" : {
      "command": "npx",
      "args": [
        "mcp-remote",
        "http://localhost:8082/sse"
      ]
    },    
    "filesystem": {
      "command": "npx",
      "args": [
        "@modelcontextprotocol/server-filesystem",
        "/Users/nexweb/Downloads"
      ]
    },
    "my-weather" : {
      "command": "npx",
      "args": [
        "mcp-remote",
        "http://localhost:8000/sse"
      ]
    }
  }
}
```