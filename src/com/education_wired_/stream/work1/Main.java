package com.education_wired_.stream.work1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File dir = new File(".\\");
        if (args.length != 0){
            dir = new File(args[0]);
        }
        if (dir.isDirectory()){
            File[] files = dir.listFiles();
            for (File elem:files
                 ) {
                System.out.println(elem.getName());

            }
        }else{
            System.out.println("not Dir");
        }
    }
}
