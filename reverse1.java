public class reverse1 {
    public static void main(String[] args) {
        int n = 1234;
        // System.out.println(rev(n));
        rev(n);
        System.out.println(sum);

    }

    static int sum = 0;
    static void rev(int n){
        if(n == 0){
            return;
        }
        sum = sum *10 + n%10;
        rev(n/10);
    }
}
