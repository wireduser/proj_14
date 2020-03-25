package com.education_wired_.lambda.work2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Runner {
    public void run(){
        Predicate<Integer>isEven = x -> (x % 2)==0;
        Predicate<String>stringPredicate = str -> str.substring(0,1).toUpperCase().equals("A");
        System.out.println("---New String array---");
        printStr(makeStrArr(),stringPredicate);
        System.out.println("---New Integer array---");
        Integer[] intArr= makeIntArr();
        for (Integer e: intArr  ) {
            System.out.println(e);
        }
        System.out.println("Summ Even = "+sumEven(intArr,isEven));


    }

    public Integer sumEven (Integer[] array, Predicate<Integer> predicate){
        int res =0;
        for (Integer e:array) {
            res+=predicate.test(e)?e:0;
        }
        return res;
    }

    public void printStr (String[] array, Predicate<String> predicate){
        List<String> stringList = Arrays.asList(array);
        stringList.forEach(e->{
            if(predicate.test(e)) System.out.println(e);
        });
    }

    private Integer[] makeIntArr(){
        Integer array[] = new Integer[10];
        for (int i = 0; i < 10; i++) {
            array[i]= (int) (Math.random()*100);
        }
        return array;
    }

    private String[] makeStrArr(){
        String array[] = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("enter string ->");
            array[i]= sc.nextLine();
        }
        return array;
    }

}
