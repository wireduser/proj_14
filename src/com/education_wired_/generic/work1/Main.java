package com.education_wired_.generic.work1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrint = createInt(17);
        int countInt = MyTestMethod.<Integer>calcNum(arrint,50);
        System.out.println(Arrays.toString(arrint));
        System.out.println("Count > 50 = "+countInt);
        double sum = MyTestMethod.<Integer>calcSumm(arrint,50);
        System.out.println("sum > 50 = "+sum);
        System.out.println("-----------------------");

        countInt = MyTestMethod.calcNum(new Character[] {'a','g','s'},'f');
        System.out.println("Count > 'f' = "+countInt);
        System.out.println("-----------------------");
        Double[] arrdou = createDouble(8);
        int countdou = MyTestMethod.<Double>calcNum(arrdou,70.5);
        double summd = MyTestMethod.<Double>calcSumm(arrdou,70.5);
        System.out.println(Arrays.toString(arrdou));
        System.out.println("Count > 70.5 = "+countdou);
        System.out.println("Summ > 70.5 = "+summd);
    }

    public static Integer[] createInt(int size){
        Integer[] arr = new Integer[size];
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static Double[] createDouble(int size){
        Double[] arr = new Double[size];
        for (int i = 0; i<arr.length; i++){
            arr[i] = Math.random()*100;
        }
        return arr;
    }
}
