package com.training.java.assignments;

public class Assignment2 {

	public static void main(String[] args) {
		//Create a 3D array to represent the following data
		//Semesters as the first dimension
		String Sem[]= {"Sem1", "Sem2", "Sem3", "Sem4", "Sem5"};
		
		        // Create a 3D array to represent the data
		        String[][][] semesters = new String[5][2][6];

		        // Initialize subjects and marks for each semester
		        String[][] semester1 = {
		            {"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
		            {"78", "85", "91", "74", "88", "79"}
		        };
		        
		        String[][] semester2 = {
		            {"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
		            {"82", "77", "93", "69", "84", "90"}
		        };
		        
		        String[][] semester3 = {
		            {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
		            {"88", "81", "76", "92", "85", "78"}
		        };
		        
		        String[][] semester4 = {
		            {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
		            {"91", "73", "89", "80", "76", "87"}
		        };
		        
		        String[][] semester5 = {
		            {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
		            {"86", "88", "84", "95", "73", "90"}
		        };

		        // Assigning the semester data to the 3D array
		        semesters[0] = semester1;
		        semesters[1] = semester2;
		        semesters[2] = semester3;
		        semesters[3] = semester4;
		        semesters[4] = semester5;

		        // Printing Semester 3 - Subject 4 and Subject 5 Names
		        System.out.println("Semester 3 - Subject 4 and Subject 5 Names:");
		        System.out.println(semesters[2][0][3] + " and " + semesters[2][0][4]);

		        // Printing Semester 5 - Subject 3 and Subject 6 Marks
		        System.out.println("Semester 5 - Subject 3 and Subject 6 Marks:");
		        System.out.println(semesters[4][1][2] + " and " + semesters[4][1][5]);
		    
	}

}
