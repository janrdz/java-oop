/*
 * Exercise 3 - Write a program that takes a character as input and evaluate if the character
 * is uppercase or lowercase
 */

package conditionals;

import javax.swing.JOptionPane;

public class readingAChar {
	
	public static void main(String[] args)
	{
		char character;
		String message;
		
		character = JOptionPane.showInputDialog("Enter a letter [caps or no caps]: ").charAt(0);
		
		message = (Character.isUpperCase(character)) ? "The character " + character + " is uppercase" : "The character " + character + " isn't uppercase!";
		
		JOptionPane.showMessageDialog(null, message);
	}
}