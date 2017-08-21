package com.fara0n;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введите цифру 777 ! ");
            value = scn.nextInt();
        } while (value != 777);
            System.out.println("Ура! Вы ввели 777!");
        }
    }

