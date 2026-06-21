package com.kafka.consumer.entity;


import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "audit_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditLog extends BaseAuditEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventType;

    private String customerCode;

    @Column(length = 1000)
    private String message;
}