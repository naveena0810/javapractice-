import java.util.Scanner;
class bank {
    private int balance;

    public bank(int initialBalance)
     {
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance += amount;

    }
    public void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient funds.");
        }
        }
    public double getBalance()
    {
        return balance;
    }
    public static void main(String[] args)
     {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your initial balance: ");
        int a=input.nextInt();
        bank obj = new bank(a);
        System.out.println("Initial balance: $" + obj.getBalance());
        System.out.println("enter the deposit amount");
        int b=input.nextInt();
        obj.deposit(b);
        System.out.println("Balance after deposit: $" + obj.getBalance());
        System.out.println("enter the withdrawal amount");
        int c =input.nextInt();
        obj.withdraw(c);
        System.out.println("Balance after withdrawal: $" + obj.getBalance());
        obj.withdraw(1500.00);
        System.out.println("Final balance: $" + obj.getBalance());
    }
}


