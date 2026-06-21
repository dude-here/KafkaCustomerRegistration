package com.kafka.consumer.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kafka.consumer.entity.EmailLog;

public interface EmailLogRepository
        extends JpaRepository<EmailLog, Long> {

}