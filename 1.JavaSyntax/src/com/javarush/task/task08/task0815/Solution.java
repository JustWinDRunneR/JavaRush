package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("LastName" + i, "Name" + i);
        }
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int counter = 0;
        for (Map.Entry<String, String> tmp : map.entrySet()) {
            if (tmp.getValue().equals(name)) {
                counter++;
            }
        }
        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int counter = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

    }
}
