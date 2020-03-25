package com.education_wired_.lambda.work1;


import java.util.*;

public class Runner {
    public void run(){
        Integer[] intArr = makeIntArr();
        System.out.println("---New array---");
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr,( s1, s2) -> (s2 - s1));
        System.out.println("---Sorted---");
        System.out.println(Arrays.toString(intArr));
        String[] strArr = makeStrArr();
        Arrays.sort(strArr,(s1,s2)->(s2.compareTo(s1)));
        System.out.println(Arrays.toString(strArr));

    }


    private Integer[] makeIntArr(){
        Integer array[] = new Integer[20];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random()*100-50);
        }
        return array;
    }

    private String[] makeStrArr(){
        String array[] = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("enter string ->");
            array[i]= sc.nextLine();
        }
        return array;
    }
}
