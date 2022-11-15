
/*
		 * Switch sentence :
		 * 
		 * switch(statement)
		 * {
		 *		case 1 : Instruction1;
		 *				 break;
		 *
		 *		case 2 : Instruction2;
		 *				 break;
		 *		...
		 *
		 *		case n : Instruction2;
		 *				 break;
		 *
		 *		default: caseElse
		 *				 break;
		 * }
		 */

package conditionals.examples;

import javax.swing.JOptionPane;

public class switchExample {

	public static void main(String[] args)
	{
		int data;
		data = Integer.parseInt(JOptionPane.showInputDialog("Enter a number -> "));
		
		switch(data)
		{
			case 1 : JOptionPane.showMessageDialog(null, "The number is one."); break; 
			case 2 : JOptionPane.showMessageDialog(null, "The number is two."); break;
			case 3 : JOptionPane.showMessageDialog(null, "The number is three."); break;
			case 4 : JOptionPane.showMessageDialog(null, "The number is fourth."); break;
			case 5 : JOptionPane.showMessageDialog(null, "The number is five."); break;
			default : JOptionPane.showMessageDialog(null, "The number is: " + data); break;
		}
	}	
}