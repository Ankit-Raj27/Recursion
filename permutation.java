import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        perm("","abc");
        System.out.println(permutation("", "abc"));
    }

    static void perm(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);     
        for(int i = 0; i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            perm(first+ch+second,up.substring(1));
        }   
    }

    static ArrayList<String> permutation(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0 ; i<=p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutation(first+ch+second, up.substring(1)));
        }
        return ans;
    } 
}
