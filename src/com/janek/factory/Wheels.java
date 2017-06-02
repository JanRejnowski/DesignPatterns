package com.janek.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Wheels {
    public Wheels(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    private int size;

    private String type;

    @Override
    public String toString() {
        return "Wheels{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
