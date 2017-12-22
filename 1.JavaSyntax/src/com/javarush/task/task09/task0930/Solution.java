package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<Integer> iList = new ArrayList<>();
        ArrayList<String> sList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                iList.add(Integer.parseInt(array[i]));
            } else {
                sList.add(array[i]);
            }
        }

        for (int i = 0; i < iList.size(); i++) {
            for (int j = i + 1; j < iList.size(); j++) {
                if (iList.get(i) < iList.get(j)) {
                    int tmp = iList.get(i);
                    iList.set(i, iList.get(j));
                    iList.set(j, tmp);
                }
            }
        }

        for (int i = 0; i < sList.size(); i++) {
            for (int j = i + 1; j < sList.size(); j++) {
                if (isGreaterThan(sList.get(i), sList.get(j))) {
                    String tmp = sList.get(i);
                    sList.set(i, sList.get(j));
                    sList.set(j, tmp);
                }
            }
        }

        int numberCounter = 0, stringCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = iList.get(numberCounter).toString();
                numberCounter++;
            } else {
                array[i] = sList.get(stringCounter);
                stringCounter++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
