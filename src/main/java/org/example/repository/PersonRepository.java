package org.example.repository;

import org.example.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {
    @Query("SELECT p FROM Person p WHERE p.cityOfLiving = :city")
    List<Person> getPersonsByCity(@RequestParam("city") String city);
}


