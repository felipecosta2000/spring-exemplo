package com.felipe.costa.spring_exemplo.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.costa.spring_exemplo.core.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

        

    
}
