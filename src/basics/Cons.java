package basics;

public class Cons extends ConsP {
	int i;
	String s;
	boolean f;
	double d;// global variables/ instance variables

	public static void main(String[] args) {// constrcutor:will instantiate the instance variables
		ConsP c = new Cons();
//		System.out.println(c.i);
//		System.out.println(c.s);
//		System.out.println(c.f);
//		System.out.println(c.d);
		// new Cons(100);
		// new Cons(1, "Raju");
		// new Cons(2, "Somu");
	}

	/*
	 * what is a constructor:a special method in the class having the same name as
	 * the class name is nothing but the constructor //we are having the 2 types of
	 * constructors 1.default constructor and 2.parameterized constructor
	 */
	/*
	 * 1.mathod over loading is possible on constructor 2.constrctor is neither void
	 * nor returns anything 3.constructor is non static(called via object) 
	 * 4.Can we inherit the constructors? yes
	 *5.Can we over ride the constructor? No
	 * we can call the
	 * aprent class constructor by using the super keyword and we can also call the
	 * sam eclass constructos by using the this keyword
	 */
	public Cons() {
		this(2000); // Constructor call must be the first statement in a constructor
		System.out.println("Child default constructor");

	}

	public Cons(int i) {
		this(3, "geetha");// this keyword will be sued to call the same class constructors
		System.out.println("Child 1 parameterized constructor " + i);
	}

	public Cons(int i, String s) {// constructor chaining :call the constructor from one constructor by unig the
									// super or this keyword from every every constructor
		super(3000);
		System.out.println("Child 2 parameterized constructor " + i + " " + s);
	}
}
