package com.example.hospital.domain.dtos;

import com.example.hospital.domain.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
