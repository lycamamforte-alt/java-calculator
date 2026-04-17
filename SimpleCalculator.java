import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstnumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondnumber = scanner.nextInt();

        System.out.println(firstnumber + secondnumber);
        System.out.println(firstnumber - secondnumber);
        System.out.println(firstnumber * secondnumber);
        System.out.println(firstnumber / secondnumber);
        System.out.println(firstnumber % secondnumber);

    }
}