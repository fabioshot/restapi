package com.aula.restapi.database;

import com.aula.restapi.entidate.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioContato extends JpaRepository<Contato, Long> {
    
}
