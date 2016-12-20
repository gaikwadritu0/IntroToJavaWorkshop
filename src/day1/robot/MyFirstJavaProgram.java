package day1.robot;

import java.awt.Color;
import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Ritu=new Robot();
Ritu.setSpeed(150);
Ritu.move(80);
Ritu.sparkle();
Ritu.move(50);
Ritu.setPenColor(78,0,255);
Ritu.penDown();
for (int i = 0; i < 4; i++) {
Ritu.move(100);
Ritu.turn(90);
	
}


}

}