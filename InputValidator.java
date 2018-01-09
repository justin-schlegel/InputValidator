//Input Validation for length and character type.
//Justin Schlegel
//SWENG586_Assignment1

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputValidator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String userInput = null;
		Boolean isInputValid = false;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("|  Enter some text and let it be a string with only alphanumric characters; minimum 8 in length!  |");
			System.out.println("---------------------------------------------------------------------------------------------------");
			userInput = scanner.nextLine();
						
			Pattern alphaNumRegex = Pattern.compile("[^a-zA-Z0-9]");
			boolean hasSpecialChar = alphaNumRegex.matcher(userInput).find();
		
			while (hasSpecialChar == true) {
				System.out.println("Now you've gone and done it all wrong! Alphanumeric only!");
				System.out.println("");
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("|  Enter something and let it be a string with only alphanumric characters; minimum 8 in length!  |");
				System.out.println("---------------------------------------------------------------------------------------------------");
				userInput = scanner.nextLine();
				
				Pattern alphaNumRegex2 = Pattern.compile("[^a-zA-Z0-9]");
				boolean hasSpecialChar2 = alphaNumRegex2.matcher(userInput).find();
				
				if (hasSpecialChar2 == false) {
					hasSpecialChar = false;
				}
			}
			if (userInput.length() < 8 ) {
				System.out.println("Too Short!");
				System.out.println("");
			} else {
				isInputValid = true;	
			}
		} while (isInputValid == false); 
	
		System.out.println("You entered " + '"'+userInput+'"' + ", an excellent choice.");
		scanner.close();
	}
}


