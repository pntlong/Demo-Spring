package com.EspServer.Esp.repository;

import com.EspServer.Esp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
    Employee findByEmailIgnoreCase(String email);
}
