
/*
 * 	== : Equality
 * 	!= : Difference
 * 	>  : Greater than
 *  >= : Greater or equal than
 *  <  : Less than
 *  <= : Less or equal than
 */

package conditionals.examples;

import javax.swing.JOptionPane;

public class ifExample {

	public static void main(String[] args)
	{		
		int number, data = 5;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		
		if(number != data)
		{
			JOptionPane.showMessageDialog(null, "The number is different from 5");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The number you typed is 5.");
		}
	}
}