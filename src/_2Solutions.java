public class _2Solutions {
    public static void main(String[] args) {
          /*Задача №1
    Необходимо создать целочисленные переменные a и b, присвоить произвольные
    значения переменным на ваш выбор и вывести результаты следующих операций с
    этими переменными: сложение, умножение, вычитание, деление.*/

        int a = 9;
        int b = 3;
        int c;

        c = a + b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);


   /* Экстра задача
    Также вывести остаток от деления и сделать проверку на четность этих переменных.*/
        int d = 2;
        a = 9;
        b = 4;
        c = a % b;
        System.out.println(c);

        if (a % d != 0) {
            System.out.println("Число a - нечетное");
        } else {
            System.out.println("Число a - четное");
        }
        if (b % d != 0) {
            System.out.println("Число b - нечетное");
        } else {
            System.out.println("Число b - четное");
        }

   /* Экстра задача
    Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом)*/

        System.out.println("\ud83d\ude43");
    }
}
