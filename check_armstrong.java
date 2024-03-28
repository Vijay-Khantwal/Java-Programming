import java.util.Scanner;

public class check_armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        int copy=num;
        int compare = 0,count=0 ;

        while(copy!=0){
            copy/=10;
            count++;
        }
        copy=num;
        while(num!=0){
            compare += Math.pow(num%10,count);
            num/=10;
        }
        if(compare==copy){
            System.out.println("It is armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }

    }
}
