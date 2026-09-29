import java.util.Scanner;

public class IT26101243Lab9Q4 {

    // Method to calculate final mark
    public static double calcFinalMark(double assignMark, double examMark) {
        return (assignMark * 0.30) + (examMark * 0.70);
    }

    // Method to find grade based on final mark
    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Method to print details of a student
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + " | " + finalMark + " | " + grade);    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = scanner.nextDouble();

            finalMarks[i] = calcFinalMark(assignMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println("\nName       | Final Mark | Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

    }
}
