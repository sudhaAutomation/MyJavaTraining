package basics;

import java.util.Arrays;

public class ArraysInJava {// Array is an object in which we can store the similar type of elements with in
							// the contigious memory location

	public static void main(String[] args) {
		int i = 10;
		i = 20;
		String student = "Raju";
		student = "23ue1a0234";
		System.out.println(student);
		System.out.println(i);
		String std[] = new String[10];

		std[0] = "Gopal";
		std[1] = "HT141411";
		std[2] = "9876543214";
		std[3] = "O+";
		std[4] = "Grade A";
		std[5] = "H.No.1075,madhapur,telangana,500081";
		std[6] = "somu";
		std[7] = "170cm";
		std[8] = "20/12/1990";
		std[9] = "true";

		// std[10] = "CBIT";//ArrayIndexOutOfBoundsException
		System.out.println(std[0]);
		// System.out.println(Arrays.toString(std));
		System.out.println(std.length);// 10
		for (int j = 0; j < std.length; j++) {
			System.out.println(std[j]);
		}
		Object stddetails[] = new Object[10];
		stddetails[0] = "Ramu";
		stddetails[1] = 12345;
		stddetails[2] = 'A';
		stddetails[3] = 5.9;
		stddetails[4] = 80.1;
		stddetails[5] = true;
		System.out.println(Arrays.toString(stddetails));

		String str[] = { "somu", "1234", "grade A" };
		System.out.println(str[2]);

		String st[][] = new String[3][3];
		st[0][0] = "Ramu";
		st[0][1] = "75%";
		st[0][2] = "Grade A";
		st[1][0] = "Somu";
		st[1][1] = "78%";
		st[1][2] = "Grade B";
		st[2][0] = "Shiva";
		st[2][1] = "80%";
		st[2][2] = "Grade C";
		//System.out.println(Arrays.toString(st));
		System.out.println(st.length);
		System.out.println(st[0].length);
		
		for (int j = 0; j < st.length; j++) {
			for (int k = 0; k < st[j].length; k++) {
				System.out.print(st[j][k]+"   ");
			}
			System.out.println();
		}
	}

}
