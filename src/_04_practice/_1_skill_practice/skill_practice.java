package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skill_practice {
	public static void main(String[] args) {

		skill_practice skills = new skill_practice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String cents = JOptionPane.showInputDialog("How many dimes do you have");
		int dimes = Integer.parseInt(cents);


		// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, "You have " + dimes*10 + " cents.");



		// Ask the user how tall they are (inches)
		String inches = JOptionPane.showInputDialog("How tall are you in inches?");
		int height = Integer.parseInt(inches);



		// If they are shorter than 36 inches, tell them to eat their Wheaties
		
		if(height<=36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties!!");
		}
			

		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
							
			for (int i = 3; i < 31; i++) {
				if(i % 3 == 0) {
					System.out.println(i);
				}
			}
}
		


void skill3() { // Get a random number that is less than 20 and print it to the console
			Random randy = new Random();
			int num =  randy.nextInt(21);
			System.out.println(num);

// Get another random number that is less than 10 and print it to the console
			Random mandy = new Random();
			int scum =  mandy.nextInt(21);
			System.out.println(scum);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
			JOptionPane.showMessageDialog(null, "The difference between the two numbers is " + ( num-scum) );
			


}

void skill4() { // In a pop-up, ask the user for the city they live in
			String city = JOptionPane.showInputDialog("Which city do you live in?");


// If they answered "San Diego", tell them they live in America's Finest City
			if(city.equals ("San Diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's Finest City!!");
			}


// Otherwise, tell them to move to San Diego
			else {
				JOptionPane.showMessageDialog(null, "You should move to San Diego!!");
			}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
			
			

// If there is 1 car, use a pop-up to display the make/model of the car



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



}

void skill5() { // In a pop-up, ask the user for the name of their school
			String school = JOptionPane.showInputDialog("What is the name of your school?");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
			JOptionPane.showMessageDialog( null, school + " is a fantastic school");


}
}
