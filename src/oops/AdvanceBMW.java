package oops;

public class AdvanceBMW extends BMW {

	public static void main(String[] args) {
		AdvanceBMW a=new AdvanceBMW();
		a.carAssemble();
		a.cartestDrive();
		a.carTestTools();
		a.carColour="Blue";
		System.out.println(a.carColour);
		a.carNumber="TS09Ut2367";
		System.out.println(a.carNumber);
		a.sunRoof();
		a.advancebmwchild();
	}

	public void advancebmwchild() {
		System.out.println("advanced BMW is ready to Drive");
	}

}
