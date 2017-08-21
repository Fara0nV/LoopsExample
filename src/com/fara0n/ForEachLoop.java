package com.fara0n;

public class ForEachLoop {
    public static void main(String[] args) {
        int[]numbers={1,2,3};
        int sum=0;
        for(int x : numbers){     // For each loop
          sum=sum+x;
        }
        System.out.println("Сумма чисел массива = "+sum);
    }
}
