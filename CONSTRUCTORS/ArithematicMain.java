
public class ArithematicMain {

	public static void main(String[] args) {
		ArithematicOperation obj1 = new ArithematicOperation();
		obj1.setValue1(200);
		obj1.setValue2(100);
		
		obj1.additionOperation();
		double Result = obj1.getResult();
		System.out.println("Addition is : "+Result);
		
		obj1.subOperation();
		Result = obj1.getResult();
		System.out.println("Addition is : "+Result);
		
		obj1.mulOperation();
		Result = obj1.getResult();
		System.out.println("Addition is : "+Result);
		
		obj1.divisionOperation();
		Result = obj1.getResult();
		System.out.println("Addition is : "+Result);
	}

}
