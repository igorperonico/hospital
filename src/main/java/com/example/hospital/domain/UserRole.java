package com.example.hospital.domain;

public enum UserRole {
    ADMIN("admin"),

    DOCTOR("doctor"),

    RECEPTIONIST("receptionist"),

    PATIENT("patient");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    String getRole() {
        return this.role;
    }
}
