public class Main {
    public static void main(String[] args) {
        task1();
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
        MyArrayList arrayList1 = new MyArrayList<Integer>(5);
        System.out.println(arrayList1);
        MyArrayList arrayList2 = new MyArrayList<Integer>();
        System.out.println(arrayList2);

    }
}
