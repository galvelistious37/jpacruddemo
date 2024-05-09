package com.johnny.spring.jpacruddemo.dao;

import com.johnny.spring.jpacruddemo.entity.Instructor;
import com.johnny.spring.jpacruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDAOImpl implements AppDAO{
    // Define field for entity manager
    private EntityManager entityManager;

    // Inject the entity manager using Constructor injection
    @Autowired
    public AppDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist(theInstructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        return entityManager.find(Instructor.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int id) {
        // Retrieve the instructor
        Instructor tempInstructor = findInstructorById(id);

        // Delete the Instructor
        entityManager.remove(tempInstructor);
    }

    @Override
    public InstructorDetail findInstructorDetailById(int id) {
        return entityManager.find(InstructorDetail.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailById(int id) {
        InstructorDetail tempInstructorDetail = findInstructorDetailById(id);
        entityManager.remove(tempInstructorDetail);
    }


}
