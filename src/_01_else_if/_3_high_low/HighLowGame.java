
package _01_else_if._3_high_low;

import java.util.Random;
import javax.swing.*;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int x = 1+ new Random().nextInt(100);
		
		// 2. Print out the random variable above

		System.out.println(x);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String high_low = JOptionPane.showInputDialog("geuss");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))

			int y =Integer.parseInt(high_low); 
			
			// 5. if the guess is correct
			if (x == y) {
				JOptionPane.showMessageDialog(null,"OMG U JUST WON");
				System.exit(0);
			}
			
	
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			else if (x < y) {
				JOptionPane.showMessageDialog(null,"sorry thats way to high");
			}
			
			// 7. if the guess is high
				// 8. Tell them it's too high
			
			else if (x > y)
				JOptionPane.showMessageDialog(null,"dude thats too low");
			{
//ok
				///ok
				//ok
				//ok//ok
				//0k
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
			}	
		}
		JOptionPane.showMessageDialog(null,"U LOSE LOL ");
		
	}

}
