
public class Wraper_Class_Example {

	public static void main(String[] args) {
		int a = 10;
		//Integer i1 = new Integer(a);// primitive to object
		Integer i1 = a;// Auto Boxing
		System.out.println(i1);
//		int i1new = i1.intValue();// object to primitive
		int i1new = i1;// Auto Unboxing
		
		float b = 3.14f;
		Float f1 = b;// primitive to object
		System.out.println(f1);
		float f1new = f1;// object to primitive
		
		double c = 125;
		Double d1 = new Double(c);// primitive to object
		System.out.println(d1);
		double d1new = d1.doubleValue();// object to primitive
		
		byte e = 0;
		Byte b1 = new Byte(e);// primitive to object
		System.out.println(b1);
		byte b1new = b1.byteValue();// object to primitive
	}

}
