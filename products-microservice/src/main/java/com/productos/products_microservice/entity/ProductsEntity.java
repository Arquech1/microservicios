package com.productos.products_microservice.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductsEntity {
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private double productUnitPrice;
}
