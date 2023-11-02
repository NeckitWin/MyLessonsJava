package collection;

import java.util.*;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder [] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
    }
}
