import java.util.Scanner;
class calc{
    public int  add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n4,int n5)
    {
        return n4+n5;
    }

}
public class overloading {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.println("enter the numbers:");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        double n4=scan.nextDouble();
        int n5=scan.nextInt();

        
        calc obj=new calc();
        int n=obj.add(n1,n2);
        int r=obj.add(n1,n2,n3);
        double d=obj.add(n4,n5);
        System.out.println("-----------------------");
        System.out.println(n);
        System.out.println(r);
        System.out.println(d);
    }
    
}
