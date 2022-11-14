
// Exercise 8

package operators;

import java.util.Scanner;

public class quadraticFormula {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double root1, root2, b, a, c;
		
		System.out.print("Enter the value of a: -> ");
		a = input.nextDouble();
		
		System.out.print("Enter the value of b: -> ");
		b = input.nextDouble();
		
		System.out.print("Enter the value of c: -> ");
		c = input.nextDouble();
		input.close();
		
		root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * (a * c)) / 2 * a);
		root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * (a * c)) / 2 * a);
		
		System.out.print("The result of Root 1 is: " + root1);
		System.out.print("\nThe result of Root 2 is: " + root2);
		
	}
}
