import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int ind = 0;
        if (num < 0 || num==1 || num==0) {
            System.out.println("Not a prime number.");
            ind = 3;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                ind = 1;
                System.out.println("Not a prime number");
                break;
            }
        }
        if (ind == 0) {
            System.out.println("It is a prime number");
        }
    }
}
