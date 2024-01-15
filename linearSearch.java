import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18, 18, 9 };
        int tar = 18;
        System.out.println(search(arr, tar, 0));
        System.out.println(findIndex(arr, tar, 0));
        findAll(arr, tar, 0);
        System.out.println(list);
        ArrayList<Integer> ans = findAllList(arr, tar, 0, new ArrayList<>());
        System.out.println(ans);
        System.out.println(findAllList2(arr, tar, 0));
    }

    static boolean search(int[] arr, int tar, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == tar || search(arr, tar, i + 1);

    }

    static int findIndex(int[] arr, int tar, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == tar) {
            return i;
        }
        return findIndex(arr, tar, i + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAll(int[] arr, int tar, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == tar) {
            list.add(i);
        }
        findAll(arr, tar, i + 1);

    }

    static ArrayList<Integer> findAllList(int[] arr, int tar, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == tar) {
            list.add(i);
        }
        return findAllList(arr, tar, i + 1, list);
    }

    static ArrayList<Integer> findAllList2(int[] arr, int tar, int i) {
        ArrayList<Integer> list = new ArrayList<>();

        if (i == arr.length) {
            return list;
        }
        if (arr[i] == tar) {
            list.add(i);
        }
        ArrayList<Integer> ansFromBelow = findAllList2(arr, tar, i + 1);
        list.addAll(ansFromBelow);
        return list;
    }

}
