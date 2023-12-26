package basics;

public class MethhodsTest {

	public static void main(String[] args) {
		MethodsTypes m = new MethodsTypes();
		m.sum();
		m.sum();
		// System.out.println(m.sum());
		m.multi(10, 10);
		m.multi(12, 5);
		m.multi(2, 20);
		m.sub();
		System.out.println("direct sop " + m.sub());
		m.div(10, 5);
		m.div(20, 20);
		m.div(5, 10);
		System.out.println("direct sop " + m.div(1, 1));
		System.out.println("sop of String and int " + (m.sam("Test", 10)));
	}

}
