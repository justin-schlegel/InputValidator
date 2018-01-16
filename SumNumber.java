//Number summation with input validation and progress counter
//Justin Schlegel
//SWENG586 Coding Challenge 2

import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) 
	{
		int number;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("-------------------------------------------------------------------------------------------------");	
			System.out.println("  Enter a positive number!                                                                       ");
			System.out.println("-------------------------------------------------------------------------------------------------");
		    while (!scanner.hasNextInt()) {
		    		System.out.println("-----------------------------------------------------------------------------------------------");
		    		System.out.println("  Now you've gone and done it wrong! Enter a positive number!                                  ");
		    		System.out.println("-----------------------------------------------------------------------------------------------");
		    		System.out.println("\r");
		        scanner.next();
		    }
		    number = scanner.nextInt();
		    scanner.close();
		    System.out.println("-------------------------------------------------------------------------------------------------");
		    System.out.println("  You entered " + '"'+number+'"' + ", an excellent choice.                                       ");
		    System.out.println("-------------------------------------------------------------------------------------------------");
		    System.out.println("\r");
		} while (number <= 0);
		for(int counter = number; counter > 0; counter-- ) {
			sum = sum + counter; 
			System.out.println("Summation in progress...Only " +counter+ " more to go!");
			System.out.println("\r");
		}
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("  Thank you for waiting. " + '"'+sum+'"' + " is the answer!                                      ");
		System.out.println("-------------------------------------------------------------------------------------------------");
	}
}	
