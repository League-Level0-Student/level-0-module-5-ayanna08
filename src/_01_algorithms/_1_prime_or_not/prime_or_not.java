package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		
		String prime = JOptionPane.showInputDialog("Pick a number under 100...");
		
		int number = Integer.parseInt(prime);
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				JOptionPane.showMessageDialog(null, "The number is not prime");
				System.exit(0);
			}
		}
			JOptionPane.showMessageDialog(null, "The number is prime");
		
	
			
	
	}
}