import java.util.Scanner;

public class count_occurence_of_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        System.out.println("Enter the digit whose occurence is to be calculated");
        int repeat = in.nextInt();
        int count = 0;
        while (num > 0) {
            if (num % 10 == repeat) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Occurences of " + repeat + " is " + count);
    }
}
