import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter 2 numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println("Enter the operation(+,-,/,*,%) or press x to quit");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                ans = switch (op) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> num1 / num2;
                    case '%' -> num1 % num2;
                    default -> ans;
                };

            } else if (op == 'x' || op == 'X'){
                System.out.println("Thank You for using Calculator");
                break;
            }
            else{
                System.out.println("Invalid Operation entered!");
                continue;
            }
            System.out.println(num1+" "+" "+op+" "+num2+" = "+ans);
        }
    }
}
