package basics;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
		System.out.println("Hello 4");
		System.out.println("Hello 5");
		// while loop
		
		System.out.println("******while loop output*******");
		int i = 1;// initialisation
		while (i <= 10) {// conditional part
			System.out.println("Hello " + i);
			i++;// increment part
		}
		
		// do while loop
		System.out.println("******do while loop output*******");
		int j = 10;
		do {
			System.out.println("Hello " + j);
			j--;// decremental part
		} while (j >= 1);

		System.out.println("******for loop output*******");
		
		for (int k = 0; k <=10 ;) {
			System.out.println("Hello "+k);
		}
	}

}
