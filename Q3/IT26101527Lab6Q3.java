import java.util.Scanner;

public class IT26101527Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number != -99) {
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                sumOfSquares += number * number;
                count++;
            }
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        double rms = Math.sqrt(sumOfSquares / count);

        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + rms);

    }
}