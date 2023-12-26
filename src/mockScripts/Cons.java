package mockScripts;

public class Cons {
	int i;
	float f;
	boolean b;
	long l;

	public static void main(String[] args) {
		new Cons();
		new Cons(100);
	}

	public Cons() {
		System.out.println(i);
		System.out.println(f);
		System.out.println(b);
		System.out.println(l);
	}
	public Cons(int i) {
		System.out.println("1 argument with constructor "+i);
	}

}
