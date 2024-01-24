import java.util.Scanner;

public
 
class
 
Calculator
 
{

    public
 
static
 
void
 
main(String[] args)
 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (1 or 2 digits): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (1 or 2 digits): ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        try {
            double result = calculate(num1, num2, operation);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Function to perform the calculation and handle errors
    static double calculate(int num1, int num2, char operation) throws IllegalArgumentException {
        if (num1 < 0 || num1 > 99 || num2 < 0 || num2 > 99) {
            throw new IllegalArgumentException("Input must be 1 or 2 digits.");
        }

        switch (operation) {
            case
 
'+':
                return num1 + num2;
            case
 
'-':
                return num1 - num2;
            case
 
'*':
                return num1 * num2;
            case
 
'/':
                if (num2 == 0) {
                    throw
 
new IllegalArgumentException("Division by zero is not allowed.");
                } else {
                    return (double) num1 / num2;
                }
            default:
                throw new IllegalArgumentException("Invalid operation symbol.");
        }
    }
}