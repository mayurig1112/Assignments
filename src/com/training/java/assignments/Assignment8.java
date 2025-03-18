package com.training.java.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment8 {
	
	public static void main(String[] args) {
	Map<String,Double[]>empdata=new HashMap<String,Double[]>();
	//String to store employee name and Double[] is for storing all other employee details
	
	empdata.put("Alice Johnson", new Double[] {75000.0,5.0,4.2});
	empdata.put("Bob Smith", new Double[] {68000.0,3.0,3.8});
	empdata.put("Carol Davis",new Double[] {82000.0,3.0,3.8});
	empdata.put("David Brown",new Double[] {90000.0,10.0,2.0});
	empdata.put("Eva Green", new Double[] {60000.0,2.0,3.5});
	
	//Bonus and Variable Pay has be taken individually instead of array. since to assign it differently to different employees
	
			int bonus1=1500;
			int bonus2=1200;
			int bonus3=300;
			double variable1=0.15;
			double variable2=0.1;
			double variable3=0.03;
			
			int reward=5000;
			//Employees with Experience >= 5 Years get extra Reward of 5000;
			
			Set<String>employees=empdata.keySet();
			//to pass the employee names from empdata map to set
			
			Map<String,Double>empnameWitHikePercentage=new HashMap<String,Double>();
			
			for(String emp:employees) {
				
				double hike=0;
				double hikepercentage=0;
				if(empdata.get(emp)[2]>=4){
					//(emp)[2]--> rating
					
					hike=(empdata.get(emp)[0]*variable1)+bonus1;
					//bonus1=1500;
					//variable1=0.15;
					//empdata.get(emp)[0]-->basic salary
					
					
					
				}else if(empdata.get(emp)[2]>=3 && empdata.get(emp)[2]< 4) {
					hike=(empdata.get(emp)[0]*variable2)+bonus2;
					//bonus2=1200;
					//variable2=0.1;
					//empdata.get(emp)[0]-->basic salary
				}else if(empdata.get(emp)[2]<3) {
					
					hike=(empdata.get(emp)[0]*variable3)+bonus3;
					//bonus2=300;
					//variable2=0.03;
					//empdata.get(emp)[0]-->basic salary
					
				}
				if(empdata.get(emp)[1]>=5) {
					hike=hike+reward;
				}
				hikepercentage=hike/empdata.get(emp)[0];
				empnameWitHikePercentage.put(emp, hikepercentage*100);
			}
		
			
			System.out.println(empnameWitHikePercentage);
			
	
	}
	
	
	
}
