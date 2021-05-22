package Lesson1;

public class Lesson1HomeWork {
    public static void main(String[] args) {
        /** TASK 1
         * 1) В переменную записываем число. Надо вывести на экран сколько в этом
         * числе цифр и положительное оно или отрицательное. Например, "это
         * однозначное положительное число". Достаточно будет определить, является ли
         * число однозначным, "двухзначным или трехзначным и более.
         * */


        int a = 311;
        boolean isGreaterThanZero = a >= 0;
        System.out.println("Число a больше 0: " + isGreaterThanZero);
        String aStr = Integer.toString(a);
        int length = aStr.length();
        System.out.println(length);
        //для дробной
        double number = 7.9638;
        boolean type = number % 1 != 0;
        System.out.println("Число дробное: " + type);
        String Str = Double.toString(number);
        int strLength = Str.length();
        System.out.println(strLength - 1);


        /**TASK 2
         * Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
         * Определить существует ли такой треугольник. Дано: a, b, c – стороны предполагаемого треугольника.
         * Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
         * Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
         * Подсказка: используйте тип boolean и логические операции с ним: || - логическое ИЛИ, && - логическое И
         */
        double oneSide = 5;
        double secondSide = 1;
        double thirdSide = 2;
        boolean isTriangleExist = (oneSide < secondSide + thirdSide) && (secondSide < oneSide + thirdSide) && (thirdSide < oneSide + secondSide);
        System.out.println("Существует ли заданный треугольник? " + isTriangleExist);

        /** TASK 3
         * Даны 2 числа. Вывести большее из них. Подсказка: используйте Math.abs(..) для нахождения модуля числа
         **/
        int firstNumber = 8;
        int secondNumber = -10;
        int moduleFirst = Math.abs(firstNumber);
        int moduleSecond = Math.abs(secondNumber);
        System.out.println("Из двух числе большее число : " + Math.max(moduleFirst, moduleSecond));

        /*
        String z = (firstNumber >= secondNumber) ? "Первое число больше второго" : "Второе число больше первого";
        System.out.println(z);
        String d = (Math.abs(firstNumber) >= Math.abs(secondNumber)) ? "Модуль первого числа больше второго" : "Модуль второго числа больше первого";
        System.out.println(d);
        boolean isGreatestNumber = (firstNumber >= secondNumber);
        if (isGreatestNumber) {
            System.out.println("Первое число больше второго");
        } else System.out.println("Второе число больше первого");
        boolean isGreatestByModule = (Math.abs(firstNumber) >= Math.abs(secondNumber));
        if (isGreatestByModule) {
            System.out.println("Модуль первого числа больше второго");
        } else System.out.println("Модуль второго числа больше первого");*/

        /**
         * TASK 4
         * Даны 3 целых числа.
         * Найти количество положительных чисел в исходном наборе.
         * Подсказка: используйте Math.abs(..) для нахождения модуля числа
         */
        int numberOne = -5;
        int numberTwo = 8;
        int numberThree = 0;
        int positive = 0;
        int negative = 0;
        if (numberOne >= 0) {
            positive = positive + 1;
        } else negative = negative + 1;
        if (numberTwo >= 0) {
            positive = positive + 1;
        } else negative = negative + 1;
        if (numberThree >= 0) {
            positive = positive + 1;
        } else negative = negative + 1;
        System.out.println("положительных чисел: " + positive + "," + " отрицательных чисел: " + negative);
    }
}
