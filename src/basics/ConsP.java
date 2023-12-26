package basics;

public class ConsP {
	ConsP() {
		System.out.println("parent default constructor");
	}

	ConsP(int i) {
		this(1, true);
		System.out.println("parent 1 argument constructor " + i);
	}

	ConsP(int i, boolean b) {
		this();
		System.out.println("parent 2 argumnets constructor " + i + " " + b);
	}

}
