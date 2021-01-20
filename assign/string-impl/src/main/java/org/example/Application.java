package org.example;

import org.example.Calculator;

import java.util.*;

public class Application {
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the two Numbers");
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        System.out.println("Press 1 for addition \t Press 2 for subtraction \t Press 3 for Mutiplication \t Press 4 for Division");
        int choice=obj.nextInt();
        Calculator obj1=new Calculator();
        if(choice==1)
        {
            System.out.println(obj1.addition(num1,num2));
        }
        else
        if(choice==2)
        {
            System.out.println(obj1.subtraction(num1,num2));
        }
        else
        if(choice==3)
        {
            System.out.println(obj1.multiplication(num1,num2));
        }
        else  if(choice==4)
        {
            System.out.println(obj1.division(num1,num2));
        }
    }
}
