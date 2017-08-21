package com.fara0n;

public class WhileLoopDemo {
    public static void main(String[] args) {
        String[] workers = new String[100];
        workers[0] = "Tom";
        workers[1] = "John";
        workers[2] = "Smith";
        workers[33] = "Bob";
        workers[34] = "Smith";
        workers[35] = "Pol";
        workers[51] = "Curt";
        workers[52] = "Vadym";
        workers[98] = "Yura";
        workers[99] = "Vasil";
        int countWorkers = workers.length;
        int x = 0;
        while (x < countWorkers) {
            if (workers[x] == null) {
                x++;
                continue;
            }
                System.out.println("My workers : " + workers[x]);
                x++;
            }
        System.out.println("The iteration is over! ");
        }
    }