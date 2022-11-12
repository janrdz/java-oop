package operators;

import java.util.Scanner;

public class finalGrade {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		float participation, firstGrade, secondGrade, thirdGrade, finalGrade;
		
		System.out.print("Enter your participation grade (from 0 to 100) -> ");
		participation = input.nextFloat();
		
		System.out.print("Enter your first exam grade (from 0 to 100) -> ");
		firstGrade = input.nextFloat();
		
		System.out.print("Enter your first second grade (from 0 to 100) -> ");
		secondGrade = input.nextFloat();
		
		System.out.print("Enter your first third grade (from 0 to 100) -> ");
		thirdGrade = input.nextFloat();
		input.close();
		
		// Weight of every grade
		participation *= 0.10f;
		firstGrade *= 0.25f;
		secondGrade *= 0.25f;
		thirdGrade *= 0.40f;
		
		// Calculating the final grade
		finalGrade = (participation + firstGrade + secondGrade + thirdGrade);
		
		// Displaying the final grade
		System.out.print("Your final grade is: " + finalGrade);		
	}
}