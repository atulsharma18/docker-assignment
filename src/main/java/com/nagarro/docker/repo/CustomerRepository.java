package com.nagarro.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.docker.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
