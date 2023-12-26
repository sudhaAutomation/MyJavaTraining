package oops;

public class Audi extends Car {

	public static void main(String[] args) {
		 Audi d=new Audi();
		 d.carColour="white";
		 System.out.println("My audi colour is "+d.carColour);
		 d.carNumber="Tsge1234";
		 System.out.println("my Audi car nUmber is "+d.carNumber);
		 d.carAssemble();
		 d.cartestDrive();
		 d.carTestTools();
		 d.automaticGearSys();
		 
	}

	public void automaticGearSys() {
		System.out.println("Audi is with Automatic Gear System");
	}

}
