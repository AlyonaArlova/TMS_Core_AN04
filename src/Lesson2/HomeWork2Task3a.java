package Lesson2;

import static java.lang.Math.pow;

/*
3.2) Вычислить: 1+2+4+8+...+256
 */
public class HomeWork2Task3a {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 9; i++)
            sum = sum + pow(2, i);
        System.out.println(sum);
    }
}


