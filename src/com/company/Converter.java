package com.company;

public class Converter {

        public static float mpgToKPM(final float mpg) {

            final float l = 4.54609188f;
            final float k = 1.609344f;
            float rez=mpg * k / l;
            String rezult= String.format("%.2f", rez );
            rezult=rezult.replace(',','.');
            return Float.parseFloat(rezult);
        }
    }