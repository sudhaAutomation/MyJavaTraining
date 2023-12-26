package oops;

public class BMW extends Car {

	public static void main(String[] args) {
		Car b = new BMW();// child class object can be reffered with the parent class reference variable
		b.carColour = "Grey";
		System.out.println(b.carColour);
		//b.carNumber = "TS12UE2345";
		System.out.println(b.carNumber);
		b.carAssemble();
		b.cartestDrive();
		b.carTestTools();
		// b.sunRoof();
		b.automaticGear();
	}

	public void automaticGear() {
		System.out.println("BMW cal Integrated with Automatic Gear System");
	}

	public void sunRoof() {
		System.out.println("sunRoof is Installed in the BMW");
	}
}
