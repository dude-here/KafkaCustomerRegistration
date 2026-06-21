package com.kafka.consumer.service;

import com.kafka.consumer.entity.Customer;

public interface EmailService {

	void sendRegistrationEmail(Customer customer);
}