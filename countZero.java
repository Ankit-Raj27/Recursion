public class countZero {
    public static void main(String[] args) {
        int n = 1000010;
        System.out.println(count(n,c));
    }

    static int c = 0;
    static int count(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            c++;
        }
        return count(n/10,c);
    }

}
