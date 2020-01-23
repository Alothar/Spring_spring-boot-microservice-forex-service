package com.springboot.microservices.example.forex.springbootmicroserviceforexservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue find_By_From_And_To(String from, String to);
}
