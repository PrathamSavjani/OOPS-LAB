import java.util.Scanner;
class Employee{
	int Employee_id;
	String Employee_Name;
	String Designation;
	int age;
	double Salary;
	void GetEmployeeDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter Employee ID:");
		Employee_id=sc.nextInt();
		System.out.print("Please enter Employee Name:");
		sc.nextLine();
		Employee_Name=sc.nextLine();
		System.out.print("Please enter the Designation:");
		Designation=sc.nextLine();
		System.out.print("Please enter age:");
		age=sc.nextInt();
		System.out.print("Please enter the Salary:");
		Salary=sc.nextDouble();
	}
	void DisplayEmployeeDetails(){
		System.out.println("Employee ID:"+Employee_id);
		System.out.println("Employee Name:"+Employee_Name);
		System.out.println("Employee Designation:"+Designation);
		System.out.println("Employee age:"+age);
		System.out.println("Employee Salary:"+Salary);
	}
}
class Third{
	public static void main(String args[]){
		Employee c1=new Employee();
		System.out.println("Please enter the details of Employee\n");
		c1.GetEmployeeDetails();
		System.out.println("\nDisplaying the Employee details\n");
		c1.DisplayEmployeeDetails();
	}
}