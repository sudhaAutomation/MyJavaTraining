package basics;

public class Dum {
	static int  j;//static varible
	String name;//global

	public static void main(String[] args) {
		
		Dum ob=new Dum();
		
		int marks = 100;
		System.out.println(marks);
		float f = 1.2f;
		System.out.println(f);
		long l = 9876543210l;
		System.out.println(l);
		boolean t = true;
		boolean t1 = false;
		System.out.println(t);
		System.out.println(t1);
		char ch = 'v';
		char ch1 = 'b';
		char ch2 = '@';
		char ch3 = '1';
		System.out.println(ch);
		
		int i=1;//implicit type casting
		byte b=(byte)1000;//explicit type casting
		
		//System.out.println(i);
		String str = "Sudha Rani       Software Tester";
		String s="98665";// local variable 
		System.out.println(j);
		System.out.println(str);
		System.out.println(ob.name);
		ob.samp();
		System.out.println("explicit type casted value "+b);
		
		
	}
	
	public  void samp() {
		int b;
		System.out.println(j);
	}

}
