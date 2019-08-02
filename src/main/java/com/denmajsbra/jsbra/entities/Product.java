package com.denmajsbra.jsbra.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private static final long serialId = 1;

    @Id
    private String id;
    private String name;
}
