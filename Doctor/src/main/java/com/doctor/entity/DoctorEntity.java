package com.doctor.entity;

import java.util.ArrayList;
import java.util.List;

public class DoctorEntity {

    private Long doctorId;
    private String doctorName;

    List<PatientEntity> patient=new ArrayList<>();
    public DoctorEntity() {
    }



    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public DoctorEntity(Long doctorId, String doctorName, List<PatientEntity> patient) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.patient = patient;
    }

    public DoctorEntity(Long doctorId, String doctorName) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public List<PatientEntity> getPatients() {
        return patient;
    }

    public void setPatient(List<PatientEntity> patient) {
        this.patient= patient;
    }

    @Override
    public String toString() {
        return "DoctorEntity{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
