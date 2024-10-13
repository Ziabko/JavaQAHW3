import java.util.ArrayList;

public class ConvertToSorted {


// Реализовать метод convertToSorted, который принимает на вход неотсортированный массив ArrayList и
// возвращает новый отсортированный массив.
//При реализации этоого метода использовать написанный в предыдущем задании метод insertSorted().
//Пример 1: исходный массив: [23, 18, 17, 9, 5], результат [5, 9, 17, 18, 23]

        public static void insertSorted(ArrayList<Integer> arr, Integer inserted) {
            if (arr.isEmpty()) {
                arr.add(inserted);
                return;
            }

            int i = 0;
            while (i < arr.size() && arr.get(i) < inserted) {
                i++;
            }

            arr.add(i, inserted);
        }

        public static ArrayList<Integer> convertToSorted(ArrayList<Integer> unsortedArr) {
            ArrayList<Integer> sortedArr = new ArrayList<>();

                for (int i = 0; i < unsortedArr.size(); i++) {
                Integer num = unsortedArr.get(i); //gолучаем текущий элемент массива
                insertSorted(sortedArr, num);  // вставляем элемент в отсортированный массив
            }

            return sortedArr;
        }

        public static void main(String[] args) {
            // Пример 1
            ArrayList<Integer> unsortedArr1 = new ArrayList<>();
            unsortedArr1.add(23);
            unsortedArr1.add(18);
            unsortedArr1.add(17);
            unsortedArr1.add(9);
            unsortedArr1.add(5);
            ArrayList<Integer> sortedArr1 = convertToSorted(unsortedArr1);
            System.out.println(sortedArr1);

        }
    }
