package com.example.hospital.domain.dtos;

import java.time.LocalDateTime;

public record AppointmentRequestDTO(LocalDateTime appointmentDate, String patientName,String doctorName,String reason) {
}
