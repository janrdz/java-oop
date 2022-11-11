
/* Section 2 - Operators
 * Author: Jan Rodríguez	
 * Source: Alejandro M. Taboada Sánchez
 * 
 * Objective: Write a program that calculates and prints an 
 * 			  employee's weekly wage from their weekly hours worked and 
 *            their hourly wage
 */

package operators;

import java.util.Scanner;

public class weekSalary {

	public static void main(String[] args)
	{
		float minimumWage = 8.25f; 								// Puerto Rico's minimum wage
		float hoursWorked, payment; 							// Declaring variables to store the payment and hoursWorked
		
		Scanner input = new Scanner(System.in); 				// Creating the scanner
		
		System.out.print("Enter the amount of hours: ");		// Displaying an output 
		hoursWorked = input.nextFloat();						// Storing the ammount in hoursWorked
		
		payment = hoursWorked * minimumWage; 					// Calculating the payment
		
		System.out.println("Your payment is: $" + payment); 	// Print the payment
		input.close();											// Closing the scanner
	}
	
}
