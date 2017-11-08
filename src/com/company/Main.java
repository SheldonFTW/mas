package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*int[] mas = {1, 2, 3, 4, 5, 6, 7, 8};

        int find = 2;
        int findAgaine = 5;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == find || mas[i] == findAgaine) {
                System.out.println("yes");*/

        /*int [] mas = new int[10];
        int[] mas2 = new int[12];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
        }
        for (int b = 0; b < mas2.length ; b++) {
            mas2[b] = b;
        }
        if (mas.length != mas2.length) {
            System.out.println("They are not similar");
            System.out.println(Arrays.toString(mas)+Arrays.toString(mas2));
        } else  {
            System.out.println("They are similar");*/

        /*int[] mas = new int[10];
        int count = 1;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = count++;
            System.out.println(Arrays.toString(mas));

            if (mas[i] == 2 || mas[i] == 3 || mas[i] == 4 || mas[i] == 5) {
                mas[i] = 12;
        }

            if (mas[i] % 2 == 0) {
                System.out.println(mas[i] + " odd");
            }
       System.out.println(Arrays.toString(mas));*/


        final Random random = new Random();
        for (int i = 0; i < 10; i++) {
            final int number = random.nextInt(20) - 10;
            System.out.println(number);

        }


    }
}












