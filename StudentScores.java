import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Create a 2D array to store the scores of 3 students in 4 subjects.
        double[][] scores = new double[3][4];
        
        // Subjects array
        String[] subjects = {"Math", "Science", "English", "History"};

        // 2. Initialize the array with some sample scores using user input.
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + ":");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + ": ");
                scores[i][j] = scanner.nextDouble();
            }
        }

        // 5. Print the average scores for each student and each subject.
        System.out.println("\nAverage scores for each student:");
        double[] studentAverages = calculateStudentAverages(scores);
        for (int i = 0; i < studentAverages.length; i++) {
            System.out.printf("Student %d: %.2f\n", i + 1, studentAverages[i]);
        }

        System.out.println("\nAverage scores for each subject:");
        double[] subjectAverages = calculateSubjectAverages(scores);
        for (int i = 0; i < subjectAverages.length; i++) {
            System.out.printf("%s: %.2f\n", subjects[i], subjectAverages[i]);
        }
        
        scanner.close();
    }

    // 3. Write a method to calculate the average score for each student.
    public static double[] calculateStudentAverages(double[][] scores) {
        double[] averages = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            double sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            averages[i] = sum / scores[i].length;
        }
        return averages;
    }

    // 4. Write a method to calculate the average score for each subject.
    public static double[] calculateSubjectAverages(double[][] scores) {
        double[] averages = new double[scores[0].length];
        for (int j = 0; j < scores[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i][j];
            }
            averages[j] = sum / scores.length;
        }
        return averages;
    }
}













