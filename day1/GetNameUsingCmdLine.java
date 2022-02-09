import java.util.*;

public class GetNameUsingCmdLine {
	public static void main(String args[]) {
		System.out.println("Exercise 1.5: To get the name using the command line.");		
		Scanner input = new Scanner(System.in);
		System.out.print("The entered name is");
		for (int i = 0; i < args.length; i++ ){
			System.out.print(" " + args[i]);
		}
		System.out.print(".");
	}
}
