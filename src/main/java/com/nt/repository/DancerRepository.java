package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Dancer;

public interface DancerRepository extends JpaRepository<Dancer, Integer> {
	
	

}
