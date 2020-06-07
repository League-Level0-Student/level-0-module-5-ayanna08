package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		
		rob.penDown();
		rob.setSpeed(10);	
		
String color = JOptionPane.showInputDialog("Would you like your shape blue, green, yellow, or red?");
	if(color.equals("blue")) {
		rob.setPenColor(0,0,255);
	}
	
	else if(color.equals("red")) {
		rob.setPenColor(Color.red);
	}
	
	else if(color.equals("yellow")) {
		rob.setPenColor(Color.yellow);
	}
	
	else if(color.equals("green")) {
		rob.setPenColor(Color.green);
	}
		
String shape = JOptionPane.showInputDialog("What shape would you like me to draw?");
	if(shape.equals("square")) {
		drawSquare();
	}
	
	else if(shape.equals("triangle")) {
		drawTriangle();
	}
	
	else if(shape.equals("circle")) {
		drawCircle();
	}
	
	else{
		JOptionPane.showMessageDialog(null, "I don't know this shape");
	}
	
	
}
	
	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(50);
			rob.turn(90);
		}
	}	
	
	public static void drawTriangle() {
			for (int i = 0; i < 3; i++) {
				rob.move(50);
				rob.turn(120);
		}
	}
	
	public static void drawCircle() {
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}
	
}
