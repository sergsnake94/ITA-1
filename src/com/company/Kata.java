package com.company;

public class Kata {
        public static double getVolumeOfCuboid(final double length, final double width, final double height) {
            return  length* height* width;
        }
        public static int[] countPositivesSumNegatives(int[] input)
        {
            int possitivecount=0;
            int negativesum=0;
            for(int a:input){
                if(a<0){
                    negativesum+=a;

                }
                else if(a>0){
                    possitivecount++;
                }
            }
            int nums[] = new int[2];
            nums [0]=possitivecount;
            nums[1]=negativesum;
            return nums;
        }
    }

