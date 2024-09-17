
import java.util.Scanner;

class factorial {
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = f.nextInt();
        long fact = 1; 
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial of num: "+fact);
    }
}