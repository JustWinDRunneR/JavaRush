package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String month = br.readLine();

        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 1; i <= 12; i++) {
            hashMap.put(i, "" + Month.of(i));
        }

        for (Map.Entry<Integer, String> monthEntry : hashMap.entrySet()) {
            if (month.equalsIgnoreCase(monthEntry.getValue())) {
                String str = monthEntry.getValue();
                System.out.println(str.charAt(0) + str.substring(1).toLowerCase() + " is " +
                        monthEntry.getKey() + " month");
            }
        }
    }
}
