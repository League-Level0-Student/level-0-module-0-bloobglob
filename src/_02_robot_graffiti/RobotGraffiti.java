package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
			Robot bob = new Robot();
			bob.moveTo(100, 100);
			bob.hide();
			bob.penDown();
			bob.setSpeed(100);
			bob.turn(180);
			bob.move(200);
			bob.turn(-90);
			bob.move(100);
			bob.moveTo(215, 100);
			bob.setAngle(180);
			bob.move(200);
			bob.moveTo(315, 100);
			bob.move(200);
			bob.moveTo(215, 200);
			bob.setAngle(90);
			bob.move(100);
			}
	}

	

