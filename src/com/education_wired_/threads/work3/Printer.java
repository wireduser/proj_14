package com.education_wired_.threads.work3;

public class Printer implements Runnable {
    Storage number;

    public Printer(Storage number) {
        this.number = number;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true){

            System.out.println(number.getNumber());
        }

    }
}
