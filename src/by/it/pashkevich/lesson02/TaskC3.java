package by.it.pashkevich.lesson02;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3,86
Земля   9,81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/


import java.util.Scanner;

public class TaskC3 {

    public static void main(String[] args) {
        System.out.print("Введите вес человека в килограммах: ");
        Scanner sc = new Scanner(System.in);
        int w_earth = sc.nextInt();
        double w_mars = getWeight(w_earth);
        System.out.println("Вес человека на Марсе в килограммах: " + w_mars);
    }

    public static double getWeight(int weight) {
        double result = (weight * 3.86) / 9.81;

        result = result * 100;
        int i = (int) Math.round(result);
        result = (double) i / 100;

        return result;
    }
}



