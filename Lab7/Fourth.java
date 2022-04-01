import java.util.Scanner;
class Student{
	String Enrollment_Number;
	String Student_Name;
	int Semester;
	double cpi;
	double spi;
	void GetStudentDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the enrollment number:");
		Enrollment_Number=sc.nextLine();
		System.out.print("Please enter the student name:");
		Student_Name=sc.nextLine();
		System.out.print("Please enter the semester:");
		Semester=sc.nextInt();
		System.out.print("Please enter the cpi:");
		cpi=sc.nextDouble();
		System.out.print("Please enter spi:");
		spi=sc.nextDouble();
	}
	void DisplayStudentDetails(){
		System.out.println("Enrollment Number:"+Enrollment_Number);
		System.out.println("Student Name:"+Student_Name);
		System.out.println("Semester:"+Semester);
		System.out.println("CPI:"+cpi);
		System.out.println("SPI:"+spi);
	}
}
class Fourth{
	public static void main(String args[]){
		Student c1=new Student();
		System.out.println("Please enter the details of Student\n");
		c1.GetStudentDetails();
		System.out.println("\nDisplaying the Student details\n");
		c1.DisplayStudentDetails();
	}
}