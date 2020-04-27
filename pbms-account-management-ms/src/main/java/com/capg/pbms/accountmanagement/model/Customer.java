package com.capg.pbms.accountmanagement.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Pecunia_Bank_Management_System")
public class Customer {
	@Id
	private String customerId;
	private String customerName;
//    @OneToOne(mappedBy="customer",cascade = CascadeType.ALL)
//	private Address customerAddress;
	private String customerAadhar;
	private String customerPan;
	private String customerContact;
	private String customerGender;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate customerDob;
	//private Address address;
	 
	 
	 @OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
		private List<Address> customerAddress; 

	 public Customer() {
			super();
		}

 
		public Customer(String customerId, String customerName, String customerAadhar, String customerPan,
			String customerContact, String customerGender, LocalDate customerDob, List<Address> customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAadhar = customerAadhar;
		this.customerPan = customerPan;
		this.customerContact = customerContact;
		this.customerGender = customerGender;
		this.customerDob = customerDob;
		this.customerAddress = customerAddress;
	}


		public String getCustomerId() {
			return customerId;
		}


		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public String getCustomerAadhar() {
			return customerAadhar;
		}


		public void setCustomerAadhar(String customerAadhar) {
			this.customerAadhar = customerAadhar;
		}


		public String getCustomerPan() {
			return customerPan;
		}


		public void setCustomerPan(String customerPan) {
			this.customerPan = customerPan;
		}


		public String getCustomerContact() {
			return customerContact;
		}


		public void setCustomerContact(String customerContact) {
			this.customerContact = customerContact;
		}


		public String getCustomerGender() {
			return customerGender;
		}


		public void setCustomerGender(String customerGender) {
			this.customerGender = customerGender;
		}


		public LocalDate getCustomerDob() {
			return customerDob;
		}


		public void setCustomerDob(LocalDate customerDob) {
			this.customerDob = customerDob;
		}


		public List<Address> getCustomerAddress() {
			return customerAddress;
		}


		public void setCustomerAddress(List<Address> customerAddress) {
			this.customerAddress = customerAddress;
		}


		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAadhar="
					+ customerAadhar + ", customerPan=" + customerPan + ", customerContact=" + customerContact
					+ ", customerGender=" + customerGender + ", customerDob=" + customerDob + ", customerAddress="
					+ customerAddress + "]";
		}


		 	 

		 
	 
}
