package org.example.Task2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the String to Reverse ");
        String str = scanner.nextLine();
        String rev = "";
        char[] stringToReverse= str.toCharArray();

        for (int num= str.length()-1; num>=0;num--){
            rev += stringToReverse[num];
        }
        System.out.println(rev);
    }
}
