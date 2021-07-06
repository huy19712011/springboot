/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springboot.courses.repository;

import com.example.springboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author huynq
 */
public interface CourseRepository extends JpaRepository<Course, Long>{

}
