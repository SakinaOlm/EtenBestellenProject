import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer het eerste getal in: ");
        double num1 = scanner.nextDouble();

        System.out.print("Voer het tweede getal in: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.println("De som is: " + sum);
    }
}