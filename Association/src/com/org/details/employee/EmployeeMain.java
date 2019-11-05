package com.org.details.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.n.firstName="Black";
		System.out.println("Employee Last Name- "+(e.n.lastName="Berry"));
		System.out.println("Employee Name = "+(e.n.firstName+e.n.lastName));
		System.out.println("-----");
		e.a.doorNo=11;
		e.a.streetName="BTM Second Stage";
		e.a.areaName="BTM";
		e.a.city="Bangalore";
		e.a.pincode=234555;
		System.out.println("Address - "+e.a.doorNo+"\n"+ "Street Name - "+e.a.streetName+"\n"+"Area Name - "+e.a.areaName+"\n"+
				"City Name - "+e.a.city+"\n"+"Area PIN - "+e.a.pincode);
		System.out.println("-----");
		System.out.println("Employee Salary = "+e.salary);
		
		System.out.println("----");
		e.p.panId=22201;
		e.p.panNumber=007;
		e.p.dateOfIssue=2018;
		System.out.println("Pan Card = "+e.p.panId+e.p.panNumber+e.p.dateOfIssue);
		
		System.out.println("-----");
		System.out.println("Employee Bank Account Number - "+e.bankAccount);
		
		System.out.println("-----");
		System.out.println("Employee Age - "+e.age);
		
		System.out.println("Employee Gender - "+e.gender);
	
	}

}
