package com.oigonzalezp.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oigonzalezp.demo.model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
