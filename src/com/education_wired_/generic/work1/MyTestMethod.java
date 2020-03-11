package com.education_wired_.generic.work1;

public class MyTestMethod {
    public static <T extends Comparable> int calcNum(T[] array, T maxValue)  {
        int count = 0;
        for (T element : array){
            if (element.compareTo(maxValue) > 0){
                count++;
            }
        }
        return  count;
    }

    public static <T extends Number & Comparable> double calcSumm(T[] array , T maxValue) {
        double summ = 0.0;
            for (T element : array) {
                if (element.compareTo(maxValue)>0){
                    summ+= element.doubleValue();
                }
            }
        return summ;
    }


}
