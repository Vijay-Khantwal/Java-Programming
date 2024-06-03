package Recursion;

import java.util.Arrays;

public class MergeSortInPlaceRecursion {public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};
    sort(arr,0,arr.length);
    System.out.println(Arrays.toString(arr));
}

    static void sort(int[] arr, int start,int end){
        if(end - start == 1){
            return;
        }
        int mid = start+ (end-start)/2 ;
        sort(arr,start,mid) ;
        sort(arr,mid,end) ;

        mergeInPlace(arr,start,mid,end);

    }
    static void mergeInPlace(int[] arr, int s,int m ,  int e){
        int[] combine = new int[e-s];

        int l = s;
        int r = m;
        int k = 0;

        while(l<m && r<e){
            if(arr[l] < arr[r]){
                combine[k] = arr[l];
                l++;
            }
            else{
                combine[k] = arr[r];
                r++;
            }
            k++;
        }
        while(l<m){
            combine[k] = arr[l];
            l++; k++;
        }
        while(r<e){
            combine[k] = arr[r];
            r++; k++;
        }
        for(int i = 0; i<combine.length ; i++){
            arr[s+i] = combine[i];
        }
    }
}
