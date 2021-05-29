package Lesson2;

import java.util.Scanner;

public class HomeWork2Task1 {
    public static void main(String[] args) {
        /*Написать программу, которая читает введеное с консоли число. Число должно быть от 1 до 12.
        Напечатать на консоль название месяца, которое соответствует введеному числу (например 1 - Январь)
         Если число неправильное (не от 1 до 12), напечатать на консоль сообщение,
          информирующее об ошибке (например "Неправильное число, должно быть от 1 до 12)
         Для считывание числа с консоли используйте
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int month = in.nextInt();
        switch (month) {
            case 1: {
                System.out.println("Вы ввели 1 - месяц январь");
                break;
            }
            case 2: {
                System.out.println("Вы ввели 2 - месяц февраль");
                break;
            }
            case 3: {
                System.out.println("Вы ввели 3 - месяц март");
            }
            ;
            case 4: {
                System.out.println("Вы ввели 4 - месяц апрель");
                break;
            }
            case 5: {
                System.out.println("Вы ввели 5 - месяц май");
                break;
            }
            case 6: {
                System.out.println("Вы ввели 6 - месяц июнь");
                break;
            }
            case 7: {
                System.out.println("Вы ввели 7 - месяц июль");
                break;
            }
            case 8: {
                System.out.println("Вы ввели 8 - месяц август");
                break;
            }
            case 9: {
                System.out.println("Вы ввели 9 - месяц сентябрь");
                break;
            }
            case 10: {
                System.out.println("Вы ввели 10 - месяц октябрь");
                break;
            }
            case 11: {
                System.out.println("Вы ввели 11 - месяц ноябрь");
                break;
            }
            case 12: {
                System.out.println("Вы ввели 12 - месяц декабрь");
                break;
            }
            default: {
                System.out.println("Вы ыыели неверное число. Пожалуйста, введите число от 1 до 12");
            }
        }
        in.close();

    }
}
