package ru.geekbrains.Java2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class PhoneBook {
    private HashMap<String, HashMap<String, String>> record = new HashMap<String, HashMap<String, String>>(); // ключ - телефон, значение - пара фамилия-мейл

    public void add(String surname, String phone, String mail) {
        HashMap<String, String> surnameMailCombo = new HashMap<String, String>();
        surnameMailCombo.put(surname, mail);
        record.put(phone, surnameMailCombo);
    }

    public ArrayList<String> getNumber(String surname) {
        ArrayList<String> phoneArray = new ArrayList<String>();

        return phoneArray;
    }
}
