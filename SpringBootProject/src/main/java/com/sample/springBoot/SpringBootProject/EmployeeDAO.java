package com.sample.springBoot.SpringBootProject;

import org.springframework.data.repository.CrudRepository;

public interface  EmployeeDAO extends CrudRepository<Employee, Long> {



}