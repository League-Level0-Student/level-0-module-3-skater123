
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot alex_mendoza = new Robot();
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		alex_mendoza.setPenColor(27,172,235);
		alex_mendoza.setSpeed(20);
		alex_mendoza.setPenWidth(10);
		alex_mendoza.penDown();
	alex_mendoza.move(219);
	alex_mendoza.turn(90);
	alex_mendoza.move(99);
	alex_mendoza.turn(90);
	alex_mendoza.move(219);
	alex_mendoza.turn(90);
	alex_mendoza.move(99);
		//3. Set the pen width to 10
	
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
	
	
	
	
	
	
	
	

	}
}
