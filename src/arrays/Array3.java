package arrays;//  Дан отсортированный массив целых чисел  и число.
//  Написать метод, который возвращает  true, если
//  в массиве есть 2 числа, произведение которых равно заданному числу.
//  Пример:
//  {2, 5, 18, 50}, 36 -> true
//  {2, 5, 18, 50}, 40 -> false

import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {

        int[] array = {2, 5, 18, 50};


        int number = 36;

        System.out.println(Arrays.toString(array) + "... " + number + " -----> " + isSumOfNumberFromArray(array, number));

        number = 40;
        System.out.println(Arrays.toString(array) + "... " + number + " -----> " + isSumOfNumberFromArray(array, number));


    }

    private static boolean isSumOfNumberFromArray(int[] arr, int number) {
        boolean flag = false;
        int i = 0;
        while (i < arr.length) {
            for (int a = i + 1; a < arr.length; a++) if (arr[i] * arr[a] == number) {
                flag=true;
            }
            return flag;
        }
        return false;
    }
}