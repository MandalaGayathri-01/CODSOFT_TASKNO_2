//
//TASK 2
//STUDENT GRADE CALCULATOR
//Input: Take marks obtained (out of 100) in each subject.
//Calculate Total Marks: Sum up the marks obtained in all subjects.
//Calculate Average Percentage: Divide the total marks by the total number of
//subjects to get the average percentage.
//Grade Calculation: Assign grades based on the average percentage achieved.
//Display Results: Show the total marks, average percentage, and the corresponding
//grade to the user.

package codsoft;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		// Create the scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of subjects: ");
		int subjects = sc.nextInt();// ask the user for the no.of subjects

		int totalMarks = 0;// to store the total marks of the student

		// repeating the loop for taking the marks in each subject
		for (int i = 1; i <= subjects; i++) {
			System.out.print("Enter Marks for Subject" + i + "(out of 100): ");

			int marks = sc.nextInt();
			totalMarks += marks;// add the marks to the total marks

		}

		double avgPercent = (double) totalMarks / subjects;// calculate the avg percentage

		char grade;// variable to store the grade

		// Assigning grade based on the average percentage
		if (avgPercent >= 90) {
			grade = 'A';
		} else if (avgPercent >= 80) {
			grade = 'B';
		} else if (avgPercent >= 70) {
			grade = 'C';
		} else if (avgPercent >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		// Displays the final result of the student
		System.out.println();
		System.out.println("===========================");
		System.out.println(" STUDENT GRADE RESULT ");
		System.out.println("===========================");
		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Averagre Peracentage : " + avgPercent);
		System.out.println("Grade : " + grade);

		sc.close();// closing the scanner object

	}

}
