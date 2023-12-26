package accessModifiers2;

import accessModifiers1.Test1;

public class Test3 extends Test1 {// is-a -relationship
	public void sum() {
		//System.out.println("private variable" + a);// The field Test1.a is not visible..only with in he class
		//System.out.println("default variable" + b);// The field Test1.b is not visible..we can use only with in the
													// package
		System.out.println("protected variable" + c);
		System.out.println(" public variable" + d);
	}

}
