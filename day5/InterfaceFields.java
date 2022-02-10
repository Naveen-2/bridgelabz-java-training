public class InterfaceFields{
	
	public static void main (String[] args){
		
		System.out.println("Exercise 5.2: Program to access the interface fields.");
		B b = new B();     
        System.out.println("Speed in interface A: " + A.speed);
        System.out.println("Speed in class B: " + B.speed); 
		b.run();
		b.sit();
	}	
}


interface A{ 
   public static int speed = 30;       
   public void run();
} 
 
class B implements A{  
   public static int speed = 10;     
   public void run() {
      System.out.println("Method run() declared in interface A and overrided in class B.");
   }
   public void sit() {
      System.out.println("Method sit() declared and implemented in class B only.");
   }
} 
   