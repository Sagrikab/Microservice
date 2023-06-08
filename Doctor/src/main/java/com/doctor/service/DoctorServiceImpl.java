package com.doctor.service;

import com.doctor.entity.DoctorEntity;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Long.parseLong;

@Service
public class DoctorServiceImpl implements DoctorService {

    List<DoctorEntity> list=List.of(new DoctorEntity(123L,"Dr. ABC")
    ,new DoctorEntity(1287L,"Dr. PQR"));



    @Override
    public DoctorEntity getDoctorById(Long doctorId) {

        return this.list.stream().filter(doctorEntity -> doctorEntity.getDoctorId().equals(doctorId)).findAny().orElse(null);
    }
}
