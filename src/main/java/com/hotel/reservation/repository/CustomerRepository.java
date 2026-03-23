package com.hotel.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.reservation.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}