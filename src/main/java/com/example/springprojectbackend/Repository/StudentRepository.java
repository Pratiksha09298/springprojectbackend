package com.example.springprojectbackend.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springprojectbackend.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
