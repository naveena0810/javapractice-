import java.util.Scanner;

public class avgarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] scores = new double[3][4];

        String[] subjects = {"Math", "Science", "English", "History"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + ":");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + ": ");
                scores[i][j] = scanner.nextDouble();
            }
        }

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

