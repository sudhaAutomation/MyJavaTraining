package basics;

import java.util.Arrays;

public class StringP {

	public static void main(String[] args) {
		String str = "automation Testing";// by String Literal
		String s = "  Automation Testing  ";
		System.out.println(s.toLowerCase());
		System.out.println(s.equals(str));
		System.out.println(s.equalsIgnoreCase(str));
		System.out.println(s.trim());
		//System.out.println(s.compareTo(str));
		System.out.println(str.length());
		String date="03/11/2023";
		System.out.println(date);
		System.out.println(date.replace('/', '-'));
		System.out.println(str.charAt(10));
		System.out.println(str.indexOf('z'));
		System.out.println(str.indexOf('t'));//first occurence of t
		System.out.println(str.indexOf('t',3));//first occurence of t
		
		System.out.println(str.indexOf('t',str.indexOf('t')+1));//second occurence of t
		System.out.println(str.indexOf('t',str.indexOf('t',str.indexOf('t')+1)+1));//third occurence of t
		//split method
		String st="Hyderabad and secunderbad and hasifabad are twin cities";
		System.out.println(st.substring(12));
		System.out.println(st.substring(9));
		String[] ar=st.split("and");
		System.out.println(ar.length);
		System.out.println(ar[1]);
		System.out.println(Arrays.toString(ar));
		
		String name="Swhizz Technologies";
		String[] a=name.split("");
		int i=a.length;//6
		System.out.println(i);
		
		for (int j = i-1; j >=0; j--) {
			System.out.print(a[j]);
		}
		System.out.println();
		int k=12345;
		System.out.println(new StringBuilder(String.valueOf(k)).reverse());
		System.out.println(new StringBuffer(String.valueOf(k)).reverse());
		System.out.println(name.contains(" Tech"));
	}

}
