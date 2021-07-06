/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springboot.courses.controller;

import com.example.springboot.courses.bean.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot.courses.repository.CourseRepository;

/**
 *
 * @author huynq
 */
@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    @GetMapping("/courses/1")
    public Course getCourseDetails() {
        return new Course(1, "Learn Java", "Bkacad 123");
    }


}
