package mockScripts;

public class Overloading {
	public static void main(String[] args) {

		int i;
		Overloading m = new Overloading();
		m.sum(10, 10);
		m.sum(100, "ram", 100);
	}

	public void sum(int a, int b) {
		System.out.println("2 arguments " + (a + b));
	}

	public void sum(int a, int b, int c) {
		System.out.println("3 arguments " + (a + b + c));

	}

	public void sum(int a, String b, int c) {
		System.out.println("3 arguments " + (a + c+ " " + b ));
	}
}