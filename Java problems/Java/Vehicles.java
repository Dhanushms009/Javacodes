class Vehicle
{
	void drive()
	{
		System.out.println("Drive the car");
	}
}

class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Repair the car");
	}
}

class Vehicles
{
	public static void main(String[] args){
		//Vehicle v = new Vehicle();
		Vehicle c = new Car();
		//v.drive();
		c.drive();
	}
}