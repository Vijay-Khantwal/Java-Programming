public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,18,9,10};
        int ans = find(arr,18,0);
        System.out.println(ans);
    }

    private static int find(int[] arr, int target,int index) {
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return find(arr,target,index+1);
        }
    }
}
