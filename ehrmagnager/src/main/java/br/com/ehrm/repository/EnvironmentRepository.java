package br.com.ehrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.ehrm.model.Environment;

public interface EnvironmentRepository extends JpaRepository<Environment, Long> {

	@Query("SELECT T FROM Environment T WHERE T.userName =:user and T.password =:password")
	public Environment getLogonEnviroment(@Param("user") String userName, @Param("password") String password);

}
