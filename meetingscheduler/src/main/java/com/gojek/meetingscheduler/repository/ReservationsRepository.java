package com.gojek.meetingscheduler.repository;

import com.gojek.meetingscheduler.entity.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservations, Integer> {
}
