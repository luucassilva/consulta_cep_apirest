package com.project.consulta_cep_apirest.countries.repositories;

import com.project.consulta_cep_apirest.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
