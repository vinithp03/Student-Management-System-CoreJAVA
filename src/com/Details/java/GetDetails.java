package com.Details.java;

import com.student.java.Student;

public class GetDetails {

	public void show(SubmitDetails detail) {
        if(detail.studentData.size()==0)
        {
        	System.out.println("No data exists");
        }
        
		for (Student s : detail.studentData) {
			System.out.print("Name : " + s.getName());
			System.out.print("  RollNumber : " + s.getRollnumber());
			System.out.print("  Age : " + s.getAge());
			System.out.print("  Gender : " + s.getGender());
			System.out.println();
		}
	}

}
