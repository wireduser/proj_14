package com.education_wired_.collection.work2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyNumGenerator {
    private int countOfElem;
    private int maxValue;

    public MyNumGenerator(int countOfElem, int maxValue) {
        this.countOfElem = countOfElem;
        this.maxValue = maxValue;
    }

    public List<Integer> generatorList(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < countOfElem; i++) {
            list.add((int)(Math.random()*maxValue));
        }
        return list;
    }

    public Set<Integer> generatorSet(){
        if (countOfElem>maxValue){
            throw new RuntimeException();
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < countOfElem; i++) {
            if (!set.add((int)(Math.random()*maxValue))){
                i--;
            }
        }
        return set;
    }
}
