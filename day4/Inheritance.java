public class Inheritance{
	
	public static void main (String[] args){
		
		System.out.println("Exercise 4.4: Program to demonstrate the Java Inheritance with all Inheritance Types and Super Keyword.");
		
		A a = new A();
		
		B b = new B();
		System.out.println("Contents accessible by class B");
		b.printA("Base class A");
		b.printB("Derived class B");
		System.out.println("Example for Single Inheritance.\n");
		
		C c = new C();
		System.out.println("Contents accessible by class C");
		c.printA("Base class A");
		c.printB("Class B derived from A");
		c.printC("Class C derived from B");
		System.out.println("Example for Multilevel Inheritance.\n");
		
		D d = new D();
		System.out.println("Contents accessible by class D");
		d.printA("Base class A");
		d.printD("Class D derived from A");
		
		E e = new E();
		System.out.println("Contents accessible by class E");
		e.printA("Base class A");
		e.printE("Class E derived from A");		
		System.out.println("Example for Hierarchical Inheritance.\n");
		
	}
	
}

class A {
	public void printA(String message){
		System.out.println(message);
	} 	
}

class B  extends A {
	public void printB(String message){
		System.out.println(message);
	}
}

class C extends B {
	public void printC(String message){
		System.out.println(message);
	}
}

class D extends A {
	public void printD(String message){
		System.out.println(message);
	}
}

class E extends A {
	public void printE(String message){
		System.out.println(message);
	}
}