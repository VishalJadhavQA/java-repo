package learn.java;

public class _25_Constructors_02 {

	public static void main(String[] args) {
		
		Cars maruti = new Cars("Swift",800000,25);
		maruti.CarDetails();
		
		Cars benz = new Cars("Benz Class A",3000000,10);
		benz.CarDetails();
		
		Cars audi = new Cars("Audi A Plus",4000000,15);
		audi.CarDetails();
		

	}

}

class Cars {
	
	String carModel;
	int cost;
	double milage;
	
	public Cars(String carModel,int cost,double milage){  // Parameterized constructor
		
	/*differentiate the instance variable with the parameterized values*/
		/* this keyword is assigned to instance variable*/
		
		this.carModel = carModel; 
		this.cost = cost;
		this.milage = milage;
			
	}
	
	
	public void CarDetails() {
		
		System.out.println("The model of car is "+carModel);
		System.out.println("The cost of car is "+cost);
		System.out.println("The milage of car is "+milage);
		System.out.println("----------------------------------");
		
		}
	}