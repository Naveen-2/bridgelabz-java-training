public class ShapeAbstractClass{
	
	public static void main (String[] args){
		
		System.out.println("Exercise 5.9: Program where the shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.");
		
		Shape r = new Rectangle();
		r.draw();  
		Shape c = new Circle();
		c.draw();
	}	
}
abstract class Shape{  
	abstract void draw();  
}  
class Rectangle extends Shape{  
	void draw(){
		System.out.println("Draw rectangle");
	}  
}  
class Circle extends Shape{  
	void draw(){
		System.out.println("Draw circle");
	}  
}  