package com.fara0n;

public class WhileLoop {
    public static void main(String[] args) {
        String[] friends = new String[20];
        friends[0] = "Hillary";
        friends[1] = "Natasha";
        friends[2] = "Rosa";
        friends[18] = "Matilda";
        friends[19] = "Masha";
        int totalElements = friends.length;
        int i = 0;
        while (i < totalElements) {
            if (friends[i] != null&& ! friends[i].equals("Hillary") ) {

                System.out.println("I love " + friends[i]);
            }
            i++;
        }
    }
}