package br.com.yahata.simplecrudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.yahata.simplecrudapi.model.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
    
}
