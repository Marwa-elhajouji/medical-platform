package com.example.medical_platform.controller;

import com.example.medical_platform.model.Patient;
import com.example.medical_platform.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController
// @RequestMapping("/api/patients")
// public class PatientController {

//     @Autowired
//     private PatientService patientService;

//     @GetMapping
//     public List<Patient> getAllPatients() {
//         return patientService.getAllPatients();
//     }

//     @PostMapping
//     public Patient createPatient(@RequestBody Patient patient) {
//         return patientService.savePatient(patient);
//     }
// }



@RestController
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/api/patients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }
}

