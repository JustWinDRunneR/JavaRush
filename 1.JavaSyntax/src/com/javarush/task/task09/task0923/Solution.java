package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        ArrayList<String> vowelsList = new ArrayList<>();
        ArrayList<String> consonantsList = new ArrayList<>();

        int numOfSpaceValue;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                vowelsList.add("" + str.charAt(i));
            } else if ((numOfSpaceValue = str.charAt(i)) != 32) {
                consonantsList.add("" + str.charAt(i));
            }
        }

        for (String s : vowelsList) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (String s : consonantsList) {
            System.out.print(s + " ");
        }
    }
    // метод проверяет, гласная ли буква

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}