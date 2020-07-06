package ru.geekbrains.Java2;

import java.util.ArrayList;

public class MainX {
    public static void main(String[] args) {
//        homeWorkFirstPoint();
        homeWorkSecondPoint();
    }


    private static void homeWorkFirstPoint() {
        String[] words = {
                "коллекции",
                "представляют",
                "собой",
                "контейнеры",
                "которые",
                "хранят",
                "в",
                "себе",
                "множество",
                "элементов",
                "и",
                "позволяют",
                "работать",
                "с",
                "этой",
                "группой",
                "элементов",
                "как",
                "с",
                "одним",
                "объектов",
                "коллекции",
                "используются",
                "для",
                "хранения",
                "получения",
                "обработки",
                "множества",
                "объектов"
        };
        System.out.println("Исходный набор: ");
        for (String s : words) {
            System.out.print(s + ", ");
        }
        System.out.println();
        StringHandler stringHandler = new StringHandler(words);
        System.out.println("Уникальные значения: ");
        System.out.println(stringHandler.returnOnlyUnique());
        System.out.println("Повторы слов: ");
        System.out.println(stringHandler.countWordsAmount());
    }


    private static void homeWorkSecondPoint() {

    }
}
