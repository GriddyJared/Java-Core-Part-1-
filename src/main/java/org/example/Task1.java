package org.example;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array.");
        int size= scanner.nextInt();
        int[] numList= new int[size];

        System.out.println("Please enter the numbers seperated by spaces.");
        for (int num = 0; num< numList.length; num++){
            numList[num]= scanner.nextInt();
        }
        int count = 0;

        for (int num = 0; num< numList.length-1;num++) {
            if(numList[num]<numList[num+1]){
                count++;
            }
        }

        System.out.println(count==numList.length-1);

    }
}