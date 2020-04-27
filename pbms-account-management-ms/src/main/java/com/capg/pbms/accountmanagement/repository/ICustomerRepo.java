package com.capg.pbms.accountmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.accountmanagement.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer,String>{

}
