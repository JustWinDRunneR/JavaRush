package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> hashMap = new HashMap<>();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;

            hashMap.put(city, family);
        }
        String selectedCity = reader.readLine();

        for (Map.Entry<String, String> s : hashMap.entrySet()) {
            if (selectedCity.equals(s.getKey())) {
                System.out.println(s.getValue());
            }
        }
        /*
        //list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        //read home number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }
        */
    }
}
