package Q5;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word=input.nextLine();

        char[]arr=word.toCharArray();
        Stack stack=new Stack(word.length());

        for(char e:arr ){
            stack.push(e);
        }

        String x="";
        while(!stack.IsStackEmpty()){
            x+=stack.pop();

        }


        if(x.equals(word)){
            System.out.println("It is a Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }

    }

}
