package com.company;

public class Numbers {


        public static double TwoDecimalPlaces(double number)
        {


            number = Math.round(number * 100);
            number = number/100;
            return number;
        }
    }

