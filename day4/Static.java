public class Static{
	
	static int a = 5;
    static int b;
      
    static {
        System.out.println("Static block initializes the variable b before executing main funtion.");
        b = a * 10;
    }
	public static void main (String[] args){
		System.out.println("Exercise 4.2: Program to demonstrate the use of the static variable, blocks.");
		System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
	}
	
}
