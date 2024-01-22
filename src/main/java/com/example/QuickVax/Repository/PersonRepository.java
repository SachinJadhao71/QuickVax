package com.example.QuickVax.Repository;

import com.example.QuickVax.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
