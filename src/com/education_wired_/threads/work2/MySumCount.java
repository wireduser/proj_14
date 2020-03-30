package com.education_wired_.threads.work2;

public class MySumCount extends Thread {
    int startIndex;
    int stopIndex;
    int[]myArray;
    long resultSum;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setResultSum(long resultSum) {
        this.resultSum = resultSum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < stopIndex; i++) {
            resultSum+=myArray[i];
        }
    }
}
