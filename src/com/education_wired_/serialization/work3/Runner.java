package com.education_wired_.serialization.work3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    private Scanner sc = new Scanner(System.in);

    public void run(){
        ArrayList<User> users = new ArrayList<>();
        do{
            users.add(createUser());
            System.out.print("Add more User (Y)? ->");
        } while ((sc.next().toUpperCase().trim()).equals("Y"));
        printUsers(users);
        String fileName = "users.ser";
        try (ObjectInputStream iso = new ObjectInputStream(new FileInputStream(fileName));
             ObjectOutputStream oso = new ObjectOutputStream(new FileOutputStream(fileName))
        ){
            oso.writeObject(users);
            System.out.println(iso.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private User createUser(){
        User user = new User();
        System.out.print("first name ->");
        user.setFirstName( sc.next());
        System.out.print("last name ->");
        user.setLastName(sc.next());
        System.out.print("age ->");
        user.setAge(sc.nextInt());
        return user;
    }
    private void printUsers(ArrayList<User> users){
        for (User userEntry : users ) {
            System.out.println(userEntry.toString());
        }
    }
}
