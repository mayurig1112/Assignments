package com.training.java.assignments;



public class Assignment3EmGroups {

	public static void main(String[] args) {
		
				//Main method
				
				String[] empnames= new String[3];
				//storing emp names
				
				int[] empids=new int[3];
				//storing emp ids
				
				Assignment3Employees obj=new Assignment3Employees();
				//Obj to Retrieve the data from the Employees class
				
				empnames[0]=obj.employeeName1;
				empnames[1]=obj.employeeName2;
				empnames[2]=obj.employeeName3;
				//Emp names fetched through obj from Employees class
				
			   empids[0]=obj.emp1Id;
			   empids[1]=obj.emp2Id;
			   empids[2]=obj.emp3Id;
			 //Emp ids fetched through obj from Employees class
			   
			   System.out.println("emp name:"+empnames[0]+","+"emp id:"+empids[0]);
			   System.out.println("emp name:"+empnames[1]+","+"emp id:"+empids[1]);
			   System.out.println("emp name:"+empnames[2]+","+"emp id:"+empids[2]);
			   //Prints emp names with emp ids

			}

		


	}


