package com.example.spring_mongodb_demo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_mongodb_demo.model.Student;
@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    // You can define custom query methods here if needed
}