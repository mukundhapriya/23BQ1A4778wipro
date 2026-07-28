package stringjoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class JoinNames {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Sita");
        names.add("Krishna");
        names.add("Ravi");

        StringJoiner sj = new StringJoiner(", ", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}