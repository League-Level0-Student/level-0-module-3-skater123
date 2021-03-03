package _01_else_if._4_are_you_happy;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Main 
{

	public static void main(String[] args)
	{
		//When you ask.. are you happy? They will response with Yes or No.
		String areYouHappy = JOptionPane.showInputDialog(null,"are u happy?");
		
		//So potential bug.. hitting cancel... leaves areYouHappy uninitialized..
		
		//String Happy = "Alex is awesome! J/k";
		
		//if()
		if (Objects.nonNull(areYouHappy) && areYouHappy.equalsIgnoreCase("Yes"))
		{
			//System.out.println("Alex is awesome");
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			
			
			//Next prompt if the user says yes they are happy.
		} else {
						
			//Prompt for "Do you want to be happy?"
			String doYouWantToBeHappy =	JOptionPane.showInputDialog(null,"do u want to be happy");
			
			if(doYouWantToBeHappy.equalsIgnoreCase("Yes")) 
			{
				JOptionPane.showMessageDialog(null, "keep doing whatever your doin");
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Change something");
			}
		}
	}
}