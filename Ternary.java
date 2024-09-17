import java.util.Scanner;
class Ternary{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the mark:");
        int mark=scan.nextInt();
        String result = ((mark >=50)? "pass": "fail");
        System.out.print(result);
    }
}
