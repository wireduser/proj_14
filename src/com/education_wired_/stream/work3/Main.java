package com.education_wired_.stream.work3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File newFile = new File("C:\\Users\\wired\\IdeaProjects\\proj_14\\src\\com\\education_wired_\\stream\\work3\\Main.java");
        File newFile2 = new File("C:\\Users\\wired\\IdeaProjects\\proj_14\\src\\com\\education_wired_\\stream\\work3\\Main2.java");
        copyFiles(newFile, newFile2);
        replaceFile(newFile2);

    }

    public static void copyFiles(File oldFile, File newFile) {
        System.out.println("copy file...");
        try (BufferedReader bin = new BufferedReader(
                new FileReader(oldFile)
        );
             BufferedWriter bout = new BufferedWriter(
                     new FileWriter(newFile)
             )) {
            String str;
            while ((str = bin.readLine()) != null) {
                bout.write(str + "\n");
            }


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }
        System.out.println("copy ended");
    }


    public static void replaceFile(File file) {
        System.out.println("replace start");
        try (BufferedReader bin = new BufferedReader(
                new FileReader(file)
        );
             BufferedWriter bout = new BufferedWriter(
                     new FileWriter("temp")
             )) {
            String str;
            while ((str = bin.readLine()) != null) {

                str = str.replaceAll("public", "protected");
                bout.write(str + "\n");
            }


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

        file.delete();
        new File("temp").renameTo(file);
    }
}