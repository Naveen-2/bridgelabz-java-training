import java.util.*;

public class StaticKeyword {
	System.out.println("Exercise 1.6: Program to demonstrate static variables, methods, and blocks.");
	static int x = 12;
	static int y;
	static void func(int z) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}
	
	public static void main(String args[]) {
		func(20);
	}
	
	static {
		//System.out.println("Static initialization block.");
		y = x + 11;
	}
	
}

