package com.kafka.consumer.entity;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "customers", uniqueConstraints = { @UniqueConstraint(columnNames = "customerCode") })
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer extends BaseAuditEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String customerCode;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String mobile;
}