import java.util.Scanner;
class Two{
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Please enter the string");
		str=sc.nextLine();
		int n=str.length();
		String str1="";
		for(i=n-1;i>=0;i--){
			str1=str1+str.charAt(i);
		}
		if(str.equals(str1)){
			System.out.println("Pali");
		}
		else{
			System.out.println("not palin");
		}
	}
}