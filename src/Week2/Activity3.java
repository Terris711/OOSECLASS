package Week2;

import java.util.*;

public class Activity3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        for (String s : list) {
            list2.add(s + s);
        }
        System.out.println(list);
    }
}
