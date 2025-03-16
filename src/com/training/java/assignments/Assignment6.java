package com.training.java.assignments;

public class Assignment6 {
	

		public static void main(String[] args) {
			System.out.println("====================================================");
			/*
			 * A bank evaluates loan applicants based on the following criteria: 
	 Credit Score: 
	 */
			String customerName = "John Doe";  
			short creditScore = 720;  
			float income = 55000.0f;  
			boolean isEmployed = true;  
			float debtToIncomeRatio = 35.0f;

		
			System.out.println("Actual Credit Score : "+creditScore);
			
			if(creditScore>750) {
				System.out.println("loan is automatically approved.");
				//If the credit score is above 750, the loan is automatically approved. 
			}
			else if(creditScore>=650 && creditScore<= 750) {
				//If the credit score is between 650 and 750, additional checks are performed.
				
			     if(income>=50000 && isEmployed==true && debtToIncomeRatio<=40 ) {
			    	 
					System.out.println("additional checks are performed,income is : "+income);
					/*2. Income: 
					o For credit scores between 650 and 750, the customer’s income must be at least $50,000  for the loan to be considered. 
						 */
					
							
						System.out.println(customerName+" Employement Status : "+isEmployed);
						/*3. Employment Status: 
						o If the customer’s income is at least 50,000, the system checks whether the customer is  employed. 
						o If the customer is unemployed, the loan is denied. 
						*/
						
						System.out.println("DTI = " +debtToIncomeRatio);
						/*o If the customer is employed, the system checks the debt-to-income (DTI) ratio. 
						 * o If the DTI ratio is less than 40%, the loan is approved. 
						 * o If the DTI ratio is 40% or greater, the loan is denied. 
						 */
						
			
						
					}
					else {
						System.out.println("the loan is denied.");
					}
				
			  
				System.out.println("loan is considered for "+customerName);
			}
			else if(creditScore<650){
				
				System.out.println("loan denied");
				//o If the credit score is below 650, the loan is denied. 
			}
		
		System.out.println("====================================================");
		
		
			
		}}

