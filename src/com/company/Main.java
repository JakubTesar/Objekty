package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AnimalTypes info1 = new AnimalTypes();
        ArrayList<Animal> animalsData = new ArrayList<Animal>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("animals.csv"));
            br.readLine();
            String nextLine = br.readLine();

            while (nextLine != null) {
                Animal animal1 = new Animal();
                String[] raw = nextLine.split(";");
                nextLine = br.readLine();

                animal1.id = Integer.parseInt(raw[0]);
                animal1.type = Integer.parseInt(raw[1]);
                animal1.name = raw[2];
                animal1.age = Integer.parseInt(raw[3]);
                animal1.gender = raw[4];
                animal1.isAgresive = raw[5];
                animal1.isFriendly = raw[6];

                animalsData.add(animal1);

            }
            br.close();
        } catch (IOException e) {
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("animals.csv"));
            br.readLine();
            String nextLine = br.readLine();

            while (nextLine != null) {
                Animal animal1 = new Animal();
                String[] raw = nextLine.split(";");
                nextLine = br.readLine();

                animal1.id = Integer.parseInt(raw[0]);
                animal1.type = Integer.parseInt(raw[1]);

                animalsData.add(animal1);

            }
            br.close();
        } catch (IOException e) {
        }



    }
}
