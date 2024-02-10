package QuizvsAssignment;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		System.out.println("Bismillah");
		
		System.out.println("Welcome to pizza shop ");
		float totalFee = 0,distance = 0;
		int pizzaSize,yesNo;
		//
		Scanner input = new Scanner(System.in);
		System.out.print("What size of pizza do you want (Please enter number given) \n"
				+ "1. Small (60TLs) \n2. Medium (95.5TLs) \n3. Large (120.5TLs)\n");
		pizzaSize = input.nextInt();
		
//		Pizza add smth
		
		System.out.print("Do you want Cheese? \n"
				+ "(1. Yes / 2. No) \n");
		yesNo = input.nextInt();
		if(yesNo == 1) totalFee += 7.5;
		
		System.out.print("Do you want Pepper? \n"
				+ "(1. Yes / 2. No) \n");
		yesNo = input.nextInt();
		if(yesNo == 1) totalFee += 7.5;
		
		System.out.print("Do you want Sausage? \n"
				+ "(1. Yes / 2. No) \n");
		yesNo = input.nextInt();
		if(yesNo == 1) totalFee += 7.5;
		
		System.out.print("Do you want Onion? \n"
				+ "(1. Yes / 2. No) \n");
		yesNo = input.nextInt();
		if(yesNo == 1) totalFee += 7.5;
		
		System.out.print("Enter distance from home in km \n");
		distance = input.nextFloat();
		distance = (distance * 2) +5;
		totalFee += distance;
		
		switch(pizzaSize) {
			case 1: totalFee += 60;
			break;
			case 2: totalFee += 95.5;
			break;
			case 3: totalFee += 120.5;
			break;
		}
		System.out.printf("Your total fee is %.1f \n"
				+ "(included delivery fee %.1f)",totalFee,distance);
		
	}
}
