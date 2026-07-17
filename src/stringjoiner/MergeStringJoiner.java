package stringjoiner;

import java.util.StringJoiner;

public class MergeStringJoiner {

    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");

        s1.add("Hyderabad");
        s1.add("Vijayawada");
        s1.add("Guntur");

        StringJoiner s2 = new StringJoiner("-");

        s2.add("Chennai");
        s2.add("Bangalore");
        s2.add("Mumbai");

        // i) s1 merged to s2
        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s2);
        merge1.merge(s1);
        System.out.println("s1 merged to s2 : " + merge1);

        // ii) s2 merged to s1
        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s1);
        merge2.merge(s2);
        System.out.println("s2 merged to s1 : " + merge2);
    }
}