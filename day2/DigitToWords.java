import java.util.*;

public class DigitToWords{
	public static void main (String[] args){
		System.out.println("Exercise 2.1.1: Read a single Digit Number and write in word");
		System.out.print("Enter a single digit integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.print("The entered digit is ");
		printValueInWord(number);
	}
	
	static void printValueInWord (int digit){
		if(digit == 0)
			System.out.print("Zero");
		else if (digit == 1)
			System.out.print("One");
		else if (digit == 2)
			System.out.print("Two");		
		else if (digit == 3)
			System.out.print("Three");		
		else if (digit == 4)
			System.out.print("Four");		
		else if (digit == 5)
			System.out.print("Five");		
		else if (digit == 6)
			System.out.print("Six");		
		else if (digit == 7)
			System.out.print("Seven");		
		else if (digit == 8)
			System.out.print("Eight");
		else if (digit == 9)
			System.out.print("Nine");		
	}
	
}