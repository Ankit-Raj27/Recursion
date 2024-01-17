import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) {
        subSeq("", "abc");
       System.out.println( subSeqRet("", "abc"));
    }

    static void subSeq(String pro, String unPro) {
        if (unPro.isEmpty()) {
            System.out.println(pro);
            return;
        }
        char ch = unPro.charAt(0);
        subSeq(pro + ch, unPro.substring(1));
        subSeq(pro, unPro.substring(1));
    }

    static ArrayList<String> subSeqRet(String pro, String unPro) {
        if (unPro.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = unPro.charAt(0);
        ArrayList<String> left = subSeqRet(pro + ch, unPro.substring(1));
        ArrayList<String> right = subSeqRet(pro, unPro.substring(1));
        left.addAll(right);
        return left;
    }
}
