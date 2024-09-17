import java.util.Scanner;

class Item
{
    String name;
    int price;
    static int total=0;
    static int revenue=0;
    public Item(String name,int price)
    {
        this.name = name;
        this.price = price;
    }
    public void totalitem(int sold)
    {
        total+=sold;
        revenue+=sold*price;
    }
    public static int displaysolditem()
    {
        return total;
    }
    public static int displayrevennue()
    {
        return revenue;
    }
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of iteam");
        int a=input.nextInt();
        Item[] obj = new Item[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("Enter the name");
            String name=input.next();
            System.out.println("Enter the price of the item");
            int price=input.nextInt();
            obj[i]= new Item(name, price);

        }
        for (int i = 0; i <a; i++) {
            System.out.println("Enter the quantity sold for " + obj[i].name + ":");
            int quantitySold = input.nextInt();
            obj[i].totalitem(quantitySold);
        }
        System.out.println("total Item sold:"+Item.displaysolditem());
        System.out.println("total revenue:"+Item.displayrevennue());


    }
}

