import java.util.Scanner;
class One{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string:");
		String str=sc.nextLine();
		int length=0;
		char [] arr = str.toCharArray();
		for(char ch: arr){
			length++;
		}	
		System.out.println("The length of the string is:"+length);	
	}
}