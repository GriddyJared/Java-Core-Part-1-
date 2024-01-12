package org.example;

import java.util.*;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the String to Reverse ");
        String str = scanner.nextLine();


        Stack<Character> stack=new Stack<>();

        for(char c:str.toCharArray())
        {
            //pushing all the characters
            stack.push(c);
        }

        String temp="";

        while(!stack.isEmpty())
        {
            //popping all the chars and appending to temp
            temp+=stack.pop();
        }

        System.out.println("Reversed string is : "+temp);



    }
}
