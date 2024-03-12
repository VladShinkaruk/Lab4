package Lab3;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        // Заполнение массива значениями, введенными пользователем
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        // Выполнение сортировки выбором
        selectionSort(array);
        System.out.println("Отсортированный массив:");
        // Вывод отсортированного массива
        printArray(array);

        scanner.close();
    }

    //  Метод для сортировки массива методом выбора.
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // Проходим по всему массиву
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Находим индекс минимального элемента
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами найденный минимальный элемент с первым в неотсортированной части
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Вывод текущего состояния массива после каждого шага сортировки
            System.out.println("Шаг " + (i + 1) + ":");
            printArray(arr);
        }
    }

    // Вспомогательный метод для вывода массива на экран.
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}