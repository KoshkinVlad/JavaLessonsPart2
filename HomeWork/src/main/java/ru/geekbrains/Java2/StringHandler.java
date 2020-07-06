package ru.geekbrains.Java2;

import java.util.ArrayList;
import java.util.HashMap;

public class StringHandler {
    String[] init;

    public StringHandler(String[] init) {
        this.init = init;
    }

    public ArrayList<String> returnOnlyUnique() {
        ArrayList<String> onlyUnique = new ArrayList<String>();
        for (int i = 0; i< init.length; i++) {
            if (!onlyUnique.contains(init[i])) {
                onlyUnique.add(init[i]);
            }

        }
        return onlyUnique;
    }
    public HashMap<String, Integer> countWordsAmount() {
        HashMap<String, Integer> wordAmountPair = new HashMap<String, Integer>();
        for (String s: init) {
            if (wordAmountPair.containsKey(s)) {
                wordAmountPair.put(s, (wordAmountPair.get(s)+1));
            }
            else {
                wordAmountPair.put(s, 1);
            }
        }
        return wordAmountPair;
    }
}
