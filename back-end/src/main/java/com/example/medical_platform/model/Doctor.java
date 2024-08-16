package com.example.medical_platform.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doctors")
public class Doctor {
    @Id
    private String id;
    private String name;
    private String specialization;

}
