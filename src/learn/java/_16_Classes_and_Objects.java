package learn.java;

public class _16_Classes_and_Objects {

	public static void main(String[] args) {
		
		Car maruti = new Car();
		Car benz = new Car ();
		Car bmw = new Car ();
		
		maruti.model = "Swift VDI";
		maruti.cost = 800000;
		maruti.color = "Red";
		maruti.startCar();
		maruti.stopCar();
		maruti.carDetails();
		
		benz.model="A Class";
		benz.cost=3500000;
		benz.color="Black";
		benz.startCar();
		benz.stopCar();
		benz.carDetails();
		
		bmw.model="Classic";
		bmw.cost=4000000;
		bmw.color="Blue";
		bmw.startCar();
		bmw.stopCar();
		bmw.carDetails();
		
		
}

}

class Car {

	String model;
	int cost;
	String color;
  		
 public void startCar() {
		System.out.println(model+" car started");
	}
	
	public void stopCar() {
		System.out.println(model+" car stopped");
	}
	
	public void carDetails() {
		System.out.println("Car model "+model);
		System.out.println("Car cost "+cost);
		System.out.println("Car color "+color);
		System.out.println("--------------");
 
	}	
	
}
	