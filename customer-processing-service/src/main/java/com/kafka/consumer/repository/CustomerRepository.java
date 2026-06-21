package com.kafka.consumer.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kafka.consumer.entity.*;

public interface CustomerRepository
        extends JpaRepository<Customer, Long> {

    Optional<Customer> findByCustomerCode(
            String customerCode);

    boolean existsByCustomerCode(
            String customerCode);
}