package com.kafka.registration.service;

import com.kafka.registration.dto.ApiResponse;
import com.kafka.registration.dto.CustomerRegistrationRequest;
import com.kafka.registration.dto.CustomerRegistrationResponse;

public interface CustomerRegistrationService {

	ApiResponse<CustomerRegistrationResponse> registerCustomer(CustomerRegistrationRequest request);
}