package com.eventostech.EventosTechApi.repositories;

import com.eventostech.EventosTechApi.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
