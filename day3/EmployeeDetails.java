package week1.day3;

public class EmployeeDetails {


	public void printEmployeeName(String empName,int empId) {
		System.out.println("Name = "+empName );
		System.out.println("Id= "+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Address= "+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Salary= "+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("PhoneNumber= "+mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.printEmployeeName("Anto", 5976648);
		employee.getEmployeeAddress("Nagercoil");
		employee.printEmployeeSalary(55000.50);
		employee.printEmployeeMobileNumber(6382616758L);
	}
}

