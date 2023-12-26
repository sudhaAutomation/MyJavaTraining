package oops;

public class ChildC extends AbClass implements MyInterafce,ExcersiceInterface  {

	public static void main(String[] args) {
		ChildC c=new ChildC();
		c.sam();
		c.sub();
		c.multi();
		c.div();
		c.Tracking();
		c.ChangePassword();
		c.Login();
		MyInterafce.sub();
	}

	@Override
	public void sam() {
		System.out.println("sam method of Myinteface is implementd in ChildC");
	}

	@Override
	public void div() {
		System.out.println("div method implemented in ChildC");
	}

	@Override
	public void sub() {
		System.out.println("sub method implemented in ChildC");
	}

	@Override
	public void multi() {
		System.out.println("multi method implemented in ChildC");
	}

	@Override
	public void Login() {
		System.out.println("login module implementd by Gopal");
		
	}
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}
	

}
