package com.education_wired_.serialization.work2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String fileName = "users.ser";
    public static void main(String[] args) {
        User user = createUser();
        //System.out.println(user.toString());
        writeUser(user);
        writeUser(createUser());
        //user = null;
        printUsers();

    }
    public static User createUser(){
        User user = new User();
        System.out.print("first name ->");
        user.setFirstName( sc.next());
        System.out.print("last name ->");
        user.setLastName(sc.next());
        System.out.print("age ->");
        user.setAge(sc.nextInt());
        return user;
    }

    public static void writeUser(User user){
        try (RandomAccessFile raf = new RandomAccessFile( fileName, "rw")){
            long size = raf.length();
            raf.seek(size);
            /*
            raf.writeBytes(user.getFirstName());
            raf.writeBytes(user.getLastName());
            raf.writeInt(user.getAge());
            */
             raf.writeBytes(user.toString());
             raf.writeBytes("\n");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printUsers(){
        try(RandomAccessFile raf = new RandomAccessFile( fileName, "rw")){
            String user = null;
            while((user = raf.readLine())!=null){
                System.out.println(user.toString());
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
