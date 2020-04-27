package com.capg.pbms.accountmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pbms.accountmanagement.exceptions.accountManagementException;
import com.capg.pbms.accountmanagement.model.AccountManagement;
import com.capg.pbms.accountmanagement.model.Customer;
import com.capg.pbms.accountmanagement.service.IaccountManagementService;
import com.capg.pbms.accountmanagement.service.accountManagementServiceImpl;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class accountManagementController {
	@Autowired
	accountManagementServiceImpl iservice;
	
	@GetMapping("/find/{customerId}")
	public  boolean findById(@PathVariable String customerId) throws accountManagementException
	{
		boolean customer= iservice.findById(customerId);
		if((Boolean) null)
			throw new accountManagementException("Customer Id Not Found ,Wrong Id :" +customerId);
		return customer;
	}
	
	@PostMapping("/account")
	public AccountManagement addAccount(@RequestBody AccountManagement account){
		 return iservice.addAccount(account);
		//return new ResponseEntity<AccountManagement>(account,HttpStatus.CREATED);
	}
	@PostMapping("/addcustomer/id/{accountId}")
	public Customer addCustomerDetailsById(@PathVariable("accountId") String accountId,@RequestBody Customer customer){
		 return iservice.addCustomerDetailsById(accountId,customer);
		//return new ResponseEntity<AccountManagement>(account,HttpStatus.CREATED);
	}
	

	@PutMapping("/update/id/{customerId}")
	public Customer updateById(@PathVariable("customerId") String customerId, @RequestBody Customer customer ) {
		
		return iservice.updateById(customerId,customer);
	}
	
    @GetMapping("/delete/{customerId}")
    public ResponseEntity<Customer> deleteById(@PathVariable("customerId") String customerId) {
    	
    if( iservice.deleteById(customerId)) {
    	return new ResponseEntity<Customer>(HttpStatus.OK);
    }
     return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
	
    }
}
