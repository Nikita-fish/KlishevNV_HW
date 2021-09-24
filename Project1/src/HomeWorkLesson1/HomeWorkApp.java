package HomeWorkLesson1;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main (String [] args){
//        printThreeWords();
//        checkSumSign();
//        checkSumSign1();
//        printColor();
        printColor1();
//        compareNumbers();
//        compareNumbers1();
    }
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // метод с заранее инициализированными значениями
    public static void checkSumSign () {
        int a = 15;
        int b = -20;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // метод с вводом чисел из консоли
    public static void checkSumSign1 () {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("ведите второе число");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // метод с заранее инициализированным числом
    public static void printColor () {
        int a = 101;
        if (a <= 0) {
            System.out.println("Красный");
        } else if (100 >= a && a > 0){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // метод с вводом числа из консоли
    public static void printColor1 () {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a <= 0) {
            System.out.println("Красный");
        } else if (100 >= a && a > 0){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // метод с заранее инициализированным числом
    public  static void compareNumbers () {
        int a = 10;
        int b = -15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // метод с вводом числа из консоли
    public  static void compareNumbers1 () {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("ведите второе число");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
