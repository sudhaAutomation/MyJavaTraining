package oops;

public class MethodOverLoading {//
	public static void main(String[] args) {
		int i=100;
		MethodOverLoading m = new MethodOverLoading();
		m.sum();
		m.sum(10, 20);
		m.sum(1000, 100, 1000);
		m.sum(1000, 1000, 1000);
		m.sum(1000, 1000, "Ramu");
		//static polymorphism or compile time polymorphism
	}

	public void sum() {
		System.out.println("simple method with no arguments");
	}

	public void sum(int i, int j) {
		System.out.println("sum of 2 arguments is " + (i + j));
	}
	
	public void sum(int i, int j, String k) {
		System.out.println("sum of 3 arguments is " + (  j + i +"  "+k));
	}

	public void sum(int i, int j, int k) {
		System.out.println("argumnets are int int int");
		System.out.println("sum of 3 arguments is " + (i + j + k));
	}

	public void sum(int i, short k, int l) {
		System.out.println("argumnets are int short int");
		System.out.println("sum of 3 arguments is " + (i + l + k));
	}
	public void sum(int i,  int l,short k) {
		System.out.println("argumnets are int short int");
		System.out.println("sum of 3 arguments is " + (i + l + k));
	}
}
