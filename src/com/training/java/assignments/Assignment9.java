package com.training.java.assignments;

public class Assignment9 {
	

	    public static void main(String[] args) {
	        int[] arr = {12, 34, 11, 36, 87, 98, 93};

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        int thirdLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                thirdLargest = secondLargest;
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                thirdLargest = secondLargest;
	                secondLargest = num;
	            } else if (num > thirdLargest && num != largest && num != secondLargest) {
	                thirdLargest = num;
	            }
	        }

	        System.out.println("Second largest: " + secondLargest);
	        System.out.println("Third largest: " + thirdLargest);
	    }
	}
