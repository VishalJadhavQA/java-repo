package learn.java;

 /* initialization of variables without using constructors */

public class _24_Constructors_01 {

	public static void main(String[] args) {
		
		DemoCar maruti = new DemoCar();
		DemoCar benz = new DemoCar();
		DemoCar audi = new DemoCar();
		
		maruti.carModel = "Swift";
		maruti.cost = 800000;
		maruti.milage = 25;
		
		maruti.CarDetails();
		
		
		benz.carModel = "Benz Class A";
		benz.cost = 3000000;
		benz.milage = 10;
		
		benz.CarDetails();
		
		audi.carModel = "Audi A Plus";
		audi.cost = 4000000;
		audi.milage = 15;
		
		audi.CarDetails();
	
	}

}


   class DemoCar {
	
	String carModel;
	int cost;
	double milage;
	
	public void CarDetails() {
		
		System.out.println("The model of car is "+carModel);
		System.out.println("The cost of car is "+cost);
		System.out.println("The milage of car is "+milage);
		System.out.println("----------------------------------");
		
		}
	}