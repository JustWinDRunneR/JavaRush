package com.javarush.task.task08.task0820;

import java.util.*;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cat = new HashSet<>();

        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            cat.add(new Cat());
        }
        return cat;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> dog = new HashSet<>();

        //напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            dog.add(new Dog());
        }
        return dog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> setOfAnimal = new HashSet<>(cats);

        setOfAnimal.addAll(dogs);

        return setOfAnimal;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext()) {
            pets.remove(iterator.next());
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    //напишите тут ваш код
    public static class Cat {
    }

    public static class Dog {
    }
}
