package com.nagarro.docker.service;

import java.util.List;
import java.util.Optional;

import com.nagarro.docker.entity.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);
}
