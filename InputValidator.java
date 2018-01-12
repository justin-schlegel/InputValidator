//Input Validation for length and character type.
//Justin Schlegel
//SWENG586_Assignment1

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		String userInput = null;
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("| Type 'quit' to exit                                                                             |");
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------------------------");	
			System.out.println("|  Enter some text and let it be a string with only alphanumeric characters; minimum 8 in length! |");
			System.out.println("---------------------------------------------------------------------------------------------------");
			userInput = scanner.nextLine();

			if ("quit".equalsIgnoreCase(userInput)) {
				System.out.println("Goodbye!");
				scanner.close();
				System.exit(0);
			}
			boolean isInputValid = userInput.matches("[a-zA-Z0-9]{8,}$");
			
			if (isInputValid) System.out.println("You entered " + '"'+userInput+'"' + ", an excellent choice.");
			else System.out.println("Now you've gone and done it all wrong! Enter 8 or more alphanumeric characters!");
		}
	}
}
