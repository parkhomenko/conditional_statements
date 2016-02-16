import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        a = scanner.nextInt();

        System.out.print("Input second number: ");
        b = scanner.nextInt();

        System.out.println();

        int sum = a + b;
        System.out.println("The sum is " + sum);
    }
}
