import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        subSeqAscii("", "abc");
        System.out.println("\n" + subSeqAsciiReturn("", "abc"));
    }

    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqAscii(p + " " + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subSeqAsciiReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqAsciiReturn(p + " " + (ch + 0), up.substring(1));
        return first;
    }
}
