public class numberExample{
    public static void main(String[] args) {
        //waf that takes a number and print it
        //print first 5 no
        print(1);
    }

    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}