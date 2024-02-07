import java.util.*;

/**
 *
 * @author 322-PC9
 */
public class Calculator {
    
    public static void main (String args[]) {
    
    String switching;
    double number1, number2, result;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator to proceed: +, -, *, or /");
    switching = input.next();

    System.out.print("Enter First Number: ");
    number1 = input.nextDouble();

    System.out.print("Enter Second Number ");
    number2 = input.nextDouble();

    switch (switching) {

      case "+":
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case "-":
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case "*":
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case "/":
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
    }
}
    