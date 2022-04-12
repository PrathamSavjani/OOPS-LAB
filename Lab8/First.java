import java.util.Scanner;
class Circle{
	double radius;
	double area(){
		return(Math.PI*radius*radius);
	}
	double parameter(){
		return(2*Math.PI*radius);
	}
}
class First{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the radius: ");
		Circle cir=new Circle();
		cir.radius=sc.nextDouble();
		double area=cir.area();
		double parameter=cir.parameter();
		System.out.println("The area of the circle is:"+area);
		System.out.println("The parameter of the circle is:"+parameter);
	}
}