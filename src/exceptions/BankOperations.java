package exceptions;

public class BankOperations {

	int acountNumber = 123456;
	int amount = 5000;

	public void display() {
		System.out.println("my acount number is " + acountNumber);
		System.out.println("current balance is " + amount);
	}

	public void deposit(int amount) {
		System.out.println("my deposited amount is " + amount);
		this.amount = this.amount + amount;
		display();
	}

	public void withDrawn(int amount) throws Exception {
		System.out.println("my with drwan amount is " + amount);
		if (this.amount >= amount) {
			this.amount = this.amount - amount;
		} else {
			//System.out.println("Insuffient Funds in your account");
			throw new Exception("Insuffient Funds in your acount");
		}

		display();
	}
}
