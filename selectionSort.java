public class selectionSort {
    public static void main(String[] args) {
        
    }

    static void sort(int[] arr, int max, int c,int r){
        if(r==0 ){
            return;
        }
        if(c<r){
            if(arr[c]<arr[max]){
                sort(arr, max, c+1, r);
            }
            sort(arr, c, c+1, r);
        }
        else{
            int temp = arr[max];
            sort(arr, max, c, r-1);
        }
    }
}
