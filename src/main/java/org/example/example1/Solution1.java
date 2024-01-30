package org.example.example1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Solution1 {

    public static void main(String[] args) {

        ArrayList<String> week = new ArrayList<>();
        {
            week.add("Понедельник");
            week.add("Вторник");
            week.add("Среда");
            week.add("Четверг");
            week.add("Пятница");
            week.add("Суббота");
            week.add("Воскресенье");
        }

//        week.forEach(x -> System.out.println(x)); // ДЛЯ КАЖДОГО

        week.forEach(System.out::println);

        System.out.println("-".repeat(100));

        System.out.println(week);

//        StringComparator stringComparator = new StringComparator();
//        int compare = stringComparator.compare(week.get(0), week.get(1));
//        System.out.println(compare);

        System.out.println("СТАНДАРТНАЯ РЕАЛИЗАЦИЯ:");
        Collections.sort(week);
        System.out.println(week);

        System.out.println("МОЯ РЕАЛИЗАЦИЯ:");
        // КОМПАРАТОР НА АНОНИМНОМ КЛАССЕ
//        Comparator<String> sComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };


        // КОМПАРАТОР НА ЛЯМБДЕ
        //Comparator<String> sComparator = (o1, o2) -> o1.length() - o2.length();

        Collections.sort(week, (o1, o2) -> o1.length() - o2.length());
        System.out.println(week);


        // ПРИМЕРЫ ФУНКЦ ИНТЕРФЕЙСОВ И ДЛЯ ЧЕГО
        // ТИПИЗИРОВАННЫЙ РЕЗУЛЬТАТ?
        // Function

        // БУЛЕВСКИЙ РЕЗУЛЬТАТ?
        // Predicate
        // etc...

    }
}
