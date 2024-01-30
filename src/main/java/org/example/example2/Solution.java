package org.example.example2;

public class Solution {
    public static void main(String[] args) {

        // РЕАЛИЗАЦИЯ ЛЯМБДЫ С МНОГОСТРОЧНОЙ ЛОГИКОЙ

        Calculable summator = ((x, y) -> {

            int value = x*2 + y*2;
            System.out.println("Я тут вычисляю, пока ты смотришь!");
            return value * 10;
        });

        int a = summator.calculate(9, 10);

        System.out.println(a);


        // РЕАЛИЗАЦИЯ ЛЯМБДЫ С ОДНОСТРОЧНОЙ ЛОГИКОЙ

        Calculable subtrator = ((x, y) -> x - y);
        System.out.println(subtrator.calculate(99, 90));

    }
}
