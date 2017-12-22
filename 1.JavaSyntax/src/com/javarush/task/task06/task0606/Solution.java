package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    private int fillingNumber() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(bufferedReader.readLine());
    }

    private void evenOrOdd(int enteredNumber) {
        String str = "" + enteredNumber;
        int value;

        for (int i = 0; i < str.length(); i++) {
            value = enteredNumber / (int)(Math.pow(10, i)) % 10;

            if (value % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
    }

    private void printingValues() {
        System.out.println("Even: " + even + " Odd: " + odd);
    }

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Solution solution = new Solution();
        int enteredNumber = solution.fillingNumber();
        solution.evenOrOdd(enteredNumber);
        solution.printingValues();
    }
}
