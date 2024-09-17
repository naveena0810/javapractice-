import java.util.Scanner;
class evenodd{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.print(num+" is odd");
        }
    }
}