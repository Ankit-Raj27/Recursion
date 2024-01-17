import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subSet(arr);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> main = new ArrayList<>();

        main.add(new ArrayList<>());
        for(int num : arr){
            int n = main.size();
            for(int i = 0; i<n ; i++){
                List<Integer> inner = new ArrayList<>(main.get(i));
                inner.add(num);
                main.add(inner);
            }
        }
        return main;
    }
}
