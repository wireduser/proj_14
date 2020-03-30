package com.education_wired_.threads.work1;

public class Mytb_2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Boom -2!");
    }
}
