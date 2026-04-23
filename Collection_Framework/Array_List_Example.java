package collecttion.framework;

import java.util.ArrayList;

public class Array_List_Example {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		String s1 = "Nagpur";
		String s2 = "Pune";
		String s3 = "Mumbai";
		String s4 = "Delhi";
		String s5 = "Banglore";
		System.out.println(arrlist);
		arrlist.add(s1);
		arrlist.add(s2);
		arrlist.add(s3);
		arrlist.add(s4);
		arrlist.add(s5);
		System.out.println(arrlist);
	}

}
