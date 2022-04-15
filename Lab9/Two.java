import java.util.Scanner;
class Student_Detail{
	long Enroll_num;
	String Name;
	int sem;
	double CPI;
	void GetStudentDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter your Enrollment Number:");
		Enroll_num=sc.nextLong();
		System.out.print("Please enter your Name:");
		sc.nextLine();
		Name=sc.nextLine();
		System.out.print("Please enter your sem:");
		sem=sc.nextInt();
		System.out.print("Please enter your CPI:");
		CPI=sc.nextDouble();
	}
	void DisplayStudentDetails(){
		System.out.print("Enrollment Number:"+Enroll_num+"\nName:"+Name+"\nSemester:"+sem+"\nCPI:"+CPI);
	}
}
class Two{
	public static void main(String[] args) {
		Student_Detail[] s=new Student_Detail[5];
		for(int i=0;i<5;i++){
			s[i]=new Student_Detail();
			System.out.println("\nPlease fill up the "+(i+1)+" student details:");
			s[i].GetStudentDetails();
			System.out.println("Displaying your details:");
			s[i].DisplayStudentDetails();		
		}
	}
}