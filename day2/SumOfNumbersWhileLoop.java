import java.util.*;

public class SumOfNumbersWhileLoop{
	
	public static void main (String[] args){
		System.out.println("Exercise 2.2.1: Program for the sum of n natural numbers using While loop");
		System.out.print("Enter a value for N: ");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int sum = 0, i = 1;
		while(i <= N){
			sum += i;
			i++;
		}
		System.out.print("Sum of first " + N + " natural numbers is " + sum);
	}
	
}