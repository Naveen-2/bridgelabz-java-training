public class MultipleInterfaces{
		
	public static void main (String[] args){
		
		System.out.println("Exercise 5.4:  Program that demonstrates multiple interfaces.");
		C c = new C();
		c.run();
		c.sit();
	}	
}

interface A{  
    void run();  
}  
 
interface B{  
    void sit();  
}  
 
class C implements A,B{  
    public void run(){       
        System.out.println("Overrides run() function in interface A.");
    }  
    public void sit(){        
        System.out.println("Overrides sit() funtion in interface B.");
    }  
}
  