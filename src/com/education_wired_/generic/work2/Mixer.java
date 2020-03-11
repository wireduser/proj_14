package com.education_wired_.generic.work2;

public class Mixer <T> {
    private T[] array;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public Mixer(T[] array) {
        this.array = array;
    }

    public void shuffle(){
        for (int i = 0; i < array.length; i++) {
            int index = (int)(Math.random()*array.length);
            T temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
