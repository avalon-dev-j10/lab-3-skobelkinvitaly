package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;

public class Main {

    public static void main(String[] args) {
        /*
        *Cоздадим массив из 20 целых чисел и сохраним ссылку в переменную array0
         */
        int[] array0 = new int[20];
        /*
        *Проинициализируем массив последовательностью чисел Фибоначчи
         */
        Initializer initializer0 = new FibonacciInitializer();
        initializer0.initialize(array0);
        /*
        *Найдём сумму всех элементов массива array0
         */
        int sumarray0 = 0;
        for (int i = 0; i < array0.length; i++) {
            sumarray0 += array0[i];
        }
        /*
        *Проинициализируем массив array1  последовательностью случайных чисел от -50 до 50
         */
        Initializer initializer1 = new RandomInitializer();
        int[] array1 = new int[20];
        initializer1.initialize(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        /*
        *Отсортируем массив array1 методом пузырьковой сортировки
         */
        Sort arrayBubbleSort = new BubbleSort();
        arrayBubbleSort.sort(array1);
        /*
        *Проинициализируем массив array2  последовательностью случайных чисел от -50 до 50
         */
        Initializer initializer2 = new RandomInitializer();
        int[] array2 = new int[20];
        /*
        *Отсортируем массив array2 методом сортировки вставками
         */
        initializer2.initialize(array2);
        Sort arraySelectionSort = new SelectionSort();
        arraySelectionSort.sort(array2);
        /*
        *Проинициализируем массив array3 последовательностью случайных чисел от -50 до 50
         */
        Initializer initializer3 = new RandomInitializer();
        int[] array3 = new int[20];
        /*
        *Отсортируем массив arra3 методом сортировки Шелла
         */
        initializer3.initialize(array3);
        Sort arrayShellSort = new SelectionSort();
        arrayShellSort.sort(array3);
    }
}
