package com.education_wired_.threads.work2;

public class Runner {
        public void run() throws InterruptedException {
                MySumCount count = new MySumCount();
                count.setMyArray(makeIntArr(100));
                count.setStartIndex(5);
                count.setStopIndex(30);
                count.start();
                count.join();
                System.out.println(count.getResultSum());
                MySumCount_Runnable rCount = new MySumCount_Runnable();
                rCount.setMyArray(makeIntArr(100));
                rCount.setStartIndex(5);
                rCount.setStopIndex(30);
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
