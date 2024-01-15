public class checkSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(sort(arr, 0));
    }
    static boolean sort(int[] arr, int i){
        if(arr.length-1 == i){
            return true;
        }
        return arr[i]<arr[i+1] && sort(arr, i+1);
    }
}
