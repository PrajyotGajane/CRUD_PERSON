package com.example.crud.repository;

import com.example.crud.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends JpaRepository<Person, Integer> {

    public Person findByEmail(String email);

}
