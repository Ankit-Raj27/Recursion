import java.util.Arrays;

public class mergeSortNew {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int s, int e) {
        if (s < e) {
            int m = (s + e) / 2;
            sort(arr, s, m);
            sort(arr, m + 1, e);
            merge(arr, s, m, e);
        }
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;
        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j <= e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
