public class countPermutation {
    public static void main(String[] args) {
        int ans = count("", "abc");
        System.out.println(ans);
    }
    static int count(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1;

        }
        char ch = up.charAt(0);
        int count = 0;
        for(int i =0 ; i<=p.length();i++){
            String first = p.substring(0,i);
            String last = p.substring(i, p.length());
            count(first + ch + last, up.substring(1));
            count = count + count(first + ch + last, up.substring(1));
        }
        return count;
    }
}
