package Lesson2;
/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class HomeWork2Task3 {

    public static void main(String[] args) {
        int number =0;
        for ( int i =0; i< 100; i++) {
            if (i % 2 != 0) {
                number += i;
                i++;
            }
        }
            System.out.println(number);
        }
    }

