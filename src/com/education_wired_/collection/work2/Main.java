package com.education_wired_.collection.work2;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MyNumGenerator generator = new MyNumGenerator(15,15);
        List<Integer> list = generator.generatorList();
        System.out.println(list);
        Set<Integer> set = generator.generatorSet();
        System.out.println(set);
    }
}
