import java.util.Scanner;
class Time{
	int hour;
	int minuite;
	void add(int hour1,int minuite1,int hour2,int minuite2){
		hour=hour1+hour2;
		minuite=minuite1+minuite2;
		if(minuite>=60){
			minuite=minuite%60;
			hour++;
		}
	}
}
class Second{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Time t1=new Time();
		Time t2=new Time();
		System.out.println("Please enter the hour and minuite of 1st time:");
		t1.hour=sc.nextInt();
		t1.minuite=sc.nextInt();
		System.out.println("Please enter the hour and minuite of 2nd time:");
		t2.hour=sc.nextInt();
		t2.minuite=sc.nextInt();
		Time t3=new Time();
		t3.add(t1.hour,t1.minuite,t2.hour,t2.minuite);
		System.out.println("hour: "+t3.hour+" minuite: "+t3.minuite);
	}
}