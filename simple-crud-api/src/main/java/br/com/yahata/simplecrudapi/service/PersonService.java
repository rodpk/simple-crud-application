package br.com.yahata.simplecrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yahata.simplecrudapi.model.Person;
import br.com.yahata.simplecrudapi.model.dto.PersonRequest;
import br.com.yahata.simplecrudapi.repository.PersonRepository;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository repository;

    public Person save(PersonRequest request) {
        var person = repository.save(Person.of(request));
        return person;
    }

    public Person findById(Integer id) {
        var person = repository.findById(id).orElseThrow(() -> new RuntimeException("Person not found"));
        return person;
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Person update(PersonRequest request, Integer id) {
        var person = Person.of(request);
        person.setId(id);
        return repository.save(person);
    }

    public void delete(Integer id) {
        var person = this.findById(id);
        repository.delete(person);
    }

}
