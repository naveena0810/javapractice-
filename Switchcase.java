import java.util.Scanner;
class Switchcase{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the day:");
        int day=scan.nextInt();
        switch(day)
        {
            case 1:
                {
                    System.out.print("|"+day+"|"+ "|Sunday|");
                    break;
                }
            case 2:
                {
                    System.out.print("|"+day+"|"+ "|Monday|");
                    break;
                }
            case 3:
                {
                    System.out.print("|"+day+"|"+ "|Tuesday|");
                    break;
                }
            case 4:
                {
                   System.out.print("|"+day+"|"+ "|Wednesday|");
                    break;
                }
            case 5:
                {
                    System.out.print("|"+day+"|"+ "|Thursday|");
                    break;
                }
            case 6:
                {
                    System.out.print("|"+day+"|"+ "|Friday|");
                    break;
                }
            case 7:
                {
                   System.out.print("|"+day+"|"+ "|saturday|");
                   break;
                }
            default:
                {
                    System.out.print("invalid day put correct day number");
                }
                
                
                
    }
    }
 }