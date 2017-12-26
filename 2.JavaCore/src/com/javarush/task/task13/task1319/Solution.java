package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()));
        String str;

        do {
            str = br.readLine();
            bw.write(str);
            bw.newLine();
        } while (!str.equals("exit"));

        bw.close();
        br.close();
    }
}
