package br.com.ehrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ehrm.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
