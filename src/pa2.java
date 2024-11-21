import java.util.Scanner;

//Iyobosa Osazuwa
//reads five whole numbers and calculates the average between them.
public class pa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter five whole numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumPositive = 0, sumNonPositive = 0, sumTotal = 0;
        int countPositive = 0, countNonPositive = 0;

        for (int number : numbers) {
            sumTotal += number;
            if (number > 0) {
                sumPositive += number;
                countPositive++;
            } else {
                sumNonPositive += number;
                countNonPositive++;
            }
        }

        double averagePositive = (countPositive > 0) ? (double) sumPositive / countPositive : 0;
        double averageNonPositive = (countNonPositive > 0) ? (double) sumNonPositive / countNonPositive : 0;
        double averageTotal = (double) sumTotal / 5;

        System.out.println("The sum of the " + countPositive + " positive numbers: " + sumPositive);
        System.out.println("The sum of the " + countNonPositive + " non-positive numbers: " + sumNonPositive);
        System.out.println("The sum of the 5 numbers: " + sumTotal);
        System.out.printf("The average of the %d positive numbers: %.2f\n", countPositive, averagePositive);
        System.out.printf("The average of the %d non-positive numbers: %.2f\n", countNonPositive, averageNonPositive);
        System.out.printf("The average of the 5 numbers: %.2f\n", averageTotal);

        scanner.close();
    }
}
