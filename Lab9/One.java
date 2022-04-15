import java.util.Scanner;
class Student{
	long Enroll_num;
	String Student_Name;
	int Semester;
	void GetStudentDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Enrollment Number:");
		Enroll_num=sc.nextLong();
		System.out.print("Enter student's name:");
		sc.nextLine();
		Student_Name=sc.nextLine();
		System.out.print("Enter semester:");
		Semester=sc.nextInt();
	}
}
class Result{
	long Enroll_num;
	double CPI;
	double SPI;
	void GetResultDetails(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Enrollment Number:");
		Enroll_num=scan.nextLong();
		System.out.print("Enter CPI:");
		CPI=scan.nextDouble();
		System.out.print("Enter SPI:");
		SPI=scan.nextDouble();
	}
		public void DisplayResult(Student s){
			System.out.println("Enrollment number:"+s.Enroll_num+"\nName:"+s.Student_Name+"\nSemester:"+s.Semester);
			System.out.print("CPI:"+this.CPI+"\nSPI:"+this.SPI);
	}
}
class One{
	public static void main(String[] args) {
		Student s1=new Student();
		Result r1=new Result();
		System.out.println("Please enter your details:");
		s1.GetStudentDetails();
		System.out.println("Please enter your result details:");
		r1.GetResultDetails();
		System.out.println("Displaying your overall details:");
		r1.DisplayResult(s1);
	}
}