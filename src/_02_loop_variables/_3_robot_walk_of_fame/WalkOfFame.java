
package _02_loop_variables._3_robot_walk_of_fame;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
rob.setX(100);
		// 2. Make the robot draw a star shape. Hint: angle=144.
rob.penDown();
rob.setPenColor(Color.BLUE);
rob.setSpeed(500);
		// 3. Set the length of each line in the star to 30.
for (int i = 0; i < 5; i++) {
	rob.move(30);
	rob.turn(144);
	
	
}
rob.hide();
//rob.setSpeed(99);
//rob.turn(45);
//rob.move(150);
//rob.turn(-90);
//rob.move(150);
//rob.turn(131);
//rob.move(150);
//rob.turn(-90);
//rob.move(70);
//rob.turn(140);
//rob.move(70);
//rob.turn(50);
//rob.turn(-90);
//rob.move(150);
//rob.turn(120);
//rob.move(150);
//rob.turn(-80);
//rob.move(120);
//rob.turn(150);
//rob.move(120);
//rob.turn(-40);
//rob.move(1920);

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
