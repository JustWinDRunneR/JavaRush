package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> al = new ArrayList<>();

        try {
            while (true) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int digits = Integer.parseInt(br.readLine());
                al.add(digits);
            }
        } catch (NumberFormatException e) {
            for (Integer tmp : al) {
                System.out.println(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //напишите тут ваш код
    }
}
