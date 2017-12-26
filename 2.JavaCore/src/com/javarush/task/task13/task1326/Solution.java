package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(new FileInputStream(br.readLine()));
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (sc.hasNextInt()) {
            arrayList.add(sc.nextInt());
        }

        Collections.sort(arrayList);

        for (Integer tmp : arrayList) {
            if (tmp % 2 == 0) {
                System.out.println(tmp);
            }
        }

        sc.close();
        br.close();
    }
}
