package com.kafka.registration.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerRegistrationResponse {

    private String customerCode;

    private String status;

    private String message;
}