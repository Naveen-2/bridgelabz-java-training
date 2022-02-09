import java.util.*;

public class StringEquality{
	static String s1;
	static String s2;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Exercise 1.3: Program to check if two strings are equal or not.");
		System.out.print("Enter value for s1: ");
		s1 = input.nextLine();
		System.out.print("Enter value for s2: ");
		s2 = input.nextLine();
		if(s1.equals(s2)){
			System.out.println("Two strings are equal.");
		} else {
			System.out.println("Two strings are not equal.");
		}
	}
}
