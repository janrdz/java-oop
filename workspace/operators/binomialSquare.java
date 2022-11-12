package operators;

import java.util.Scanner;

public class binomialSquare {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int a, b, result;
		
		System.out.print("Enter the value of a -> ");
		a = input.nextInt();
		System.out.print("Enter the value of b -> ");
		b = input.nextInt();
		input.close();
		
		result = (a * a) + 2 * (a * b) + (b * b);
		
		System.out.print("The result is: " + result);
	}
}