import java.util.Scanner;
final class  car{
    public final void getModel(String carmodel)
    {
         System.out.println(carmodel);
    }

}
public class finalkey {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        car mycar=new car();
        System.out.print("Enter car model:");
        String carmodel=scan.nextLine();
        System.out.print("Car model:");
        mycar.getModel(carmodel);

    }
    
}
