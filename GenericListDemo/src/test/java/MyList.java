import java.util.ArrayList;

public class MyList<T> {

    private int size = 0;
    private int capacity;
    T[] list;
    T[] listTemp;

    public int getCapacity() {

        return capacity;
    }

    public void setCapacity(int capacity) {

        this.capacity = capacity;
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public MyList() {
        setCapacity(10);
        this.list = (T[]) new Object[getCapacity()];
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        this.list = (T[]) new Object[getCapacity()];
    }

    public void insert(T data) {
        if (this.size < this.capacity - 1) {
            list[size] = data;
            setSize(getSize() + 1);

        } else {
            listTemp = (T[]) new Object[this.capacity];
            setCapacity(getCapacity() * 2);
            int index = 0;
            for (T value : list) {
                listTemp[index] = value;
                index++;
            }

            index = 0;
            this.list = (T[]) new Object[getCapacity()];

            for (T value : listTemp) {
                list[index] = value;
                index++;
            }
            list[size] = data;
            setSize(getSize() + 1);
        }

    }

    public T get(int index) {
        if (index <= getSize()) {
            return list[index];
        }
        return null;
    }

    public void remove(int index) {
        if (index <= getSize()) {
            for (int i = index + 1; i < list.length; i++) {
                list[i - 1] = list[i];
            }

        } else {
            System.out.println("Wrong index");
        }
        setSize(getSize() - 1);
    }

    public void set(int index, T data) {
        if (index <= getSize()) {
            list[index] = data;
        }
    }

    public String toString() {
        ArrayList<T> printList = new ArrayList<>();
        for (T data : list) {
            if (data != null) {
                printList.add(data);
            }
        }
        return printList.toString();
    }

    public int indexOf(T data) {
        int index = 0;
        for (T find : list) {
            if (find == data) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {

        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                return false;
            }
        }
        return true;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[getSize()];
        for (int i = 0; i < getSize(); i++) {
            array[i] = list[i];
        }
        return array;
    }

    public void clear() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
    }

    public MyList<T> subList(int startIndex, int finishIndex) {

        MyList<T> array = new MyList<>();
        for (int i = startIndex; i <= finishIndex; i++) {
            array.insert(list[i]);
        }
        return array;
    }

    boolean contains(T data) {
        for (T find : list) {
            if (find == data) {
                return true;
            }
        }
        return false;
    }
}
