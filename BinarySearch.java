public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 4;
        System.out.println(BS(arr,target,0,arr.length-1));
    }

    static int BS(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        }
        if(arr[m] < target){
            return BS(arr,target,m+1,e);
        }
        return BS(arr,target,s,m-1);
    }
}
