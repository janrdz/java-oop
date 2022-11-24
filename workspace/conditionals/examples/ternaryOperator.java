package conditionals;

import javax.swing.JOptionPane;

public class ternaryOperator {
	
	public static void main(String[] args)
	{
		int number;
		String message;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		
		message = (number % 2 == 0) ? "It is an even number" : "It is an odd number";
		
		JOptionPane.showMessageDialog(null, message);
	}
}
