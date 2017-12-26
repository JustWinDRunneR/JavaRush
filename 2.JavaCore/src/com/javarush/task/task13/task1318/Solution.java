package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(br.readLine());

        while (fileInputStream.available() > 0) {
            System.out.print((char) fileInputStream.read());
        }

        br.close();
        fileInputStream.close();
    }
}