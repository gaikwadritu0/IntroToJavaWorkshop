// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		int number= new Random().nextInt(4);
		System.out.println(number);
		JOptionPane.showInputDialog("Ask me a question ");
		if (number==0){
			System.out.println("Yes");
		}
			
			if (number==1){
				System.out.println("No");
			}if(number==2){
					System.out.println("Maybe you should ask Google?");
				}
				if(number==3){
					JOptionPane.showMessageDialog(null, "yay");
			
	}
			
		}
	}

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer


