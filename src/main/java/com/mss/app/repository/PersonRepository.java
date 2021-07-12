 package com.mss.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mss.app.dto.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
