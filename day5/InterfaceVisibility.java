public class InterfaceVisibility{
	
	public static void main (String[] args){
		
		System.out.println("Exercise 5.1: Program to demonstrate the interface method visibility.");
		B b = new B();     
        b.printA();                   
	}	
}

interface A{ 
    void printA(); 
} 
 
class B implements A{  
    public void printA(){ 
        System.out.println("Class B printA() invoked"); 
    } 
} 
   