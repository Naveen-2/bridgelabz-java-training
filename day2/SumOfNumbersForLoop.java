import java.util.*;

public class SumOfNumbersForLoop{
	
	public static void main (String[] args){
		System.out.println("Exercise 2.3.1: Program for the sum of n natural numbers using For loop");
		System.out.print("Enter a value for N: ");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int sum = 0, i;
		for(i = 0; i <= N; i++){
			sum += i;
		}
		System.out.print("Sum of first " + N + " natural numbers is " + sum);
	}
	
}