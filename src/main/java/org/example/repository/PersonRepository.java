package org.example.repository;

import org.example.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p WHERE p.cityOfLiving = :city")
    List<Person> getPersonsByCity(String city);

    @Query("SELECT p FROM Person p WHERE p.contact.age < :age ORDER BY p.contact.age ASC")
    List<Person> getPersonsByAgeLessThan(int age);

    @Query("SELECT p FROM Person p WHERE p.contact.firstName = :name AND p.contact.lastName = :surname")
    Optional<Person> getPersonByNameAndSurname(String name, String surname);
}

