package ru.geekbrains.Java2;

public class Not4By4Exception extends Exception {

    public Not4By4Exception() {
        super("Введённая строка не является массивом 4х4!");
    }

    @Override
    public String getMessage() {
        return "Введённая строка не является массивом 4х4!";
    }
}
