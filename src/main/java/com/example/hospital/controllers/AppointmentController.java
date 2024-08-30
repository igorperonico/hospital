package com.example.hospital.controllers;

import com.example.hospital.domain.Appointment;
import com.example.hospital.domain.dtos.AppointmentRequestDTO;
import com.example.hospital.domain.dtos.AppointmentResponseDTO;
import com.example.hospital.repositories.AppointmentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @PostMapping
    public ResponseEntity postAppointment(@RequestBody @Valid AppointmentRequestDTO body) {
        Appointment newAppointment = new Appointment(body);

        this.appointmentRepository.save(newAppointment);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllAppointments() {
        List<AppointmentResponseDTO> appointmentList = this.appointmentRepository.findAll().stream().map(AppointmentResponseDTO::new).toList();

        return ResponseEntity.ok(appointmentList);
    }
}
