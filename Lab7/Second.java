import java.util.Scanner;
class Bank_Account{
	int Account_Number;
	String User_Name;
	String Email;
	String Account_Type;
	double Account_Balance;
	void GetAccountDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the Account Number:");
		Account_Number=sc.nextInt();
		System.out.print("Please enter the User Name:");
		sc.nextLine();
		User_Name=sc.nextLine();
		System.out.print("Please enter the Email:");
		Email=sc.nextLine();
		System.out.print("Please enter the Account Type:");
		Account_Type=sc.nextLine();
		System.out.print("Please enter the Account Balance:");
		Account_Balance=sc.nextDouble();
	}
	void DisplayAccountDetails(){
		System.out.println("Account number is:"+Account_Number);
		System.out.println("User name is:"+User_Name);
		System.out.println("Email is:"+Email);
		System.out.println("Account type is:"+Account_Type);
		System.out.println("Account balance is:"+Account_Balance);
	}
}
class Second{
	public static void main(String args[]){
		Bank_Account c1=new Bank_Account();
		System.out.println("Please enter the details of customer\n");
		c1.GetAccountDetails();
		System.out.println("\nDisplaying the candidate details\n");
		c1.DisplayAccountDetails();
	}
}