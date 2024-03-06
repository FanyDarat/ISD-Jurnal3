import java.util.*;

public class GenArray<E extends Comparable<? super E> & Deleteable> {
    private final ArrayList<E> list;

    public GenArray(int capacity) {
        int initcapacity = capacity > 0 ? capacity : 0;
        list = new ArrayList<>(initcapacity);
    }

    public void addData(E value) {
        list.add(value);
    }

    public void display() {
        System.out.println("Ini");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(list.get(i) + " ");
        }
        System.out.println();
    }

    public void displayShort() {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(list.get(i) + " ");
        }
        System.out.println();
    }

    public void removeData(String key) {
        for (E i : list) {
            if (key.equals(i.toRemove())) {
                list.remove(i);
            }
        }
    }

    public void setData(E object1, E object2) {
        int index = list.indexOf(object1);
        list.add(index, object2);
    }

    public int size() {
        return list.size();
    }
}
