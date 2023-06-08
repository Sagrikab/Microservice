package com.patient.service;

import com.patient.entity.PatientEntity;
import com.patient.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService{

//1674910800011L
    //1674999000000

   List<PatientEntity> list=List.of(
      new PatientEntity(123L,111L,"ABC",new Date(1674910800011L),"High Fever"),
           new PatientEntity(123L,117L,"ABC",new Date(1674999000000L),"Nausea with Headache")

    );

    public PatientServiceImpl() throws ParseException {
    }

    @Override
    public List<PatientEntity> getListOfPatient(Long doctorId) {
        return list.stream().filter(patientEntity -> patientEntity.getDoctorId().equals(doctorId)).collect(Collectors.toList());
    }
}
