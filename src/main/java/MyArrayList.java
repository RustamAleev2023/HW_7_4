
import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrayList<T> {
    private T[] data;
    private int size;
    private int capacity;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
    }

    public MyArrayList() {
        this(10);
        Arrays.fill(data, null);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < data.length; i++) {
            joiner.add(String.valueOf(data[i]));
        }
        return joiner.toString();
    }

    public void ensureCapacity(int amount) {
        if (amount > capacity - getSize()) {
            capacity = (int) (capacity * 1.5 + 1);
            data = Arrays.copyOf(data, capacity);
        }
    }

    public void pushBack(T element) {
        if (size >= capacity) {
            ensureCapacity(size);
        }
        data[size] = element;
        size++;
    }

    public void popFront() { //удаляем первый элемент в массиве. После удаления, все элементы сдвагаем влево.
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        data[data.length - 1] = null;
        size--;
    }

    public void pushFront(T element) {
        int oldCapacity = size;
        if (size == capacity) {
            ensureCapacity(1);
        }
        for (int i = oldCapacity; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = element;
        size++;
    }

    public void insert(T element, int index) {
        if (!(index > 0 && index < data.length)) {
            System.out.println("Такого индекса нет в массиве");
        } else {
            if (size == capacity) {
                ensureCapacity(1);
            }
            for (int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = element;
        }
        size++;
    }

    public void removeAt(int index) {
        if (!(index > 0 && index < data.length)) {
            System.out.println("Такого индекса нет в массиве");
        } else {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data[data.length - 1] = null;
        }
        size--;
    }

    public void remove(T element) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                index = i;
                break;
            }
        }
        removeAt(index);
    }

    public void removeAll(T element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                data[i] = null;
                size--;
            }
        }
        int i = 0;
        int j = 0;
        while (j < data.length) {
            if (data[i] == null && data[j] != null) {
                data[i] = data[j];
                data[j] = null;
            }
            if (data[i] != null) {
                i++;
            }
            j++;
        }
    }

    public void popBack() {
        if(data[data.length - 1] != null){
            size--;
        }
        data = Arrays.copyOf(data, data.length - 1);

    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void trimToSize(){
        capacity = size;
        T[] temp = Arrays.copyOf(data,size);
        data = (T[]) new Object[capacity];
        for (int i = 0; i < data.length; i++) {
            data[i] = temp[i];
        }
    }

    public int indexOf(T element){
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == element){
                result = i;
                break;
            }
        }
        return result;
    }

    public int lastIndexOf(T element){
        int result = -1;
        for (int i = data.length - 1; i >=0 ; i--) {
            if(data[i] == element){
                result = i;
                break;
            }
        }
        return result;
    }
}
