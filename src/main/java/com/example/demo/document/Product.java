package com.example.demo.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Document("products")
public class Product {

    @Id
    private String id;
    private String name;
    private String manufacturer;
    private Integer amount;
    private BigDecimal price;
    private LocalDateTime createdAt;

}
