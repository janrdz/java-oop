package operators;

import java.util.Scanner;

public class weeksCalculator {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int totalHours, hours, weeks, days;
		
		System.out.print("Enter the numbers of hours: -> ");
		totalHours = input.nextInt();
		input.close();
		
		weeks = totalHours / 168;
		days = (totalHours % 168) / 24;
		hours = totalHours % 24;
		
		System.out.println("Weeks: " + weeks);
		System.out.println("Days: " + days);
		System.out.println("Hours: " + hours);
	}
}