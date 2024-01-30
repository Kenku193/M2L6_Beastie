package org.example.example4;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {

        // КОЛЛЕКЦИЯ, В КОТОРОЙ БУДЕМ ХРАНИТЬ ОБЪЕКТЫ Car
        ArrayList<Car> garage = new ArrayList<>();

        // ДОБАВЛЯЕМ ОБЪЕКТЫ В КОЛЛЕКЦИЮ
        garage.add(new Car(Color.RED, "TOYOTA", 150, 1992));
        garage.add(new Car(Color.GREEN, "NISSAN", 200, 2001));
        garage.add(new Car(Color.INDIGO, "HONDA", 220, 2020));
        garage.add(new Car(Color.VIOLET, "VW", 199, 2021));
        garage.add(new Car(Color.RED, "BMW", 1, 1995));
        garage.add(new Car(Color.RED, "BMW", 1, 2020));
        garage.add(new Car(Color.RED, "BMW", 1, 2024));
        garage.add(new Car(Color.YELLOW, "MASERATI", 1000, 1992));
        garage.add(new Car(Color.BLUE, "TESLA", 999, 1993));

        // ПОЛУЧАЕМ ОБЪЕКТ СТРИМА ИЗ КОЛЛЕКЦИИ
        Stream<Car> carStream = garage.stream();
        // ТЕПЕРЬ МОЖЕМ ПОЛЬЗОВАТЬСЯ МЕТОДАМИ СТРИМОВ ПО ОТНОШЕНИЮ К ПОЛУЧЕННОМУ ОБЪЕКТУ:


        //System.out.println(carStream.anyMatch(car -> car.color == Color.BLUE));// Есть ли хоть одно совпадение?
        System.out.println(carStream.allMatch(car -> car.year == 2020)); // Все ли машины такого-то года?


        System.out.println();

        // ПРИМЕР ЦЕПОЧКИ ВЫЗОВОВ
        List<Car> selected = garage.stream()                // ПОЛУЧАЕМ ОБЪЕКТ СТРИМА // stream source в данном случае garage
                .filter(car -> car.color.equals(Color.RED)) // ФИЛЬТР - ОБЫЧНАЯ ЛЯМБДА, ГДЕ МЫ САМИ ПИШЕМ РЕАЛИЗАЦИЮ - ФИЛЬТРУЕМСЯ ПО ЦВЕТУ // intermediate method
                .filter(car -> car.year > 2000)             // ОПЯТЬ ФИЛЬТР - ФИЛЬТРУЕМСЯ ПО ГОДУ // intermediate method
                .limit(10)                          // ОГРАНИЧИТЕЛЬ ПО КОЛИЧЕСТВУ - ТОЛЬКО ПЕРВЫЕ 10 ОБЪЕКТОВ БУДУТ ВЗЯТЫ // intermediate method
                .collect(Collectors.toList());              // СОБИРАЕМ ВСЕ В КОЛЛЕКЦИЮ И ВОЗВРАЩАЕМ В ПЕРЕМЕННУЮ selected // terminal method


        System.out.println(selected);

    }

    // ПРИМЕР ФИЛЬТРАЦИИ ПРИ ПОМОЩИ ОБЫЧНОГО МЕТОДА
    private static List<Car> selectByColor(List<Car> list, Color c) {
        List<Car> selected = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).color == c) {
                selected.add(list.get(i));
            }
        }
        return selected;
    }

}
