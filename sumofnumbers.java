import java.util.Scanner;
class sumofnumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
    int n = scanner.nextInt();
    int sum = 0;
    for(int i=1;i<=n;i++)
    {
        sum += i;
    }
        System.out.println("Sum of num : "+sum);
    }
}