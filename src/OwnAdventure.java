import javax.swing.JOptionPane;

import _01_else_if._4_are_you_happy.Main;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "I am goingto be walking tthrough this forest");
		int answer = JOptionPane.showConfirmDialog(null,
				"Uh oh looks like this theres this guy here and " + "he asked me if i want candy hey do u want candy");
		if (answer == 0) {
			JOptionPane.showMessageDialog(null, "wow he  didnt kidnap me he  just wanted to give me candy");
			
			
			
			
		} else if (answer == 1) {
			JOptionPane.showMessageDialog(null, "you should take the candy");
		} else {
			JOptionPane.showMessageDialog(null, "hey you shouldn't cancel!");
			
			JOptionPane.showMessageDialog(null, "uh oh i think there is a ravenous fox");
			
		}
	}
}