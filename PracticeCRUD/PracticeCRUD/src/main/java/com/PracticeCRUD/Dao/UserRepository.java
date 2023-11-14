package com.PracticeCRUD.Dao;

import com.PracticeCRUD.Entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Person, Integer> {
}
