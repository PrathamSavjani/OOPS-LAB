import java.util.Scanner;
class Complex{
	double real;
	double imaginary;
	void add(double real1,double imaginary1,double real2,double imaginary2){
		real=real1+real2;
		imaginary=imaginary1+imaginary2;
	}
}
class Third{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3=new Complex();
		System.out.println("Please enter first the number: ");
		c1.real=sc.nextDouble();
		c1.imaginary=sc.nextDouble();
		System.out.println("Please enter second the number: ");
		c2.real=sc.nextDouble();
		c2.imaginary=sc.nextDouble();
		c3.add(c1.real,c1.imaginary,c2.real,c2.imaginary);
		System.out.println("By adding two complex numbers we get:"+c3.real+"+i"+c3.imaginary);
	}
}