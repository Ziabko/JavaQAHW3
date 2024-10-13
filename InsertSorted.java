import java.util.ArrayList;

public class InsertSorted {

//    Реализовать метод insertSorted, который принимает на вход отсортированный по возрастанию массив ArrayList и целое число типа Integer.
//    Метод должен вставить переданное число в нужное место массива, чтобы массив остался отсортированным по возрастанию элементов.
//    Вставки элемента на нужную позицию: arr.add(index, value) Размер массива: arr.size() Значение элемента на нужной позиции: arr.get(index)
//    Пример 1: исходный массив: [5, 9, 17, 18, 23], вставляем число 14, результат [5, 9, 14, 17, 18, 23]
//    Пример 2: исходный массив: [5, 9, 17, 18, 23], вставляем число 3, результат [3, 5, 9, 17, 18, 23]
//    Пример 3: исходный массив: [], вставляем число 7, результат [7]

    public static void insertSorted(ArrayList<Integer> arr, Integer inserted) {
        if (arr.isEmpty()) { // если массив пуст
            arr.add(inserted);
            return;
        }
        // arr.add - метод вставки элемента в динамический массив ArrayList
        // arr.add(element) — добавляет элемент в конец списка.
        // arr.add(index, element) — добавляет элемент на указанную позицию в списке, сдвигая остальные элементы вправо.

        int i = 0;

        // Поиск подходящего индекса для вставки
        while (i < arr.size() && arr.get(i) < inserted) {
            i++;
        }

        // Вставляем число на найденную позицию
        arr.add(i, inserted);
    }

    public static void main(String[] args) {
        // Пример 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(9);
        arr1.add(17);
        arr1.add(18);
        arr1.add(23);
        insertSorted(arr1, 14);
        System.out.println(arr1);

        // Пример 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(5);
        arr2.add(9);
        arr2.add(17);
        arr2.add(18);
        arr2.add(23);
        insertSorted(arr2, 3);
        System.out.println(arr2);

        // Пример 3
        ArrayList<Integer> arr3 = new ArrayList<>();
        insertSorted(arr3, 7);
        System.out.println(arr3);
    }
}
