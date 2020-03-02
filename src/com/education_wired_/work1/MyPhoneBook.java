package com.education_wired_.work1;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    private PhoneRecord[] phoneRecords = new PhoneRecord[10];

    private  int counterRecord = 0;

    static class PhoneRecord {
        private String name;
        private  String phone;

        public PhoneRecord(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "name= " + name +
                    ", phone= " + phone;
        }
    }

    public boolean addRecord(String name, String phone){
        if (counterRecord < phoneRecords.length){
            phoneRecords[counterRecord++] = new PhoneRecord(name,phone);
            return true;
        }
        return false;

    }

    public void printPhoneRecords(){
        for (int i = 0; i <counterRecord; i++){
            System.out.println(phoneRecords[i]);
        }
    }

    public void sortByName(){
        PhoneRecord[] newRecords = Arrays.copyOf(phoneRecords,counterRecord);
        Arrays.sort(newRecords, new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        String name1 = ((PhoneRecord)o1).getName();
                        String name2 = ((PhoneRecord)o2).getName();
                        return name1.compareTo(name2);
                    }
                }
        );
    }


}
