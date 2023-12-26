package accessModifiers1;

public class Test1 {
	private int a;// global variable/instance variable
	int b;// default varible
	protected int c;
	public int d;

	 public void display() {
		System.out.println("private variable " + a);
		System.out.println("default variable " + b);
		System.out.println("protected variable " + c);
		System.out.println("public variable " + d);
	}

	public void s() {
		System.out.println(a);
	}
}
