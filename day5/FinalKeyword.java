public class FinalKeyword{
	final int age = 24; //will give compile time error. Acts as constant.
	void changeAge(){
		age = 20;
	}
	
	final void sit(){
		System.out.println("Sitting");
	}
	
	public static void main (String[] args){
		
		System.out.println("Exercise 5.7:  Program that demonstrates the final keyword - final variable, final method, and final class.");
		
		D d = new D();
		d.test;  //compile time error. Class C cannot be extended
	}	
}

class TestClass extends FinalKeyword{
	void sit(){
		System.out.println("Standing"); // compiler error. sit() cannot be overrided
	}
}

final class C{
	
}

class D extends C{
	void test(){
		System.out.println("test");
	}
}