package com.eventostech.EventosTechApi.repositories;

import com.eventostech.EventosTechApi.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
