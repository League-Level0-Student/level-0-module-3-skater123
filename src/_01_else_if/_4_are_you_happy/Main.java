package _01_else_if._4_are_you_happy;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Main 
{

	public static void main(String[] args)
	{
		//When you ask.. are you happy? They will response with Yes or No.
		String areYouHappy = JOptionPane.showInputDialog(null,"Hey, are you happy?");
		
		//So potential bug.. hitting cancel... leaves areYouHappy uninitialized..
		
		//String Happy = "Alex is awesome! J/k";
		
		//if()
		if (Objects.nonNull(areYouHappy) && areYouHappy.equalsIgnoreCase("Yes"))
		{
			System.out.println("Alex is awesome");
		}
	}
}