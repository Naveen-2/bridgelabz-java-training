import java.util.*;

public class ArithmeticAndMinMax{
	
	public static void main (String[] args){
		System.out.println("Exercise 2.5.1: Program to find Arithmetic value and Min Max value of result");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a, b and c:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int[] expression = {0,0,0,0};
		expression[0] = a + b * c;
		expression[1] = c + a / b;
		expression[2] = a % b + c;
		expression[3] = a * b + c;
		System.out.println("Value of a + b * c is " + expression[0]);
		System.out.println("Value of c + a / b is " + expression[1]);
		System.out.println("Value of a % b + c is " + expression[2]);
		System.out.println("Value of a * b + c is " + expression[3]);
		Arrays.sort(expression);
		System.out.println("Minimum value from the list is " + expression[0]);
		System.out.println("Maximum value from the list is " + expression[expression.length - 1]);
    }
	
}