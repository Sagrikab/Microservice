package com.doctor.entity;

import java.util.Date;

public class PatientEntity {

    private Long doctorId;
    private Long patientId;
    private String patientName;
    private Date appointmentDate;
    private String diseaseDesc;



    public PatientEntity() {
    }

    public PatientEntity(Long doctorId, Long patientId, String patientName, Date appointmentDate, String diseaseDesc) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
        this.diseaseDesc = diseaseDesc;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }


    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDiseaseDesc() {
        return diseaseDesc;
    }

    public void setDiseaseDesc(String diseaseDesc) {
        this.diseaseDesc = diseaseDesc;
    }




}


