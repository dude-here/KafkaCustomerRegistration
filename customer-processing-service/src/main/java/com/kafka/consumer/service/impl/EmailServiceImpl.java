package com.kafka.consumer.service.impl;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Service;

import com.kafka.consumer.entity.Customer;
import com.kafka.consumer.service.EmailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

	private final JavaMailSender mailSender;

	@Override
	public void sendRegistrationEmail(Customer customer) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(customer.getEmail());

		message.setSubject("Customer Registration Successful");

		message.setText(
				"Hello " + customer.getFirstName() + ",\n\n" + "Your registration has been completed successfully.\n\n"
						+ "Customer Code : " + customer.getCustomerCode() + "\n\n" + "Thank You.");

		mailSender.send(message);

		log.info("Registration Email Sent : {}", customer.getEmail());
	}
}