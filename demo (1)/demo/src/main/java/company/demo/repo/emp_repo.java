package company.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import company.demo.entity.emp_entity;

public interface emp_repo extends JpaRepository<emp_entity, Integer>{

}
