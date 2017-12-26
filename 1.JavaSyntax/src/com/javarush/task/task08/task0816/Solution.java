package com.javarush.task.task08.task0816;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stallone2", new Date("JANUARY 1 1980"));
        map.put("Stallone3", new Date("FEBRUARY 1 1980"));
        map.put("Stallone4", new Date("MARCH 1 1980"));
        map.put("Stallone5", new Date("APRIL 1 1980"));
        map.put("Stallone6", new Date("MAY 1 1980"));
        map.put("Stallone7", new Date("JULY 1 1980"));
        map.put("Stallone8", new Date("AUGUST 1 1980"));
        map.put("Stallone9", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone10", new Date("OCTOBER 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        ArrayList<String> listForRemove = new ArrayList<>();

        for (Map.Entry<String, Date> tmp : map.entrySet()) {
            if (tmp.getValue().getMonth() > 4 && tmp.getValue().getMonth() < 8) {
                listForRemove.add(tmp.getKey());
            }
        }
        for (String month : listForRemove) {
            map.remove(month);
        }
    }

    public static void main(String[] args) {
    }
}
