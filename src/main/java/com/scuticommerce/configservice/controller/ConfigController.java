package com.scuticommerce.configservice.controller;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/config/")
public class ConfigController {

    private DynamicStringProperty productServiceUrl = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.productservice.url", "http://localhost:");

    private DynamicStringProperty productServicePort = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.productservice.port", "8080");

    private DynamicStringProperty orderserviceUrl = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.orderservice.url", "http://localhost:");

    private DynamicStringProperty orderservicePort = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.orderservice.port", "8080");

    private DynamicStringProperty inventoryserviceUrl = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.inventoryservice.url", "http://localhost:");

    private DynamicStringProperty inventoryservicePort = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.inventoryservice.port", "8080");

    private DynamicStringProperty customerserviceUrl = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.customerservice.url", "http://localhost:");

    private DynamicStringProperty customerservicePort = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.productservice.port", "8080");

    private DynamicStringProperty cartserviceUrl = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.cartservice.url", "http://localhost:");

    private DynamicStringProperty cartservicePort = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.cartservice.port", "8080");

    private DynamicStringProperty emailserviceUrl = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.emailservice.url", "http://localhost:");

    private DynamicStringProperty emailservicePort = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.emailservice.port", "8080");

    private DynamicStringProperty messagingserviceUrl = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.messagingservice.url", "http://localhost:");

    private DynamicStringProperty messagingservicePort = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.messagingservice.port", "8080");

    private DynamicStringProperty cacheserviceUrl = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.cacheservice.url", "http://localhost:");

    private DynamicStringProperty cacheservicePort = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.cacheservice.port", "8080");

    private DynamicStringProperty searchserviceUrl = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.searchservice.url", "http://localhost:");

    private DynamicStringProperty searchservicePort = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.searchservice.port", "8080");

    private DynamicStringProperty awsS3Key = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.aws.s3.accesskey", "S3ACCESSKEY");

    private DynamicStringProperty awsS3Secret = DynamicPropertyFactory.getInstance()
            .getStringProperty("scuticommerce.aws.s3.secret", "S3SECRET");


    @GetMapping("/dynamic")
    public ResponseEntity<?> getDynamicValue() {

        Map<String, String> properties = new HashMap<>();

        properties.put(productServiceUrl.getName(),productServiceUrl.get());
        properties.put(productServicePort.getName(),productServicePort.get());
        properties.put(orderserviceUrl.getName(),orderserviceUrl.get());
        properties.put(orderservicePort.getName(),orderservicePort.get());
        properties.put(inventoryserviceUrl.getName(),inventoryserviceUrl.get());
        properties.put(inventoryservicePort.getName(),inventoryservicePort.get());
        properties.put(customerserviceUrl.getName(),customerserviceUrl.get());
        properties.put(customerservicePort.getName(),customerservicePort.get());
        properties.put(cartserviceUrl.getName(),cartserviceUrl.get());
        properties.put(cartservicePort.getName(),cartservicePort.get());
        properties.put(emailserviceUrl.getName(),emailserviceUrl.get());
        properties.put(emailservicePort.getName(),emailservicePort.get());
        properties.put(messagingserviceUrl.getName(),messagingserviceUrl.get());
        properties.put(messagingservicePort.getName(),messagingservicePort.get());
        properties.put(cacheserviceUrl.getName(),cacheserviceUrl.get());
        properties.put(cacheservicePort.getName(),cacheservicePort.get());
        properties.put(searchserviceUrl.getName(),searchserviceUrl.get());
        properties.put(searchservicePort.getName(),searchservicePort.get());
        properties.put(awsS3Key.getName(),awsS3Key.get());
        properties.put(awsS3Secret.getName(),awsS3Secret.get());

       return new ResponseEntity<>(properties, HttpStatus.OK);
    }


}
