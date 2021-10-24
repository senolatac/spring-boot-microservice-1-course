package com.sha.springbootmicroservice1course.service;

import com.sha.springbootmicroservice1course.model.Course;

import java.util.List;

/**
 * @author sa
 * @date 9.10.2021
 * @time 16:40
 */
public interface CourseService
{
    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
