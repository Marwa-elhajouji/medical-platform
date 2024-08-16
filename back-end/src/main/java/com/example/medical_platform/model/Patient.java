package com.example.medical_platform.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patients")
public class Patient {
    @Id
    private String id;
    private String name;
    private String email;

}
