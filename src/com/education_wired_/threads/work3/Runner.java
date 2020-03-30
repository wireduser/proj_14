package com.education_wired_.threads.work3;

public class Runner {
    public void run(){
        Storage store = new Storage();
        new Counter(store);
        new Printer(store);

    }
}
