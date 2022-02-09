public class Polymorphism{
	
	public static void main (String[] args){
		
		System.out.println("Exercise 4.4: Program to demonstrate the Polymorphism with types method overloading andmMethod overriding.");
		System.out.println("Method Overloading Example");
		System.out.println("Result 1: "+Arithmetic.multiply(5,9)+"\nResult 2: "+Arithmetic.multiply(2,9,7)+"\nResult 3: "+Arithmetic.multiply(5.34,9.78)+"\nResult 4: "+Arithmetic.multiply(5.34,9.78,5.87));		
		System.out.println("multiply Method is overloaded");
		
		System.out.println("Method Overriding Example");
		A a;
 
        a = new B();
        a.Print();
 
        a = new C();
        a.Print();
		System.out.println("Print Method is overrided");
	}	
}

class Arithmetic {
	
	//Here method multiply is overloaded based on input parameters 
	public static int multipy(int a, int b){
		return a * b;
	} 	
	public static double multiply(double a, double b){
		return a * b;
	}
	public static int multiply(int a, int b, int c){
		return a * b * c;
	}
	public static double multiply(double a, double b, double c){
		return a * b * c;
	}
	
}


class A {
    void Print(){
        System.out.println("Base class A");
    }
}
 
class B extends A {
    void Print(){ 
		System.out.println("Class B derived from class A"); 
	}
}
 
class C extends A {
    void Print(){ 
        System.out.println("Class C derived from class A");
    }
}
 