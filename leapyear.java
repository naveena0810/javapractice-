import java.util.Scanner;
class leapyear{
	public static void main(String[] args){
		Scanner n=new Scanner(System.in);
		System.out.print("Enter year:");
		int year=n.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0)
			System.out.print("yes leap year");
		else
			System.out.print("not a leap year");
}
}