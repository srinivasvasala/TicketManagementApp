package com.srinivas.ticketmanagementapp.Repository;

import com.srinivas.ticketmanagementapp.Model.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Tourist,Integer> {
}
