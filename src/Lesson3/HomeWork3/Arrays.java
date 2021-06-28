package Lesson3.HomeWork3;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        //Найти произведение элементов, кратных 3.
        int[] arr;
        double common = 1;
        arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 15));
            System.out.print(arr[i]);
            if (arr[i] % 3 == 0) {
                common *= arr[i];
            }
        }
        System.out.println("   Произведение равно " + common);
        taskNumber2();
        taskNumber3();
    }


    private static void taskNumber2() {
        //Найти наименьший нечетный элемент.
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = new Random().nextInt(33) - 15;
        }

        int min = array[0];
        for (int i = 1; i < n; ++i) {
            if (array[i] % 2 == 1 && array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    private static void taskNumber3() {
        // [0; 20]
        int n = 15;
        int[] arr1 = new int[n];
        for (int i = 0; i < n; ++i) {
            arr1[i] = new Random().nextInt(21);
        }
        // при условии что n > 1
        // 1 2 5 10 8 6
        // boolean переменные называют флагами
        boolean isUnique = true;
        for (int i = 0; i < arr1.length; ++i) {
            if (!isUnique) {
                break;
            }
            int numberToCheck = arr1[i];
            for (int j = i + 1; j < arr1.length; ++j) {
                if (numberToCheck == arr1[j]) {
                    isUnique = false;
                    break;
                }
            }
        }
        System.out.println(isUnique);
    }
}