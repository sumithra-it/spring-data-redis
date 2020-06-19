package com.sr.springredis.springdataredis.repo;
import org.springframework.stereotype.Repository;
import com.sr.springredis.springdataredis.model.Student;
import org.springframework.data.repository.CrudRepository;

	@Repository
	public interface StudentRepository extends CrudRepository<Student, String> {}

