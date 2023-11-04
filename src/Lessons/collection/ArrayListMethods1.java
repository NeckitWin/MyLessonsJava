package Lessons.collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main (String[] args){
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Nikita");
        arrayList1.add("Aurora");
        arrayList1.add(0,"Alisa");
        arrayList1.add("Anton");
//      ArrayList.add(Место в массиве,"Элемент");
        for (String s:arrayList1){
            System.out.print(s + " ");
        }
        System.out.println("");
        // Нельзя добавлять примитивные виды данных по типу int
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(5);

//        for(int i=0;i<arrayList1.size();i++) {
//            System.out.println(arrayList1.get(i));
//        }
        // Вывод с помощью for и get

        arrayList1.set(3, "Kasha");
        arrayList1.remove(0);

        System.out.println(arrayList1);
//        Set заменяет данные, а remove удаляет



    }
}
