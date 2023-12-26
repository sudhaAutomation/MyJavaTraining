package oops;

public class TestEncaps {
	static final  int i=10;
	public void sam() {
		
	}
	public static void main(String[] args) {
		Encaps e = new Encaps();
		e.setUserName("sudhaTest");
		e.setPassWord("123456");
		System.out.println(e.getUserName());
		System.out.println(e.getPassword());

	}

}
