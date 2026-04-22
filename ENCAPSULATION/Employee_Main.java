
public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		
//		e1.emp_Id = 100;
//		e1.emp_Name = "ABC";
//		e1.emp_Dept = "IT";
//		System.out.println("Employee id is : "+e1.emp_Id);
//		System.out.println("Employee name is : "+e1.emp_Name);
//		System.out.println("Employee department is : "+e1.emp_Dept);
//		System.out.println("==================================================");
//		
//		Employee e2 = new Employee();
//		e2.emp_Dept = "IT";
//		e2.emp_Id = 101;
//		e2.emp_Name = "ABCD";
//		System.out.println("Employee id is : "+e2.emp_Id);
//		System.out.println("Employee name is : "+e2.emp_Name);
//		System.out.println("Employee separtment is : "+e2.emp_Dept);
		
		e1.setEmployee(100, "ABCD", "IT");
		e1.getEmployee();

	}

}
