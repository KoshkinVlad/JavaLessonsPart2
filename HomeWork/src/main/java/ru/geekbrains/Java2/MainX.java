package ru.geekbrains.Java2;

public class MainX {
    public static void main(String[] args) throws Not4By4Exception, NumberFormatException, NullPointerException {
        String s = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String[][] spitedStringArray=null;
        StringToArray worker=new StringToArray(s);
        try {
            spitedStringArray=worker.splitArray();   // разбиваем на массив типа String[][]
            System.out.println("Массив String[][]:");
            worker.printStringArray(spitedStringArray);         // печатаем получившийся массив
        }
        catch (Not4By4Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int[][] spitedIntArray = worker.transferArray(spitedStringArray);   // преобразуем в массив типа int[][]
            System.out.println("Массив int[][]:");
            worker.printIntArray(spitedIntArray);   // распечатываем полученный массив
            System.out.println(worker.arithmeticActions(spitedIntArray));   // делаем необходимые арифметические операции
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }
        catch (NullPointerException e) {
            System.out.println("Ошибка...");
        }

    }
}
