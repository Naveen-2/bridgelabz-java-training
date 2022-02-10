public class InterfaceInheritance{
		
	public static void main (String[] args){
		
		System.out.println("Exercise 5.5:  Program to implement interface inheritance.");
		C c = new C();
		c.run();
		c.sit();
	}	
}

interface A{  
    void run();  
}  
 
interface B extends A{  
    void sit();  
}  
 
class C implements B{  
    public void run(){       
        System.out.println("Overrides run() function in interface A.");
    }  
    public void sit(){        
        System.out.println("Overrides sit() funtion in interface B.");
    }  
}
  