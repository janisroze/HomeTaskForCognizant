package com.jr.vehiclerental;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("testin output");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
