package Lesson2;

/*
Дано число x, найти все простые числа от 1 до x (число считается простым, если делится только на себя и на 1)
Нашла пример алгоритма как его решают в других языках - и чет затуп https://en.wikipedia.org/wiki/Primality_test
 */
public class HomeWork2Task5a {
    public static void main(String[] args) {
        int length = 10;
        for (int i = 2; i <= length; i++) {
            boolean isSimple = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                /*если число i не простое,
                //то хотя бы один делитель будет находится в промежутке от 2 до sqrt(i)*/
                if ((i % j) == 0) {
                    //Если j - делитель числа >> false
                    isSimple = false;
                    break;
                }
            }
            //если делителей нет, то isSimple = true
            if (isSimple) {
                System.out.print(i + " ");
            }
        }
    }
}


