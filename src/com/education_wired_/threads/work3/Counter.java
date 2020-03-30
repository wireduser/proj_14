package com.education_wired_.threads.work3;

public class Counter implements Runnable{
    private Storage number;

    public Counter(Storage number) {
        this.number = number;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int count =1;
        while (count <1000){
            number.setNumber(count++);

        }
    }
}
