package com.education_wired_.threads.work1;

import java.util.Scanner;

public class Runner {
        public void run(){
                //new MyTimeBomb_1().start();
                Thread mytb_2 = new Thread(new Mytb_2());
                mytb_2.start();

        }
}
