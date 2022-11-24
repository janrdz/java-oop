/*
 * basically you get a discount if the price is more than $300USD
 */

package conditionals;

import javax.swing.JOptionPane;

public class MegaPlaza {
	public static void main(String[] args)
	{
		float payment, discount;
		
		payment = Float.parseFloat(JOptionPane.showInputDialog("Enter the amount to pay: "));
		
		if(payment > 300)
		{
			discount = payment * 0.20f;
			payment -= discount;
			JOptionPane.showMessageDialog(null, "You were elegible for a 20% discount. Enjoy!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry mate, no discount for you. Here, have a Cherry 🍒");
		}
	}
}