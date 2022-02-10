public class InterfaceUsingAbstractClass{
	
	public static void main (String[] args){
		
		System.out.println("Exercise 5.10: Program to implement the Interface using Abstract Class.");
		
		C testObject = new C();
  
        testObject.printA();
        testObject.printB();
        testObject.printC();
	}	
}

interface A {
    void printA();
    void printB();
    void printC();
}
  
abstract class B implements A {
  
    @Override public void printA(){
        System.out.println("PrintA funtion executed.");
    }
    @Override public void printB(){
        System.out.println("PrintB funtion executed.");
    }
}

class C extends B {
    @Override public void printC(){
        System.out.println("PrintC funtion executed.");
    }
}
