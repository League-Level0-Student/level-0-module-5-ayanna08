package _02_nested_loops._3_for_loop_gauntlet;

public class for_loop_gauntlet {
	public static void main(String[] args) {

//Single For Loops
		
//1		 
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
			
		}

//2
		for (int i = 101; i < 0; i++) {
			System.out.println(i);
			
		}	
		
//3
		for (int i = 2; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
//4     
		for (int i = 1; i < 100; i++) {
			if(i % 2 >0) {
				System.out.println(i);
			}
		}
		
//5
		for (int i = 0; i < 501; i++) {
			if(i % 2 >0) {
				System.out.println(i + " is odd.");
			}
			else{
				System.out.println(i + " is even.");
			}
		}
			
//6
		for (int i = 0; i < 778; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}
		
//7 
		for (int i = 2008; i < 2021; i++) {
			System.out.println("In, " + i + " I was " + (i - 2008) + " years old." );
		}
		

//Nested For Loops
		
//1
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.println(j + " " + i);
			}
		}
		
//2
		for (int j = 0; j < 7; j+=3) {
			
			for (int i = 1; i < 4; i++) {
				System.out.print(i + j + " ");
	}
			System.out.println();
}

		
//3
		for (int j = 0; j < 100; j+=10) {
			
			for (int i = 1; i < 11; i++) {
				System.out.print(i + j + " ");
	}
			System.out.println();
}

//4 
		for (int j = 0; j < 7; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		

// **BONUS**
		for (int i = 0; i < 101; i++) {
			System.out.println(100 - i);
		}
		
	}
}