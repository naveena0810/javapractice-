import java.util.Scanner;
class Employeem{
   private String name;
    private int id;
    private double basicSalary;
    private double allowances;
    public Employee() {
        this.name = "";
        this.id = 0;
        this.basicSalary = 0.0;
        this.allowances = 0.0;
    }
    public Employee(String name, int id, double basicSalary, double allowances) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }
    public double calculateGrossSalary() {
        return basicSalary + allowances;
    }
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
    }
}
public class Employeem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numOfEmployees = scanner.nextInt();
        scanner.nextLine();  

        Employee[] employees = new Employee[numOfEmployees];

        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            System.out.print("Allowances: ");
            double allowances = scanner.nextDouble();
            scanner.nextLine();  
            employees[i] = new Employee(name, id, basicSalary, allowances);
        }
        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("\nDetails of employee " + (i + 1) + ":");
            employees[i].displayEmployeeDetails();
        }

        scanner.close();
    }
}