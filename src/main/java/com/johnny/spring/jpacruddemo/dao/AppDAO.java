package com.johnny.spring.jpacruddemo.dao;

import com.johnny.spring.jpacruddemo.entity.Instructor;
import com.johnny.spring.jpacruddemo.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);
    InstructorDetail findInstructorDetailById(int id);
}
