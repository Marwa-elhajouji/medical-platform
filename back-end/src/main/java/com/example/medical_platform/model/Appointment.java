package com.example.medical_platform.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "appointments")
public class Appointment {
    @Id
    private String id;

    @DBRef
    private Patient patient;

    @DBRef
    private Doctor doctor;

    private LocalDateTime appointmentTime;

}
