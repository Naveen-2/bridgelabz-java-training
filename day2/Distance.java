
import java.lang.Math;
public class Distance{
	
	public static void main (String[] args){
		System.out.println("Exercise 2.5.4: Program to find Euclidean distance from the point");
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double Distance = 0;
		Distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		System.out.println("Euclidean Distance between the point and origin is " + Distance);
	}
	
}