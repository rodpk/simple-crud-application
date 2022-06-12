package br.com.yahata.simplecrudapi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.yahata.simplecrudapi.model.dto.PersonRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@Getter @Setter
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Integer id;

    @Column(name = "name", nullable = false, length = 256)
    private String name;
    
    @Column(name = "age")
    private int age;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "birth_date", columnDefinition = "DATE")
    private LocalDate birth;


    public static Person of(PersonRequest request) {
        var person = new Person();
        person.setName(request.name());
        person.setAge(request.age());
        person.setCpf(request.cpf());
        person.setBirth(request.birthDate());
        return person;
    }
}
