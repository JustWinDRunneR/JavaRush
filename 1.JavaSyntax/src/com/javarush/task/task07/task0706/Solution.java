package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    private int even;
    private int odd;

    private int[] fillingArray(int[] arr) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        return arr;
    }

    private void numberHouse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                odd += arr[i];
            } else {
                even += arr[i];
            }
        }
    }

    private void printValues() {
        if (even > odd) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else if (even < odd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Solution solution = new Solution();
        int[] arr = new int[15];
        arr = solution.fillingArray(arr);
        solution.numberHouse(arr);
        solution.printValues();
    }
}
