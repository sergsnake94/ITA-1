package com.company;

public class EvenNumbers {

        public static int[] divisibleBy(int[] numbers, int divider) {
            int c = 0;
            for (int number : numbers){
                if (number % divider == 0){
                    c ++;
                }
            }
            int[] array = new int[c];
            int t = 0;
            for (int number : numbers){
                if (number % divider == 0){
                    array[t] = number;
                    t++;
                }
            }
            return array;
        }


    }


