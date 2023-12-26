package accessModifiers1;

public class Test2 {
	public void sampl() {
		Test1 o = new Test1();
		//System.out.println("private variable" + o.a);// The field Test1.a is not visible..private varibale will be
														// accessed only with in the class
		System.out.println("default variable " + o.b);
		System.out.println("protected variable " + o.c);
		System.out.println("public variable " + o.d);
		o.display();
	}
}
