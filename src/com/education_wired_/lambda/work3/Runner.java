package com.education_wired_.lambda.work3;



import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Runner {
    public void run(){
        List<String > stringList = Arrays.asList(makeStrArr());
        MyConverter conver = new MyConverter() {
            @Override
            public String converStr(String str) {
                Function<String,String>  func =  s -> s.toUpperCase();
                return func.apply(str);
            }
        };
        updateList(stringList,conver);
    }

    private void updateList(List<String> stringList, MyConverter converter){
        stringList.replaceAll(converter::converStr);
        stringList.forEach(str ->
        {
            System.out.println(str);
        });

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
