package com.training.java.assignments;

public class Assignment7 {
		public static void main(String[] args) {
			/*First Store all the transactions in any data structure of Your Choice from collections, and by using  Loops and conditional statements  
	1. Print total number of credit and debit transactions completed 
	2. Print the total amount credited and debited in account  
	3. Print total amount remaining at the end in Bank Account 
	4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit  Transaction with Amount” and also print total number of suspicious transactions

			 * 
			 */
			
			
			//1. Print total number of credit and debit transactions completed
			
			int credittotal=0;
			int debittotal=0;
			int totalcreditamount=0;
			int totaldebitamount=0;
			int suspicious=0;
			
			
		int[] amount=new int[8];
		amount[0]=50000;
		amount[1]=-2000;
		amount[2]=3000;
		amount[3]=-15000;
		amount[4]=-200;
		amount[5]=-300;
		amount[6]=4000;
		amount[7]=-3000;
		
		
		
				
	/*for (int transactions:amount) {
			if (transactions > 0) {     // Credit
				credittotal++;	
				totalcreditamount+=transactions;
				if(transactions>10000) {
					System.out.println("Suspicious credit transaction with Amount: "+transactions);
					suspicious++;
					
				}
				
				
			}*/
		
		for(int i=0;i<amount.length;i++) {
			if(amount[i]>0) {
				credittotal++;
				totalcreditamount+=amount[i];
				if(amount[i]>10000) {
					System.out.println("Suspicious credit transaction with Amount: "+amount[i]);
					suspicious++;
				}

				}
				
		else {
				debittotal++;
				totaldebitamount+=Math.abs(amount[i]);
				if(amount[i]<-10000) {
					System.out.println("Suspicious credit transaction with Amount: "+Math.abs(amount[i]));
					suspicious++;
				}
				
			}
		}
		System.out.println("total number of suspicious transactions : "+suspicious);
		System.out.println("No of credit transactions : "+credittotal);
		System.out.println("Total of credit transactions : "+totalcreditamount);
		System.out.println("No of debit transactions : "+debittotal);
		System.out.println("Total of debit transactions : "+totaldebitamount);
		
		int remainingBalance =totalcreditamount-totaldebitamount;
		
		System.out.println("total amount remaining at the end in Bank Account : "+remainingBalance);
		}
	}
			
			
			

			
			




