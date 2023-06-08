package com.patient.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validation {

    public Date setDate() {
        Date appointmentDateSet=new Date();
        try {
            String sDate1 = "31/12/1998";
            appointmentDateSet = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);

        }catch (Exception e) {
            // System.out.println(appointmentDateSet);
            System.out.println(e);

        }
        return appointmentDateSet;

    }
}
