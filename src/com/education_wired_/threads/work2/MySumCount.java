package com.education_wired_.threads.work2;

public class MySumCount extends Thread {
    int startIndex;
    int stopIndex;
    int[]myArray;
    long resultSum;


    public long getResultSum() {
        return resultSum;
    }


    public MySumCount(int startIndex, int stopIndex, int[] myArray) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.myArray = myArray;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < stopIndex; i++) {
            resultSum+=myArray[i];
        }
    }
}
