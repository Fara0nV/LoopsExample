package com.fara0n;
import  java.util.Scanner;
public class WhileLoopInt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите цифру 5 ");
        int value=scn.nextInt();
        while(value!=5){
            System.out.println("Введите цифру 5 ");
            value=scn.nextInt();
        }
        System.out.println("Поздравляем вы ввели 5 ! ");
    }
}
