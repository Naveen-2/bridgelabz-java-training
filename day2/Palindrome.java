import java.util.*;

public class Palindrome{
	
	public static void main (String[] args){
		System.out.println("Exercise 2.3.3: Program to find Palindrome Number");
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int n = N, reverse = 0, remainder;
		for(;N != 0;){  
			remainder = N % 10;  
			reverse = reverse * 10 + remainder;  
			N = N/10;  
		} 	
		if (n == reverse)
			System.out.println("The entered number is palindrome.");
		else
			System.out.println("The entered number is not palindrome.");
	}
	
}