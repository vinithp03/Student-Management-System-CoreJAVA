package com.Details.java;

import java.util.*;
import com.student.java.Student;


public class SubmitDetails {
		
	List<Student> studentData= new ArrayList<Student>();
	
	public void insertDetails(Scanner scan) {
	    scan.nextLine();
	    System.out.print("Enter Student Name: ");
	    String name = scan.nextLine();  

	    // Validate input
	    while (name.isEmpty()) {
	        System.out.println("Name cannot be empty! Please enter a valid name.");
	        name = scan.nextLine(); 
	    }

	    int rollnumber;  // Declare rollnumber outside the loop

	    while (true) {
	        System.out.print("Enter Student Roll Number: ");
	        rollnumber = scan.nextInt();

	        // Check for duplicate roll number using a loop
	        boolean isDuplicate = false;
	        for (Student student : studentData) {
	            if (student.getRollnumber() == rollnumber) {
	                isDuplicate = true;
	                break; // Exit the loop if a duplicate is found
	            }
	        }

	        if (isDuplicate) {
	            System.out.println("Roll number already exists. Please enter a unique roll number.");
	        } else {
	            break; // Exit the loop if no duplicates are found
	        }
	    }

	    System.out.print("Enter Student Age: ");
	    int age = scan.nextInt();
	    while (age < 18 || age > 100) {
	        System.out.println("Invalid age! Please enter a valid age (18-100).");
	        age = scan.nextInt();
	    }
	    scan.nextLine(); // Clear the buffer

	    System.out.print("Enter Student Gender: ");
	    String gender = scan.nextLine();
	    while (gender.isEmpty()) {
	        System.out.println("Gender cannot be empty! Please enter a valid gender.");
	        gender = scan.nextLine();
	    }

	    Student student = new Student(name, rollnumber, age, gender);
	    studentData.add(student);
	    System.out.println("Data Added successfully!");
	}


	
	public void deleteDetail(int roll)
	{
		boolean flag=false;
		for (int i=0;i<studentData.size();i++) {
			if(studentData.get(i).getRollnumber()==roll)
			{
				flag=true;
				studentData.remove(i);
				System.out.println("Data Removed Succesfully");
			}
		}
		if(flag==false)
			System.out.println("Data not found");
		
		
	}
	

}
