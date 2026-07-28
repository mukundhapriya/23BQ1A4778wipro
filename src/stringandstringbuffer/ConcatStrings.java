package stringandstringbuffer;

public class ConcatStrings {

    public static void main(String[] args) {

        String s1 = "Sachin";
        String s2 = "Tendulkar";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            System.out.println(s1 + s2.substring(1));
        } else {
            System.out.println(s1 + s2);
        }
    }
}