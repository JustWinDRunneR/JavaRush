package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private double avg() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        double avgNumbers = 0;

        do {
            int inputNumber = Integer.parseInt(br.readLine());
            if (inputNumber == -1) {
                avgNumbers /= counter;
                break;
            } else {
                avgNumbers += inputNumber;
                ++counter;
            }

        } while (true);

        return avgNumbers;
    }

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Solution solution = new Solution();
        System.out.println(solution.avg());
    }
}

