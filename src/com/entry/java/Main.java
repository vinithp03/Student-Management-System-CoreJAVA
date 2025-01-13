package com.entry.java;

import java.util.Scanner;

import com.Details.java.GetDetails;
import com.Details.java.SubmitDetails;
import com.user.java.UserChoice;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SubmitDetails submit = new SubmitDetails();
		GetDetails gd = new GetDetails();
		UserChoice user=new UserChoice();
		user.getChoice(scan,submit,gd);
	}

}
