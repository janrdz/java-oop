
/**
 * Exercise 1: Write a program that reads an integer number and shows if such number
 * is multiple of 10
 */ 

package conditionals;

import javax.swing.JOptionPane;

public class multipleOf10 {

	public static void main(String[] args)
	{		
		int number;
		String message;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		
		message = (number % 10 == 0) ? "The number is a multipler for 10" : "The number isn't a multiper for 10";
	
		JOptionPane.showMessageDialog(null, message);
	}
}