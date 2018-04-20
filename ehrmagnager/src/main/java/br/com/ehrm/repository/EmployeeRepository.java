package br.com.ehrm.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ehrm.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
