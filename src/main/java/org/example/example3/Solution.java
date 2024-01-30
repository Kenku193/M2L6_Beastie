package org.example.example3;

public class Solution {
    public static void main(String[] args) {

        /* НА ОСНОВАНИИ ФУНКЦИОНАЛЬНОГО ИНТЕРФЕЙСА МЫ МОЖЕМ ВОСПОЛЬЗОВАТЬСЯ КАК ЛЯМБДОЙ...
           ТАК И ССЫЛКОЙ НА МЕТОД, ВЕДЬ "ПОД КАПОТОМ" В JVM ПРОИСХОДИТ ОДНО И ТО ЖЕ

           НО! КОГДА МЫ ХОТИМ ВОСПОЛЬЗОВАТЬСЯ НЕ ПРОСТО МЕТОДОМ, А КОНСТРУКТОРОМ КЛАССА
           ПОСЛЕ :: МЫ ПИШЕМ КЛЮЧЕВОЕ СЛОВО new
         */

        UserFactory uF = User::new;
        User user1 = uF.create("Ivan", "Petrov");

        System.out.println(user1);


    }
}
