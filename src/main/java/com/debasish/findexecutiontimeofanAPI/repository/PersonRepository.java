package com.debasish.findexecutiontimeofanAPI.repository;

import com.debasish.findexecutiontimeofanAPI.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
