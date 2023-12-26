package mockScripts;

public class BMWClass extends Car {
	public static void main(String args[]) {

	 BMWClass b=new BMWClass();
	 b.carColour="grey";
	 System.out.println(b.carColour);
	 b.Carnumber="TS09UB1234";
	 System.out.println(b.Carnumber);
	 b.carAssemble();
	 b.cartestdrive();
	 b.cartestTools();
	 b.sunRoof();
	}
	public void sunRoof() {
		System.out.println("Sunroof is installed in the BMW");
	}
}