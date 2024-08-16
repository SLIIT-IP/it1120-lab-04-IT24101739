import java.util.Scanner;

public class IT24101739Lab4Q2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the exam marks (out of 100): ");
        int examMarks = scanner.nextInt();
        
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks.Terminating program.");
            return;
        }

        System.out.print("Enter the lab submission marks (out of 100): ");
        int labMarks = scanner.nextInt();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab marks.Terminating program");
            return;
        }

        System.out.print("Enter the percentage taken from the exam mark: ");
        int examPercentage = scanner.nextInt();

        System.out.print("Enter the percentage taken from the lab submission mark: ");
        int labPercentage = scanner.nextInt();

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100.Terminating program");
            return;
        }

        double finalMarks = ((examMarks * examPercentage) + (labMarks * labPercentage)) / 100.0;

        System.out.println("The final exam marks are: " + finalMarks);

        scanner.close();
    }
}