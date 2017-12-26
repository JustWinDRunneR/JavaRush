package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("LastName" + i, "FirstName" + i);
        }

        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код

        List<String> list = new ArrayList<>(map.values());
        for (String s : list) {
            if (Collections.frequency(map.values(), s) > 1) {
                removeItemFromMapByValue(map, s);
            }
        }

        // System didn't agree with this variant...
//        ArrayList<String> arrayList = new ArrayList<>(map.values());
//
//        for (int i = 0; i < arrayList.size() - 1; i++) {
//            if (arrayList.get(i).equals(arrayList.get(i + 1))) {
//                removeItemFromMapByValue(map, arrayList.get(i));
//            }
//        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
