package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Person;
 
@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
}