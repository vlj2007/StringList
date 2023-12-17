package pro.sky.StringList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringList str2 = new StringListImpl(4);
        System.out.println(str2.add("Элемент1"));
        System.out.println(str2.add("Элемент2"));
        str2.remove("Элемент1");
        System.out.println(Arrays.toString(str2.toArray()));
        System.out.println(str2.contains("Элемент1"));
        System.out.println(str2.contains("Элемент2"));
    }
}
