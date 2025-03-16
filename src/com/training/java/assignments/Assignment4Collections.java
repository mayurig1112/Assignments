package com.training.java.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4Collections {

	public static void main(String[] args) {
	

			
				
				//****************Students table*****************************
				
				Map<String,String> student1Map = new HashMap<String,String>();
				//student 2 details map
				//hashmap: stores in random order of keys
				//allows null keys and null values
				//put method used to insert values
				
				student1Map.put("Name","John Doe");
				student1Map.put("Age","20");
				student1Map.put("Gender","Male");
				student1Map.put("Roll Number","S12345");
				student1Map.put("Grade", "A");
				student1Map.put("Major", "Computer  Science");
				student1Map.put("GPA", "3.8");
				student1Map.put("Email", "john@example.com");
				student1Map.put("Contact Number", "9999997777");
				student1Map.put("Address", "123 Elm St");
				
				Map<String,String> student2Map = new HashMap<String,String>();
				//student 1 details map
						//hashmap: stores in random order of keys
						//allows null keys and null values
				//put method used to insert values
						
				student2Map.put("Name","Jane Smith");
				student2Map.put("Age","21");
				student2Map.put("Gender","FEMale");
				student2Map.put("Roll Number","S12346");
				student2Map.put("Grade", "B");
				student2Map.put("Major", "Mathematics");
				student2Map.put("GPA", "3.5");
				student2Map.put("Email", "jane@example.com");
				student2Map.put("Contact Number", "9876665666");
				student2Map.put("Address", "456 Oak St");

				Map<String,String> student3Map = new HashMap<String,String>();
				//student 3 details map
						//hashmap: stores in random order of keys
						//allows null keys and null values
				//put method used to insert values
						
				student3Map.put("Name","Mike Brown");
				student2Map.put("Age","22");
				student2Map.put("Gender","Male");
				student2Map.put("Roll Number","S12347");
				student2Map.put("Grade", "A");
				student2Map.put("Major", "Physics");
				student2Map.put("GPA", "3.9");
				student2Map.put("Email", "Mike@example.com");
				student2Map.put("Contact Number", "8787876546");
				student2Map.put("Address", "789 Pine St");
				
				//******************************************Employee details******************************
				
				Map<String,String> Employee1Map = new HashMap<String,String>();
				
				//Employee1 details row stored in one hash map
				
				Employee1Map.put("Employee ID", "E001");
				Employee1Map.put("Name", "Alice Green");
				Employee1Map.put("Age", "30");
				Employee1Map.put("Gender","Male");
				Employee1Map.put("Department", "Engineering");
				Employee1Map.put("Position", "Software Engineer");
				Employee1Map.put("Salary", "75,000");
				Employee1Map.put("Email", "alice@example.com");
				Employee1Map.put("Contact Number","9876543213");
				
				Map<String,String> Employee2Map = new HashMap<String,String>();
				
				//Employee2 details row stored in one hash map
				
				Employee2Map.put("Employee ID", "E002");
				Employee2Map.put("Name", "Bob Johnson");
				Employee2Map.put("Age", "35");
				Employee2Map.put("Gender","Male");
				Employee2Map.put("Department", "Marketing");
				Employee2Map.put("Position", "Marketing Manager");
				Employee2Map.put("Salary", "85,000");
				Employee2Map.put("Email", "bob@example.com");
				Employee2Map.put("Contact Number","9876543214");
				
				Map<String,String> Employee3Map = new HashMap<String,String>();
				
				//Employee3 details row stored in one hash map
				
				Employee3Map.put("Employee ID", "E003");
				Employee3Map.put("Name", "Carol wite");
				Employee3Map.put("Age", "28");
				Employee3Map.put("Gender","Female");
				Employee3Map.put("Department", "Sales");
				Employee3Map.put("Position", "Sales Executive");
				Employee3Map.put("Salary", "65,000");
				Employee3Map.put("Email", "carol@example.com");
				Employee3Map.put("Contact Number","9876543215");
				
				//********************************Product Details*****************************
				
				Map<String,String> Product1Map = new HashMap<String,String>();
				
				//product1 details row stored in one hash map
				
				Product1Map.put("Product ID", "P001");
				Product1Map.put("Name", "Laptop");
				Product1Map.put("Category", "Electronics");
				Product1Map.put("Price", "$1,200");
				Product1Map.put("Stock Quantity", "50");
				Product1Map.put("Suplier", "Tech Suplies");
				Product1Map.put("Warranty", "2 Years");
				Product1Map.put("Rating", "4.5");
				Product1Map.put("Manufacturing Date", "15-01-2023");
				Product1Map.put("Expiry Date", "15-01-2025");
				
				Map<String,String> Product2Map = new HashMap<String,String>();
				
				//product2 details row stored in one hash map
				
				Product2Map.put("Product ID", "P002");
				Product2Map.put("Name", "Desk Chair");
				Product2Map.put("Category", "Furniture");
				Product2Map.put("Price", "$150");
				Product2Map.put("Stock Quantity", "200");
				Product2Map.put("Suplier", "Office Depot");
				Product2Map.put("Warranty", "1 Year");
				Product2Map.put("Rating", "4");
				Product2Map.put("Manufacturing Date", "10-02-2023");
				Product2Map.put("Expiry Date", "N/A");
				
				Map<String,String> Product3Map = new HashMap<String,String>();
				
				//product3 details row stored in one hash map
				
				Product3Map.put("Product ID", "P003");
				Product3Map.put("Name", "Coffee Maker");
				Product3Map.put("Category", "Kitchen");
				Product3Map.put("Price", "$75");
				Product3Map.put("Stock Quantity", "100");
				Product3Map.put("Suplier", "Kitchen World");
				Product3Map.put("Warranty", "6 months");
				Product3Map.put("Rating", "4.2");
				Product3Map.put("Manufacturing Date", "20-03-2023");
				Product3Map.put("Expiry Date", "20-03-2024");
				
				List<Map<String,String >> studentList = new ArrayList<Map<String,String >>();
				//List to store 3 student maps in single list
				//Map with in Array List 
				studentList.add(student1Map);
				studentList.add(student2Map);
				studentList.add(student3Map);
				
				List<Map<String,String >> EmployeeList = new ArrayList<Map<String,String >>();
				//List to store 3 employee maps in single list
				//Map with in Array List 
				EmployeeList.add(Employee1Map);
				EmployeeList.add(Employee2Map);
				EmployeeList.add(Employee3Map);
				
				List<Map<String,String >> ProductList = new ArrayList<Map<String,String >>();
				//List to store 3 product maps in single list
				//Map with in Array List 
				ProductList.add(Product1Map);
				ProductList.add(Product2Map);
				ProductList.add(Product3Map);
				
				Map<String,List<Map<String, String >>>data=new HashMap<String,List<Map<String,String >>>();
				data.put("Student Data", studentList);
				data.put("Employee Data", EmployeeList);
				data.put("Product List", ProductList);
				
				System.out.println(ProductList.get(1).get("Suplier"));
					
				
		

	}

}
