import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int copy = num;
        String ans = "";
        while(num!=0){
            ans+= String.valueOf(num%10);
            num/=10;

        }
        System.out.println("Reverse of "+copy+" is "+Integer.valueOf(ans));

    }
}
