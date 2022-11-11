
/* Section 2 - Operators
 * Author: Jan Rodríguez	
 * Source: Alejandro M. Taboada Sánchez
 * 
 * Objective: A car dealer company sells used vehicles. They pay to their personal
 * a minimum wage of $1k per month, plus a commission of $150 per every car selled,
 * plus the 5% of the car value. Each month the boss inputs the pertinent data to the
 * computer. Write a program that calculates and displays the monthly wage of the given vendor.			  
 *   
 * Note: This exercise is a bit redundant          
 *  
 */

package operators;

import java.util.Scanner;

public class wageDealer {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final int wage = 1000;
		int selledCars;
		float carCost, totalWage;
		
		System.out.print("Enter the total of selled cars: -> ");
		selledCars = input.nextInt();
		System.out.print("Enter the cost of the cars: -> ");
		carCost = input.nextFloat();
		
		totalWage = wage + (selledCars * 150) + (0.05f * carCost * selledCars);
		
		System.out.println("The payment of the employee is: $" + totalWage);
		input.close();
	}	
}
