public class palindrome {
    public static void main(String[] args) {
        int n = 1214;
        System.out.println(palin(n));
    }

    static int rev = 0;

    static boolean palin(int n) {
        if (n == 0) {
            return true;
        }
        rev = rev * 10 + n % 10;
        palin(n / 10);
        if (n == rev) {
            return true;
        }
        else{
            return false;
        }
    }
}
