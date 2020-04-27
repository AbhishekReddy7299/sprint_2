package com.capg.pbms.accountmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pbms.accountmanagement.exceptions.accountManagementException;
import com.capg.pbms.accountmanagement.model.AccountManagement;
import com.capg.pbms.accountmanagement.model.Customer;
import com.capg.pbms.accountmanagement.repository.ICustomerRepo;
import com.capg.pbms.accountmanagement.repository.IaccountManagementRepo;

@Service
public class accountManagementServiceImpl implements IaccountManagementService{
	
	@Autowired
	IaccountManagementRepo accountRepo;
	@Autowired
	ICustomerRepo customerRepo;

	@Override
	public boolean findById(String customerId) {
		// TODO Auto-generated method stub
		return accountRepo.existsById(customerId);
	}

	@Override
	public Customer updateById(String customerId,Customer customer) {
		return customerRepo.save(customer);
		//return ((accountManagementServiceImpl) accountRepo).update(customer);
	}

	@Override
	public boolean deleteById(String customerId) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(customerId);
		return !customerRepo.existsById(customerId);
	}

	public AccountManagement addAccount(AccountManagement account) {
		if(accountRepo.existsById(account.getAccountId()))
		{
			throw new accountManagementException("Account Already Exists");
		}
		// TODO Auto-generated method stub
		return accountRepo.save(account);
	}
	
	public Customer addCustomerDetailsById(String accountId,Customer customer) {
		
		if(!accountRepo.existsById(accountId))
		{
			throw new accountManagementException("Account does not Exists");
		}
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

}
