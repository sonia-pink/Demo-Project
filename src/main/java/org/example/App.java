package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String str = "hello";
        System.out.println("Reverse of the string");
        char[] ch =str.toCharArray();
        System.out.println(ch.length);
        for(int i=ch.length-1; i>=0; i--)
        {
            System.out.print(ch[i]);
        }
    }
}
