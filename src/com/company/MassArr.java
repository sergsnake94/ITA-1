package com.company;

public class MassArr {
    public static int[] sguereRoot(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sgrt = (int) Math.sqrt(array[i]);
            if (array[1] == sgrt * sgrt) {
                newArray[i] = sgrt;
            } else {
                newArray[i] = array[i] * array[i];

            }
        }
        return newArray;
    }
}