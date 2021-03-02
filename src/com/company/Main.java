package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        InfoAnimals info1 = new InfoAnimals();
        ArrayList<String> animalsData = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader());
            br.readLine();
            String nextLine = br.readLine();

            while (nextLine != null) {
                animalsData.add(nextLine);
                nextLine = br.readLine();
            }
            br.close();
        } catch (IOException e) {
        }


        for (int i = 0; i < animalsData.size(); i++) {
            System.out.println(animalsData.get(i));
        }

    }
}
