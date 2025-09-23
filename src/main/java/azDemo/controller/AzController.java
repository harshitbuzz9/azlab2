package azDemo.controller;

import azDemo.dto.AzResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api/v1")
public class AzController {
    @GetMapping("/list-az-resources")
    public ResponseEntity<AzResponse> getAzResources() {
        AzResponse response = new AzResponse();
        response.setResponse(Arrays.asList("Virtual Machine",
                "Blob Storage",
                "App Service",
                "Azure SQL Database",
                "Virtual Network",
                "Azure Kubernetes Service"));
        return ResponseEntity.ok(response);
    }

}
