public class MethodCalls{
	int test;
	void MethodCalls(){
		test=0;
	}
	public static void main (String[] args){
		int a = 5;
        int b = 10;
 		
		System.out.println("Exercise 5.8: Program that demonstrates the Pass by Value and Pass by Reference method.");
		System.out.println("Call by Value Example:");
		System.out.println("Value of the a " + a);
        System.out.println("Value of the b " + b);
		
		System.out.println(callByValueSwap(a,b));
		
		System.out.println("Value of a after callByValueSwap " + a); 
        System.out.println("Value of b after callByValueSwap " + b);
		
		System.out.println("Call by Reference Example:");
		
		MethodCalls object = new MethodCalls();
		
		System.out.println("Test value before increasing is " + (object.test));
 
        increaseValue(object);
 
        System.out.println("Test value after increasing is " + (object.test));
	}
	
	static int callByValueSwap(int a,int b){ 
		int temp = a;
		a = b;	 
		b = temp;
 
		System.out.println("Value of a in callByValueSwap function " + a);	 
		System.out.println("Value of b in callByValueSwap function " + b);			
		return 1;
	}
	
	static void increaseValue(MethodCalls object){
		object.test++; 
	}
	
}