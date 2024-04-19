package com.infy;
class Customer1 {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
}

public class AccessModifier {

	public static void main(String[] args) {
		Customer1 customer = new Customer1();
		customer.customerId = "C101";
		customer.customerName = "Jack";
		customer.contactNumber = 9870345687L;
		customer.address = "D089, St. Louis Street, Springfield";
		System.out.println("Displaying customer details");
		System.out.println("Customer Id : " + customer.customerId);
		System.out.println("Customer Name : " + customer.customerName);
		System.out.println("Contact Number : " + customer.contactNumber);
		System.out.println("Address : " + customer.address);
	}
		// TODO Auto-generated method stub

	}


