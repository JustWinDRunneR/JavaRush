package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int counter = 1;
        int simpleValue = 1;

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i).equals(arrayList.get(i + 1))) {
                counter++;
                if (simpleValue < counter) {
                    simpleValue = counter;
                }
            } else {
                counter = 1;
            }
        }
        System.out.println(simpleValue);
    }
}