import java.util.*;
class ComplexNumbers{
	double real;
	double imaginary;
	public ComplexNumbers(double real,double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	public ComplexNumbers(){}
	void add(ComplexNumbers c1,ComplexNumbers c2){
		this.real=c1.real+c2.real;
		this.imaginary=c1.imaginary+c2.imaginary;
	}
}
class Three{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the complex1:");
		Double real1=sc.nextDouble();
		Double imaginary1=sc.nextDouble();
		System.out.println("Please enter the complex2:");
		Double real2=sc.nextDouble();
		Double imaginary2=sc.nextDouble();
		ComplexNumbers c1=new ComplexNumbers(real1,imaginary1);
		ComplexNumbers c2=new ComplexNumbers(real2,imaginary2);
		ComplexNumbers c3=new ComplexNumbers();
		c3.add(c1,c2);
		System.out.println("The addition of two numbers is:"+c3.real+" i"+c3.imaginary);
	}
}