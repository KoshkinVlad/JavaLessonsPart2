package ru.geekbrains.Java2;

public class StringToArray {
    String init;

    public StringToArray(String init) {
        this.init = init;
    }

    // преобразование в двумерный массив типа String[][]
    public String[][] splitArray() throws Not4By4Exception {
        String[] rows = init.split("\n");
        String[][] cells = new String[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            cells[i] = rows[i].split(" ");
        }

        boolean temp = true;
        for (int i = 0; i < cells.length; i++) {
            if (cells[i].length != 4) {
                temp = false;
                break;
            }
        }
        if (cells.length != 4 || !temp) {
            throw new Not4By4Exception();
        }
        return cells;
    }

    public int[][] transferArray(String[][] cells) {
        int[][] array = new int[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++) {
            for (int k = 0; k < cells[0].length; k++) {
                array[i][k] = Integer.parseInt(cells[i][k]);
            }
        }
        return array;
    }

    public void printStringArray(String[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int k = 0; k < cells[0].length; k++) {
                System.out.print(cells[i][k] + " ");
            }
            System.out.println();
        }
    }

    public void printIntArray(int[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int k = 0; k < cells[0].length; k++) {
                System.out.print(cells[i][k] + " ");
            }
            System.out.println();
        }
    }

    public int arithmeticActions(int[][] cells) {
        int sum = 0;
        for (int[] rows : cells) {
            for (int cell : rows) {
                sum += cell;
            }
        }
        return sum / 2;
    }
}
