package exceptions;

public class TestBank {

	public static void main(String[] args) throws Exception {
		BankOperations b=new BankOperations();
		b.display();
		System.out.println();
		b.deposit(5000);
		System.out.println();
		b.withDrawn(20000);

	}

}
