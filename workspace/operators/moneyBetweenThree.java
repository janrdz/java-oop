
/* Section 2 - Operators
 * Author: Jan Rodríguez	
 * Source: Alejandro M. Taboada Sánchez
 * 
 * Objective: Guillermo as "N" bucks. Luis has the half of Guillemo's bucks.
 * 			  Juan as the half of Luis and Guillermo combined. Write a program 
 *            that calculates and displays the amount of money that they have.
 */

package operators;

import java.util.Scanner;

public class moneyBetweenThree {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // Creating the scanner input
		
		int guillermoBucks, luisBucks, juanBucks, total; 
		
		System.out.print("How many bucks does Guillermo has? -> "); // Asking how much bucks does Guillermo has
		
		guillermoBucks = input.nextInt(); // Storing the quantity of Guillermo bucks in guillermoBucks
		
		System.out.println("Guillermo has: $" + guillermoBucks); // Displaying how much bucks does Guillermo has

		luisBucks = guillermoBucks / 2; // Calculating the amount of bucks that Luis has
		System.out.println("Luis has: $" + luisBucks); // Displaying the amount of bucks that Luis has
		
		juanBucks = (luisBucks + guillermoBucks) / 2; // Calculating the amount of bucks that Juan has
		System.out.println("Juan has: $" + juanBucks);

		total = guillermoBucks + luisBucks + juanBucks; // Calculating the sum of everyone of them
		
		System.out.println("The total of money between all of them is: $" + total); // Displaying the total
		input.close();
	}
}
