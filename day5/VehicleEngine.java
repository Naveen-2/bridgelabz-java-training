
public class VehicleEngine implements Engine{
	
	int speed = 0;
	int gear = 0;
	
	public void gearUp(int a){
		this.gear += a;
		System.out.println("Vehicle is in gear " + gear + ".");
	}
	
	public void gearDown(int a){
		this.gear -= a;
		if(this.gear < 0)
			this.gear = 0;
		System.out.println("Vehicle is in gear " + gear + ".");
	}
	
	public void accelerate(int a){
		this.speed += a;
		System.out.println("Vehicle is in speed " + speed + ".");
	}
	
	public void decelerate(int a){
		this.speed -= a;
		if(this.speed < 0)
			this.speed = 0;
		System.out.println("Vehicle is in speed " + speed + ".");
	}
	
	public static void main (String[] args){
		
		System.out.println("Exercise 5.6:  Program that designing a vehicle's engine using an interface that is implemented in Class.");
		VehicleEngine bikeEngine = new VehicleEngine();
		
		bikeEngine.gearUp(4);
		bikeEngine.accelerate(65);
		bikeEngine.gearDown(1);
		bikeEngine.decelerate(20);
		
	}	
	
}


interface Engine{
	 
	void gearUp(int a);
	void gearDown(int a);
	void accelerate(int a);
	void decelerate(int a);
	
}