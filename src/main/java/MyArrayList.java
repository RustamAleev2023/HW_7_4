import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrayList<T> {
    private T[] data;
    private int size;
    private int capacity;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.data =(T[]) new Object[capacity];
    }

    public MyArrayList() {
        this(10);
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < data.length; i++) {
            joiner.add(String.valueOf(data[i]));
        }
        return joiner.toString();
    }

    private void ensureCapacity(int size) {
        if (size > capacity) {
            capacity = (int) (capacity * 1.5 + 1);
            data = Arrays.copyOf(data, capacity);
        }
    }
}
