import java.util.Scanner;
class skipeven{
	public static void main(String[] args){
		Scanner n=new Scanner(System.in);
		int num=n.nextInt();
		for (int i=1;i<=num;i++){
			if(i%2==0)
				continue;
			System.out.print(i+" ");
		}
	}
}