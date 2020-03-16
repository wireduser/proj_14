package com.education_wired_.collection.work1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List <String> arrList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrList.add("number_"+i);
        }
        System.out.println(arrList);
        List<String> lstList = new LinkedList<>();
        lstList.add("num_1");
        for (int i = 2; i <=10 ; i++) {
            int pos = (int)(Math.random() * i-1);
            lstList.add(pos,"num_"+i);
        }
        System.out.println(lstList);

        ListIterator<String> it = arrList.listIterator(10);
        int index = 0;
        while (it.hasPrevious()){
            String elem = it.previous();
            lstList.add(index,elem);
            index+=2;
        }
        System.out.println(lstList);
    }
}
