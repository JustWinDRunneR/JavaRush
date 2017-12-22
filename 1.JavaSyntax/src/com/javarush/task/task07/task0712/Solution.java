package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            al.add(bufferedReader.readLine());
        }

        int max = 0;
        int min = 0;

        for (int i = 1; i < al.size(); i++) {
            if (al.get(max).length() < al.get(i).length()) {
                max = i;
            }
            if (al.get(min).length() > al.get(i).length()) {
                min = i;
            }
        }

        if (max < min) {
            System.out.println(al.get(max));
        } else {
            System.out.println(al.get(min));
        }
    }
}
