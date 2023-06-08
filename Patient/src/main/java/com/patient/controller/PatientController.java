package com.patient.controller;


import com.patient.entity.PatientEntity;
import com.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @RequestMapping("/doctor/{doctorId}")
    public List<PatientEntity> getPatient(@PathVariable("doctorId") Long doctorId){
        return this.patientService.getListOfPatient(doctorId);
    }
}
