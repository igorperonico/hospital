package com.example.hospital.domain;

import com.example.hospital.domain.dtos.AppointmentRequestDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime appointmentDate;
    private String patientName;

    private String doctorName;

    private String reason;

    public Appointment(AppointmentRequestDTO body) {
        this.appointmentDate = body.appointmentDate();
        this.patientName = body.patientName();
        this.doctorName = body.doctorName();
        this.reason = body.reason();
    }
}
