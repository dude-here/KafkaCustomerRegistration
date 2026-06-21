package com.kafka.consumer.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEvent {

    private String customerCode;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;
}