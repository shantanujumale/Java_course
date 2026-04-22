
public class Employee {
	private int emp_Id;
	private String emp_Name;
	private String emp_Dept;
	
	
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_Dept() {
		return emp_Dept;
	}
	public void setEmp_Dept(String emp_Dept) {
		this.emp_Dept = emp_Dept;
	}
	
	
//	
	public void setEmployee(int emp_Id, String emp_Name, String emp_Dept)
	{
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Dept = emp_Dept;
	}
	
	public void getEmployee()
	{
		System.out.println("Employee id : "+emp_Id);
		System.out.println("Employee name : "+emp_Name);
		System.out.println("Employee department : "+emp_Dept);
	}
	
	
	
}
