package oops;

public interface MyInterafce {
	int minBalance = 2000;// The blank final field i may not have been initialized

	public void sam();// Abstract methods do not specify a body

	public void div();

	public static void main(String[] args) {
		// MyInterafce r = new MyInterafce();// Cannot instantiate the type
		// MyInterafce,bcz an interafce can contain the
		// abstract methods
		sub();
	}

	public static void sub() {
		System.out.println("sub method is implemented");
	}
	public void Login();
	public void Tracking();
	public void ChangePassword();
	
	
}
// in an inteface variables will act as final and also static in nature by
// default
// in an interafce the methods are abstract in nature,
// abstract method means the method which is not having the method
// we can define the method body also in an interafce fro static methods
// we can not create an object for an interafce, bcz an interafce can contain
// the abstract methods which are unimplemeted