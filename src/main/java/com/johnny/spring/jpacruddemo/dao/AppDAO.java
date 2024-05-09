package com.johnny.spring.jpacruddemo.dao;

import com.johnny.spring.jpacruddemo.entity.Instructor;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int id);
}
