package practice.JAVA;

public class Example1 {

	public static void main(String[] args) {
		String str = "Symbiosis Institute Of Technology";
		int Len = str.length();
		System.out.println(str);
		System.out.println(Len);
		String s = str.toUpperCase();
		System.out.println(s);
		String L = str.toLowerCase();
		System.out.println(L);
		int count = 0;
		for(int i = 0; i <Len; i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
				count++;
			}
			
		}
		System.out.println("No. of S : "+count);

	}

}
