package com.capg.pbms.accountmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.accountmanagement.model.AccountManagement;

public interface IaccountManagementRepo extends JpaRepository<AccountManagement,String> {
//	public Customer findById(String customerId);
//	public Customer update(Customer customer);
//	public void delete(String customerId);

}
