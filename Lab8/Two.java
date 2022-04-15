import java.util.*;
class Time{
	int hour;
	int minuite;
	public Time(int hour,int min){
		this.hour=hour;
		this.minuite=min;
	}
	public Time(){}
	void add(Time t1,Time t2){
		this.hour=t1.hour+t2.hour;
		this.minuite=t1.minuite+t2.minuite;
		if(this.minuite>=60){
			this.minuite=this.minuite%60;
			this.hour+=this.minuite/60;
		}
	}
}
class Two{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the time 1:");
		int hour1=sc.nextInt();
		int minuite1=sc.nextInt();
		System.out.println("Please enter the time 2:");
		int hour2=sc.nextInt();
		int minuite2=sc.nextInt();
		Time t1=new Time(hour1,minuite1);
		Time t2=new Time(hour2,minuite2);
		Time t3=new Time();
		t3.add(t1,t2);
		System.out.println("Addition will be:"+t3.hour+" hours"+t3.minuite+" minuite");
	}
}