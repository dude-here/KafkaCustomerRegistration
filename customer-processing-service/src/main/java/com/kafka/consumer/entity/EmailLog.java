package com.kafka.consumer.entity;


import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "email_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailLog extends BaseAuditEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerCode;

    private String email;

    private String subject;

    private String status;
}