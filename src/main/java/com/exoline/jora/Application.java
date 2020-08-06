package com.exoline.jora;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(rd.readLine());

        int[] array = new int[(short)256];

        while (file.available() > 0) {
            array[file.read()]++;
        }

        ByteQuantity byteQuantity = new ByteQuantity((short) 0, 0);

        for (short i = 0; i < array.length; i++) {
            if (array[i] > byteQuantity.getQuantity()) {
                byteQuantity.setQuantity(array[i]);
                byteQuantity.setByte(i);
            }
        }
        System.out.print("Byte " + byteQuantity.getByte() + " occurs " + byteQuantity.getQuantity() + " times");
    }
}