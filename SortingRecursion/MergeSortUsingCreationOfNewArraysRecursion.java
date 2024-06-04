package SortingRecursion;

import java.util.Arrays;

public class MergeSortUsingCreationOfNewArraysRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int[] left = sort(Arrays.copyOfRange(arr,0,arr.length/2)) ;
        int[] right = sort(Arrays.copyOfRange(arr,arr.length/2,arr.length)) ;

        return merge(left,right);

    }
    static int[] merge(int[] left, int[] right){
        int[] combine = new int[left.length + right.length];

        int l = 0;
        int r = 0;
        int k = 0;

        while(l<left.length && r<right.length){
            if(left[l] < right[r]){
                combine[k] = left[l];
                l++;
            }
            else{
                combine[k] = right[r];
                r++;
            }
            k++;
        }
        while(l<left.length){
            combine[k] = left[l];
            l++; k++;
        }
        while(r<right.length){
            combine[k] = right[r];
            r++; k++;
        }
        return combine;
    }
}
