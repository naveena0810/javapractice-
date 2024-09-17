public class GreetStudents {

    public static void main(String[] args) {
        // List of students' names
        String[] students = {"Alice", "Bob", "Charlie", "Diana", "Eve"};

        // Using a foreach loop to greet each student
        for (String student : students) {
            System.out.println("Hello, " + student + "!");
        }
    }
}