package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private String address;
        private int age;
        private double height;
        private double weight;

        public Human() {
        }

        public Human(double weight) {
            this.weight = weight;
        }


        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, double weight) {
            this.firstName = firstName;
            this.weight = weight;
        }

        public Human(int age, double height) {
            this.age = age;
            this.height = height;
        }

        public Human(int age, double height, double weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, String lastName, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }

        public Human(String firstName, String lastName, double height) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.height = height;
        }

        public Human(String firstName, String lastName, String address, int age, double height, double weight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
    }
}
