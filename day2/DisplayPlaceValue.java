import java.util.*;

public class DisplayPlaceValue{
	
	public static void main (String[] args){
		System.out.println("Exercise 2.1.2: Read a Number 1,10,100,1000 and display unit, ten hundred");
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int units, tens, hundreds, thousands;
		units = N % 10;
		tens = ((N/10) % 10);
		hundreds = ((N/100) % 10);
		thousands = ((N/1000) % 10);
		if(units != 0)
			System.out.println("Units value is " + units + ".");
		else
			System.out.println("Units value is zero");
		if(tens != 0)
			System.out.println("Tens value is " + tens + ".");
		else
			System.out.println("Tens value is zero");
		if(hundreds != 0)
			System.out.println("Hundreds value is " + hundreds + ".");
		else
			System.out.println("Hundreds value is zero");
		if(thousands != 0)
			System.out.println("Thousands value is " + thousands + "."); 		
		else
			System.out.println("Thousands value is zero");
	}
	
}