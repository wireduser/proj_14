package com.education_wired_.generic.work2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = {1,2,3,4,5,6,7,8,9,0};
        Mixer<Integer> myMixer = new Mixer<>(arrInt);
        myMixer.shuffle();
        arrInt = myMixer.getArray();
        System.out.println(Arrays.toString(arrInt));
    }
}
