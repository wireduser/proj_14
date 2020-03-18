package com.education_wired_.stream.work2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length ==0){
            System.out.println("file not select");
            System.exit(0);
        }
        File file = new File(args[0]);
        if(!file.isFile()) {
            System.out.println("is not file ");
            System.exit(0);
        } else {
            try (BufferedInputStream bin = new BufferedInputStream(
                    new FileInputStream(file)
            )){
                int elem;
                while((elem = bin.read())!= -1){
                    System.out.print((char)elem);
                }



            } catch (FileNotFoundException e) {
                System.out.println("file not found");

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
