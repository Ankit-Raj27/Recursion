public class skipString {
    public static void main(String[] args) {
        System.out.println(skipApple("skdnapplends"));
    }

    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        // char ch = str.charAt(0);
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        return str.charAt(0)+skipApple(str.substring(1));
    }
}
