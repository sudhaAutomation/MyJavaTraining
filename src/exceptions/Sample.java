package exceptions;

public class Sample {
	public static void main(String[] args) {
		int i = 10;
		System.out.println("Hello");
		try {
			System.out.println(i / 0);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("closing statements of the code");
		}
		System.out.println("Bye");
		
	}

}
