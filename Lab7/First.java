import java.util.Scanner;
class Candidate{
	int Candidate_ID;
	String Candidate_Name;
	int Candidate_Age;
	double Candidate_Weight;
	double Candidate_Height;
	void GetCandidateDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the candidate id:");
		Candidate_ID=sc.nextInt();
		System.out.print("Please enter the candidate name:");
		sc.nextLine();
		Candidate_Name=sc.nextLine();
		System.out.print("Please enter the candidate age:");
		Candidate_Age=sc.nextInt();
		System.out.print("Please enter the candidate weight:");
		Candidate_Weight=sc.nextDouble();
		System.out.print("Please enter the candidate height:");
		Candidate_Height=sc.nextDouble();
	}
	void DisplayCandidateDetails(){
		System.out.println("Canditate's id is:"+Candidate_ID);
		System.out.println("Canditate's name is:"+Candidate_Name);
		System.out.println("Canditate's age is:"+Candidate_Age);
		System.out.println("Canditate's weight is:"+Candidate_Weight);
		System.out.println("Canditate's height is:"+Candidate_Height);
	}
}
class First{
	public static void main(String args[]){
		Candidate c1=new Candidate();
		System.out.println("Please enter the details of customer\n");
		c1.GetCandidateDetails();
		System.out.println("\nDisplaying the candidate details\n");
		c1.DisplayCandidateDetails();
	}
}