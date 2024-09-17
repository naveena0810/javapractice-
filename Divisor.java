import java.util.Scanner;
public class Divisor{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a upper limit");
		int n=obj.nextInt();
		System.out.print("Enter a divisor");
		int m=obj.nextInt();
		if(n<=0||m<=0)
			System.out.print("Enter positive integers");
		for(int i=1;i<=n;i++) {
			if(i%m==0) {
				System.out.println("The first number is divisible by"+m+"is"+i);
				break;
			}
			
		}
    }
}