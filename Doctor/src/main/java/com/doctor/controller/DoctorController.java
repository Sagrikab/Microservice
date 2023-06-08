package com.doctor.controller;

import com.doctor.entity.DoctorEntity;
import com.doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/{doctorId}")
    public DoctorEntity getDoctor(@PathVariable("doctorId") Long doctorId){

        DoctorEntity doctor=this.doctorService.getDoctorById(doctorId);
        //http://localhost:9005/patient/doctor/123
        List patient=this.restTemplate.getForObject("http://localhost:9005/patient/doctor/"+doctor.getDoctorId(),List.class);
        doctor.setPatient(patient);

        return doctor;
    }

}
