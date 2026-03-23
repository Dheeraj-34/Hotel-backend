package com.hotel.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.reservation.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}