package com.lambdaschool.school.service;

import com.lambdaschool.school.model.Instructor;
import com.lambdaschool.school.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "instructorService")
public class InstructorServiceImpl implements InstructorService
{
    @Autowired
    private InstructorRepository instructrepos;

    @Override
    public List<Instructor> findAll() {
        List<Instructor> list = new ArrayList<>();
        instructrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Instructor save(Instructor instructor) {
        Instructor newInstructor = new Instructor();
        newInstructor.setInstructname(instructor.getInstructname());
        return instructrepos.save(newInstructor);
    }
}
