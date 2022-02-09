import java.util.*;

public class LeapYear {
	public static void main(String args[]){		
		System.out.println("Exercise 1.6: Program to leap year or not.");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		boolean leap_year = false;

		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0)
					leap_year = true;
				else
					leap_year = false;
			} else
				leap_year = true;
		} else
		    leap_year = false;
		if (leap_year)
			System.out.println("The entered year is leap year.");
		else
			System.out.println("The entered year is not a leap year.");
	}	
}

