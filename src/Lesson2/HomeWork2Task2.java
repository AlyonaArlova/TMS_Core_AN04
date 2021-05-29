package Lesson2;

import java.util.Scanner;

public class HomeWork2Task2 {
    public static void main(String[] args) {
        /*2.1) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.*/
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите день рождения( от 1 до 31) : ");
        int day = in1.nextInt();
        System.out.print("Введите месяц рождения (от 1 до 12): ");
        int monthBirth = in1.nextInt();
        if (day >= 32 || day < 1 || monthBirth < 1 || monthBirth >= 12) {
            System.out.println("ERROR! Please, enter valid data");
        } else if ((monthBirth == 1) && (day <= 19) || (monthBirth == 12) && (day >= 22)) {
            System.out.println("Capricorn");
        } else if ((monthBirth == 2) && (day <= 18) || (monthBirth == 1) && (day >= 20)) {
            System.out.println("Aquarius");
        } else if ((monthBirth == 3) && (day <= 20) || (monthBirth == 2) && (day >= 19)) {
            System.out.println("Pisces");
        } else if ((monthBirth == 4) && (day <= 19) || (monthBirth == 3) && (day >= 21)) {
            System.out.println("Aries");
        } else if ((monthBirth == 5) && (day <= 20) || (monthBirth == 4) && (day >= 20)) {
            System.out.println("Taurus");
        } else if ((monthBirth == 6) && (day <= 20) || (monthBirth == 5) && (day >= 21)) {
            System.out.println("Gemini");
        } else if ((monthBirth == 7) && (day <= 22) || (monthBirth == 6) && (day >= 21)) {
            System.out.println("Cancer");
        } else if ((monthBirth == 8) && (day <= 23) || (monthBirth == 7) && (day >= 23)) {
            System.out.println("Leo");
        } else if ((monthBirth == 9) && (day <= 22) || (monthBirth == 8) && (day >= 23)) {
            System.out.println("Virgo");
        } else if ((monthBirth == 10) && (day <= 22) || (monthBirth == 9) && (day >= 23)) {
            System.out.println("Libra");
        } else if ((monthBirth == 11) && (day <= 22) || (monthBirth == 10) && (day >= 24)) {
            System.out.println("Scorpio");
        } else if ((monthBirth == 12) && (day <= 21) || (monthBirth == 11) && (day >= 22)) {
            System.out.println("Sagittarius");


        }
    }
}
