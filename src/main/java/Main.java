public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }
    //Задание 1
    //Создать два конструктора.
    //■ С параметром типа int. Задающего начальную емкость
    //массива. Принимает один параметр (задает capacity),
    //выделяет память под массив (size = 0).
    //■ По умолчанию (без параметров).Который выделяет память
    //под массив на 10 элементов, равных нулю (capacity = 10,
    //size = 0). Переиспользовать конструктор с параметрами
    //для уменьшения кода.
    public static void task1(){
        MyArrayList<Integer> arrayList1 = new MyArrayList<Integer>(5);
        System.out.println(arrayList1);
        MyArrayList<Integer> arrayList2 = new MyArrayList<Integer>();
        System.out.println(arrayList2);

    }

    //Задание 2
    //Реализовать методы:
    //■ геттеры для size. Сеттера для size не должно быть!
    //■ переопределить метод toString и реализовать строковое
    //представление элементов массива через пробел.
    //■ ensureCapacity – закрытый метод! проверяет, достаточно
    //ли резерва памяти для хранения указанного в параметре
    //количества элементов. Если значение параметра меньше
    //текущего capacity, то ничего не происходит. Если значение
    //параметра больше текущего capacity, томассив пересоздается, памяти выделяется в 1,5 раза + 1 элемент больше.
    //Существующие элементы переносятся в новый массив.
    //Существующие элементы не должны быть потеряны.
    public static void task2(){
        MyArrayList<Integer> arrayList1 = new MyArrayList<Integer>(3);
        System.out.println(arrayList1.getSize());


    }

    //Задание 3
    //Реализовать методы:
    //■ pushBack (добавление элемента в конец массива. Должна
    //быть проверка, достаточно ли памяти! Если памяти не
    //достаточно увеличить емкость массива данных);
    //■ popFront (удаление первого элемента из массива);
    //■ pushFront (добавление нового элемента в начало массива);
    //■ insert (вставка нового элемента в массив по указанному
    //индексу, с проверкой на выход за пределы массива);
    //■ removeAt(удаление одного элемента по указанному индексу.
    //Должна быть проверка на допустимость индекса);
    //■ remove (удаление одного элемента, значение которого
    //совпадает со значением переданного параметра);
    //3
    //■ removeAll (удаление всех элементов, значения которых
    //совпадает со значением переданного параметра);
    //■ popBack (удаление последнего элемента из массива);
    //■ сlear (обнуление массива – всем элементам массива по
    //индексам от 0 до size-1 присвоить значение null, полю size
    //присвоить значение 0).
    public static void task3(){
        MyArrayList<Integer> arrayList1 = new MyArrayList<Integer>(3);
        System.out.println(arrayList1.getSize());
        arrayList1.pushBack(1);
        System.out.println(arrayList1.getSize());
        System.out.println(arrayList1);
        System.out.println("=======================");
        arrayList1.pushBack(2);
        System.out.println(arrayList1.getSize());
        System.out.println(arrayList1);
        System.out.println("=======================");
        arrayList1.pushBack(3);
        System.out.println(arrayList1.getSize());
        System.out.println(arrayList1);
        System.out.println("=======================");
        arrayList1.pushBack(4);
        System.out.println(arrayList1);
        System.out.println("=======================");
        arrayList1.popFront();
        System.out.println(arrayList1);
        System.out.println(arrayList1.getSize());
        System.out.println("=======================");
        arrayList1.pushFront(1);
        System.out.println(arrayList1);
        System.out.println(arrayList1.getSize());
        System.out.println("=======================");
        arrayList1.insert(5,2);
        System.out.println(arrayList1);
        System.out.println(arrayList1.getSize());
        System.out.println("=======================");
        arrayList1.removeAt(2);
        System.out.println(arrayList1);
        System.out.println(arrayList1.getSize());
        System.out.println("=======================");
        arrayList1.remove(2);
        System.out.println(arrayList1);
        System.out.println(arrayList1.getSize());
        System.out.println("=======================");
        arrayList1.insert(3,2);
        arrayList1.insert(3,2);
        System.out.println(arrayList1);
        System.out.println(arrayList1.getSize());
        System.out.println("=======================");
        arrayList1.removeAll(3);
        System.out.println(arrayList1);
        System.out.println(arrayList1.getSize());
        System.out.println("=======================");
        arrayList1.popBack();
        System.out.println(arrayList1);
        System.out.println(arrayList1.getSize());
        System.out.println("=======================");
        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println(arrayList1.getSize());


    }
}
