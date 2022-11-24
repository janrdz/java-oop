package conditionals;

import javax.swing.JOptionPane;

public class greaterNumber {
	
	public static void main(String[] Args)
	{
		int number1, number2;
		String message;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
		
		message = (number1 > number2 == true) ? " The number " + number1 + " is greater than " + number2 + "!" : "The number " + number1 + " is lower than " + number2 + "!";
		
		JOptionPane.showMessageDialog(null, message);
	}
}