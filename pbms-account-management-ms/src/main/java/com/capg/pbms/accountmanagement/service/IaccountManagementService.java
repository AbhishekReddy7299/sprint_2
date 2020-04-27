package com.capg.pbms.accountmanagement.service;

import com.capg.pbms.accountmanagement.exceptions.accountManagementException;
import com.capg.pbms.accountmanagement.model.AccountManagement;
import com.capg.pbms.accountmanagement.model.Customer;

public interface IaccountManagementService {
	public AccountManagement addAccount(AccountManagement account) ;
	public boolean findById(String customerId);
	//public Customer update(Customer customer);
	//public void delete(String customerId);
	Customer updateById(String customerId, Customer customer);
	boolean deleteById(String customerId);

}
