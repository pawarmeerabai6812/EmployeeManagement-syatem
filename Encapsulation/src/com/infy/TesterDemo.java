package com.infy;
class Customer {
	// Private member variables
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	


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



	public long getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
}


public class TesterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer s1=new Customer();
		s1.setCustomerId("12344");
		s1.setAddress("udatpur");
		s1.setContactNumber(223388778);
		s1.setCustomerName(null);
		System.out.println("customer id:" +s1.getCustomerId());
		System.out.println("customer id:" +s1.getCustomerName());
		System.out.println("customer id:" +s1.getContactNumber());
		System.out.println("customer id:" +s1.getAddress());

	}

}
