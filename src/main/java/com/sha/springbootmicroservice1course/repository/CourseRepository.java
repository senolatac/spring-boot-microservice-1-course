package com.sha.springbootmicroservice1course.repository;

import com.sha.springbootmicroservice1course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 9.10.2021
 * @time 16:38
 */
public interface CourseRepository extends JpaRepository<Course, Long>
{
    //findBy+fieldName
}
