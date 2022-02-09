public class Encapsulation{
	
	public static void main (String[] args){
		
		System.out.println("Exercise 4.3: Program to demonstrate the Java Encapsulation");
		
		Person person = new Person();
		person.setName("Naveen");
        person.setAge(24);
		
		System.out.println("Person's name: " + person.getName());
        System.out.println("Person's age: " + person.getAge());
		
	}
	
}

class Person {
	
    private String name;
    private int age;
	/*name and age can't be accessed directly from 
	outside class as it uses private access specifier.*/
	//Below funtions can be used to access these private variables.
    public int getAge(){
		return age; 
	}
 
    public String getName(){
		return name; 
	}
 
    public void setAge(int newAge){
		age = newAge; 
	}
 
    public void setName(String newName){
        name = newName;
    }
	
}