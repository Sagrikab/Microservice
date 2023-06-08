package com.patient.service;

import com.patient.entity.PatientEntity;

import java.util.List;

public interface PatientService {
    List<PatientEntity> getListOfPatient(Long doctorId);
}
