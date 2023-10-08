package Day24_4julyInheritance;
class Employee{
	int empID;
	String empName;
	double empSalary;
	Employee(){
		System.out.println("running defsult cons..");
		this.empID=1000;
		this.empName="no name";
		this.empSalary=0.0;
	}
	Employee(int empID, String empName, double empSalary){
		System.out.println("running 3 args cons..");
		this.empID= empID;
		this.empName= empName;
		this.empSalary= empSalary;
	}
	int getEmpID()
	{
		return this.empID;
	}
	String getEmpName()
	{
		return this.empName;
	}
	double getEmpSalary()
	{
		return this.empSalary;
	}
	void setempID(int empId) {
		this.empID= empID;
	}
	void setEmpNmae(String empName) {
		this.empName= empName;
	}
	void setEmpSalary(double empSalary) {
		this.empSalary= empSalary;
	}
}
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Program Starts...");
         Employee emp1 = new Employee(1102,"Rohan",24563.10);
         System.out.println("Emp ID: "+emp1.getEmpID());
         System.out.println("Emp Name: "+emp1.getEmpName());
         System.out.println("Emp Salary: "+emp1.getEmpSalary());
         System.out.println("Program Ends...");
	}

}
