package org.example;
import java.util.Scanner;
import java.io.*;
public class Task2_1 {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the String to Reverse ");
        String stringToReverse = scanner.nextLine();
        StringBuffer str = new StringBuffer(stringToReverse);

        str.reverse();
        System.out.println(str);

    }


}
