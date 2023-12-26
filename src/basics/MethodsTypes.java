package basics;

public class MethodsTypes {
	// 1.without argumnets and with out return type
	public void sum() {
		int i = 10;
		int j = 20;
		System.out.println("1.without argumnets and with out return type");
		System.out.println("sum of i and j is " + (i + j));
		System.out.println();
	}

	// 2.with argumnets and without retuen type
	public void multi(int i, int j) {
		System.out.println("2.with argumnets and without return type");
		System.out.println("multiplication of i and i is " + (i * j));
		System.out.println();
	}
	//3.without arguments and with return type
	public int sub() {//void means returns nothing
		int i=10;
		int j=5;
		int k=i-j;
		//System.out.println("3.without arguments and with return type");
		//System.out.println(k);
		System.out.println();
		return k;
	
	}
	//4.with arguments and with return type
	public int div(int i,int j) {
		int k=i/j;
		//System.out.println("4.with arguments and with return type");
		//System.out.println(k);
		System.out.println();
		return k;
	}
	public  String sam(String s,int i) {
		return s+i;
	}

}
