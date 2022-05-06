package com.student.repository;

import com.student.model.DataObj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<DataObj,Integer> {
}
