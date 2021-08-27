package com.project.consulta_cep_apirest.staties.repositories;

import com.project.consulta_cep_apirest.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {

}
