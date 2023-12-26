package accessModifiers2;

import accessModifiers1.Test1;

public class Test4 {
	public void sampl() {
		Test1 o = new Test1();
		//System.out.println("private variable" + o.a);// The field Test1.a is not visible..private varibale will be
														// accessed only with in the class
		//System.out.println("default variable " + o.b);
		//System.out.println("protected variable " + o.c);// will be used with in the package and in the child class
		System.out.println("public variable " + o.d);//we can use any where in the project
		o.display();
	}
}
