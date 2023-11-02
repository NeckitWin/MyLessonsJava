package lesson;

public class MyArray implements Array {
    int a[] = new int[3];
    int size = 0;

    @Override
    public int Get(int i) {
        return a[i];
    }

    @Override
    public boolean Add(int val) {
        if (size != a.length) {
            a[size] = val;
            size++;
            return true;
        } else
            return false;
    }
}
