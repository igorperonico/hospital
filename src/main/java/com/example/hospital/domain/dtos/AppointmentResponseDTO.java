package com.example.hospital.domain.dtos;

import com.example.hospital.domain.Appointment;

import java.time.LocalDateTime;

public record AppointmentResponseDTO(String id, LocalDateTime appointmentDate, String patientName, String doctorName,
                                     String reason) {
    public AppointmentResponseDTO(Appointment appointment) {
        this(
                appointment.getId(),
                appointment.getAppointmentDate(),
                appointment.getPatientName(),
                appointment.getDoctorName(),
                appointment.getReason());
    }
}
