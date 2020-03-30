package com.education_wired_.threads.work3;

public class Storage {
    int number;
    boolean t;

    synchronized int getNumber() {
        while (!t){
            try{
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
        t = false;
        notify();
        return number;
    }

    synchronized void setNumber(int number) {
        while (t){
            try{
                wait();
            }catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
        this.number = number;
        t = true;
        notify();
    }
}
