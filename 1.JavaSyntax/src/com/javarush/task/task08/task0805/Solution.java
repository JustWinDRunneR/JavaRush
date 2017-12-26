package com.javarush.task.task08.task0805;

import java.util.HashMap;
import java.util.Map;

/* 
На экране — значения!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String simpleKey = pair.getKey();
            String simpleValue = pair.getValue();

            hashMap.put(simpleKey, simpleValue);
        }

        for (Map.Entry<String, String> pair : hashMap.entrySet()) {
            System.out.println(pair.getValue());
        }
    }
}