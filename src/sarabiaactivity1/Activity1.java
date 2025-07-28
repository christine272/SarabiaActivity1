package sarabiaactivity1;

import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] grades = new int[numSubjects];
        int sum = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for sub" + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            sum += grades[i];
        }

        double average = (double) sum / numSubjects;
        String remarks = (average >= 75) ? "PASSED" : "FAILED";

        System.out.println("\nAverage: " + String.format("%.2f", average));
        System.out.println("Remarks: " + remarks);
    }
}
