import java.util.Arrays;
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        System.out.println("Enter number of elements you want in the array");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the entries:");
        for (int i = 0; i<num;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("You entered:\n"+Arrays.toString(arr));
        reverse(arr);

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println("After reversing:\n"+ Arrays.toString(arr));
    }

    static void swap(int[] arr,int n1,int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
