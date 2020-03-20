package com.education_wired_.serialization.work1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Emploee empl = new Emploee("Igor","av.Komarova 1 32","2342213-ws",2032);
        System.out.println(empl.toString());
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("empl.ser"))){
            out.writeObject(empl);
            System.out.println("111");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        empl = null;
        Emploee emplee = null;
        try (ObjectInputStream inp = new ObjectInputStream(new FileInputStream("empl.ser"))){
            emplee = (Emploee)inp.readObject();

            System.out.println(emplee.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
