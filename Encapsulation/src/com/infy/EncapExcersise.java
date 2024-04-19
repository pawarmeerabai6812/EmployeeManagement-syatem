package com.infy;
class Employee{
	 private String employeeId;
	 private String employeeName;
	 private int salary;
	 private int bonus;
	 private int jobLevel;
	 
	 public void calculateSalary() {
			if (this.jobLevel >= 4) {
				this.bonus = 100;
			} else {
				this.bonus = 50;
			}
			this.salary += this.bonus;
		
		}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
	

	
}


public class EncapExcersise {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setEmployeeId("122345");
		obj.setEmployeeName("meera");
		obj.setSalary(200000);
		obj.setJobLevel(5);
		//obj.setBonus(0);
		System.out.println("EmployieeId;"+obj.getEmployeeId());
		System.out.println("EmployieeName;"+obj.getEmployeeName());
		System.out.println("Employieejoblevel;"+obj.getJobLevel());
		//System.out.println("Employieebonus;"+obj.getBonus());
		obj.calculateSalary();
		System.out.println(obj.getSalary());
		
		
		
		// TODO Auto-generated method stub

	}

	
}
