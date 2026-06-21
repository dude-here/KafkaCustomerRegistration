

This project demonstrates an Event-Driven Microservices Architecture using Spring Boot and Apache Kafka.

When a customer registers through the Registration Service, the customer details are published to a Kafka topic. The Processing Service consumes the event, persists customer information into MySQL, records audit logs, sends registration confirmation emails, and tracks email delivery status.

The project showcases asynchronous communication between microservices using Kafka and follows production-grade coding practices with layered architecture, logging, validation, exception handling, auditing, and database persistence.
