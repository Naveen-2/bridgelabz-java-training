
import java.lang.Math;

public class Quadratic{
	
	public static void main (String[] args){
		System.out.println("Exercise 2.5.3: Program to find the roots of the equation a*x*x + b*x + c");
		double a = 2, b = 6, c = 1;
		double root1=0, root2=0;
		double delta = (b * b) - (4 * a * c);
		root1 = (-b + Math.sqrt(delta)) / (2 * a);
		root2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("root1 = " + root1 + " and root2 = " + root2 );

	}
	
}


//4.6