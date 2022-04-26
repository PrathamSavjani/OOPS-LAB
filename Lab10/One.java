import java.util.Scanner;
class Member{
    Scanner sc=new Scanner(System.in);
    String Name;
    int Age;
    long Phone_Num;
    String Address;
    int Salary;
    public void getMemberDetails(){
        System.out.print("Enter Name:");
        Name=sc.nextLine();
        System.out.print("Enter Age:");
        Age=sc.nextInt();
        System.out.print("Enter Phone_Num:");
        Phone_Num=sc.nextLong();
        System.out.print("Enter Address:");
        sc.nextLine();
        Address=sc.nextLine();
        System.out.print("Enter Salary:");
        Salary=sc.nextInt();
    }
    public void displayMemberDetails(){
        System.out.println("Name is:"+Name);
        System.out.println("Age is:"+Age);
        System.out.println("Phone Number is"+Phone_Num);
        System.out.println("Address is:"+Address);
        System.out.println("Salary is:"+Salary);
    }
    public void printSalary(){
        System.out.println("The salary is:"+Salary);
    }
}
class Employee extends Member{
    Scanner s=new Scanner(System.in);
    String specialization;
    void getEmployeeDetails(){
        super.getMemberDetails();
        System.out.print("Enter specialization:");
        specialization=s.nextLine();
    }
    void displayEmployeeDetails(){
        super.displayMemberDetails();
        System.out.println("Specialization is:"+specialization);
    }
}
class Manager extends Member{
    Scanner scan=new Scanner(System.in);
    String department;
    void getManagerDetails(){
        super.getMemberDetails();
        System.out.print("Enter department:");
        department=scan.nextLine();
    }
    void displayManagerDetails(){
        super.displayMemberDetails();
        System.out.println("Department is:"+department);
    }
}

class One{
    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println("Please enter the details of Employee:");
        e1.getEmployeeDetails();
        System.out.println("Displaying the details of employee");
        e1.displayEmployeeDetails();
        Manager m1=new Manager();
        System.out.println("Please enter the details of Manager:");
        m1.getManagerDetails();
        System.out.println("Displaying the details of Manager");
        m1.displayManagerDetails();
    }
}