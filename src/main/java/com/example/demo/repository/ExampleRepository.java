package com.example.demo.repository;

import com.example.demo.domain.orm.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Integer>, JpaSpecificationExecutor<Example> {
}