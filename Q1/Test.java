package Q1;

import java.util.Scanner;


public class Test {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number=input.nextInt();

        Stack s1=new Stack(String.valueOf(number).length());

        while(number>0){
            int x=number%10;
            s1.push(x);
            number/=10;
    }
        int reversnum=0;
        int multiplier=1;
        while (!s1.IsStackEmpty()){
            int digit = s1.pop();
            reversnum += digit * multiplier;
            multiplier *= 10;
        }

        System.out.println("Reverse Number is: " +reversnum);
}}
