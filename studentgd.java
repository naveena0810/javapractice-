import java.util.Scanner;

class Student{
    private int grade;

    public void setGrade(int grade){
        if(grade >= 0 && grade <= 100){
            this.grade = grade;
            System.out.println("Grade : "+this.grade);
        }
        else{
            System.out.println("Invalid grade");
        }
    }

    public int getGrade(){
        return this.grade;
    }
}

class studentgd{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter the grade to set : ");
        int g = input.nextInt();
        s.setGrade(g);
        int result  = s.getGrade();
        System.out.println("Final Grade : "+result);
    }
}
