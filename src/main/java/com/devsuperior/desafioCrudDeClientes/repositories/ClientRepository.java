package com.devsuperior.desafioCrudDeClientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desafioCrudDeClientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
