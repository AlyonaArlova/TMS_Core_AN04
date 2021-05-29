package Lesson2;

/*Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?*/
public class HomeWork2Task3b {
    public static void main(String[] args) {
        double firstDayRunValue = 10.0;
        double newDayRunValue = firstDayRunValue;
        double sum = 0;
        for (int a = 0; a < 6; a++) {
            newDayRunValue = newDayRunValue + newDayRunValue * 0.1;
            sum += newDayRunValue;
        }
        System.out.println("суммарный путь = " + sum);
    }
}

