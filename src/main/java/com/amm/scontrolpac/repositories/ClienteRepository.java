package com.amm.scontrolpac.repositories;

import com.amm.scontrolpac.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
