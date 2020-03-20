package com.education_wired_.serialization.work1;

import java.io.Serializable;

public class Emploee implements Serializable {
    private String name;
    private String address;
    private transient String ssn;
    private int numTab;

    public Emploee(String name, String address, String ssn, int numTab) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
        this.numTab = numTab;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getNumTab() {
        return numTab;
    }

    public void setNumTab(int numTab) {
        this.numTab = numTab;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ssn='" + ssn + '\'' +
                ", numTab=" + numTab +
                '}';
    }
}
