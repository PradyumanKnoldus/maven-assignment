package com.knoldus;
import java.util.Scanner;

public class MethodCalling {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String : ");
        String inputString = input.nextLine();

        StringInfo object = new StringInfo();

        System.out.println("Reverse of the string : " +object.reverseString(inputString));
        System.out.println("Length of the string : " +object.getStringLength(inputString));

    }
}
