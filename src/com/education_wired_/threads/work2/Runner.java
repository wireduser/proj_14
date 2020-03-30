package com.education_wired_.threads.work2;

import java.util.Arrays;

public class Runner {
        public void run() throws InterruptedException {
                int[] arr = makeIntArr(100);
                System.out.println(Arrays.toString(arr));
                MySumCount count = new MySumCount(5,7,arr);

                count.start();
                count.join();
                System.out.println(count.getResultSum());


                MySumCount_Runnable rCount = new MySumCount_Runnable(5,7, arr);

                Thread ruunable = new Thread(rCount);
                ruunable.start();
                ruunable.join();

                System.out.println(rCount.getResultSum());
        }

        private int[] makeIntArr(int size){
                int[] array = new int[size];
                for (int i = 0; i < array.length; i++) {
                        array[i]= (int) (Math.random()*1000);
                }
                return array;
        }
}
