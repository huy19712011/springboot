/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springboot.courses.controller;

import com.example.springboot.courses.bean.Course;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author huynq
 */
@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return List.of(new Course(1, "Learn Java", "Bkacad"),
                new Course(2, "Learn full stack with Angular and React", "Bkacad"));
    }

    @GetMapping("/courses/1")
    public Course getCourseDetails() {
        return new Course(1, "Learn Java", "Bkacad");
    }


}
