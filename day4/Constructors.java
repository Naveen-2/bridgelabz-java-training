public class Constructors{
	
	public static void main (String[] args){
		System.out.println("Exercise 4.1: Program to define the Default constructor (no-arg constructor) and Parameterized constructor.");
		DefaultConstructor constructor1 = new DefaultConstructor();
		System.out.println("Name: " + constructor1.name + "  Age: " + constructor1.age);
		ParameterizedConstructor constructor2 = new ParameterizedConstructor("Naveen", 24);
		System.out.println("Name: " + constructor2.name + "  Age: " + constructor2.age);
	}
}

class DefaultConstructor{
	String name;
	int age;
	
	DefaultConstructor(){
		System.out.println("Default Constructor called. So default values are printed");		
	}
}

class ParameterizedConstructor{
	String name;
	int age;
	
	ParameterizedConstructor(String name, int age){
		this.name = name;
        this.age = age;
		System.out.println("Parameterized Constructor called. So parameter values can be printed");		
	}
}