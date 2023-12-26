package basics;

public class ConsP {
	ConsP() {
		System.out.println("parent default constructor");
	}

	ConsP(int i) {
		this(1, true);
		//parent default cons
		System.out.println("parent 1 argument constructor " + i);
	}

	ConsP(int i, boolean b) {
		//parent 2 paramaeters constructor
		this();
		System.out.println("parent 2 argumnets constructor " + i + " " + b);
	}

}
