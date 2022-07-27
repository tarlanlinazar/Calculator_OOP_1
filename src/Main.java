import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//      FIRST NUMBER
        System.out.println("Enter first number: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Invalid input. Please enter a number");
        }
        int firstNumb = scanner.nextInt();
        scanner.nextLine();


//      OPERATION
        System.out.println("Enter operation: ");
        String operation = scanner.nextLine();


//      SECOND NUMBER
        System.out.println("Enter second number: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Invalid input. Please enter a number");
        }
        int secondNumb = scanner.nextInt();
        scanner.nextLine();


//      CALCULATION
        if (operation.contains("+")) {
            new Addition(firstNumb,secondNumb);
        } else if (operation.contains("-")) {
            new Subtraction(firstNumb,secondNumb);
        } else if (operation.contains("*")) {
            new Multiplication(firstNumb, secondNumb);
        } else if (operation.contains("/")) {
            new Division(firstNumb,secondNumb);
        } else {
            System.out.println("Enter correct operation");
        }
    }
}