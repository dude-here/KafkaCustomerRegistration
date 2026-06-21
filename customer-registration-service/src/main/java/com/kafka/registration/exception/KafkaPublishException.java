package com.kafka.registration.exception;


public class KafkaPublishException
        extends RuntimeException {

    public KafkaPublishException(
            String message) {

        super(message);
    }
}