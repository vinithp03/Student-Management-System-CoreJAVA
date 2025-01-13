package com.user.java;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.Details.java.GetDetails;
import com.Details.java.SubmitDetails;

public class UserChoice {
	
	public void getChoice(Scanner scan,SubmitDetails submit,GetDetails gd) {
		System.out.println("enter option you want to perform");
		System.out.println("add / get / remove");
		
		String option = scan.next();

		switch (option.toLowerCase()) {
		case "get":
			gd.show(submit);
			break;
		case "add":
			submit.insertDetails(scan);
			break;
		case "remove":
			try {
			    System.out.print("Enter Student Roll Number: ");
			    int rollnumber = scan.nextInt();
			    submit.deleteDetail(rollnumber);
			} catch (InputMismatchException e) {
			    System.out.println("Invalid input! Please enter a number.");
			    scan.nextLine();
			}
			
			break;
		default:
			System.out.println("Invalid Option");
		}

		System.out.println();
		
		//to perform task again
		System.out.println("Do wanna again add/delete/show details (yes/no)");
		
		String choice = scan.next();

		if (choice.equalsIgnoreCase("yes")) { 
		    getChoice(scan,submit,gd);
		} else {
		    System.out.println("Ok, thank you");
		}
	}

}
