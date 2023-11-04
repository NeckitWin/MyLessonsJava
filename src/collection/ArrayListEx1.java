package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
    // Создаём коллекцию
    // ArrayList <DataType> list1 = new ArrayList <DataType> ();
    ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Nikita");
        arrayList1.add("Anton");
        arrayList1.add("Alisa");

        System.out.println(arrayList1);

    ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Nikita");
        arrayList2.add("Alisa");
    List<String> arrayList3 = new ArrayList<>();
    ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        System.out.println(arrayList1==arrayList4);
    }
}
