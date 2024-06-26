package Q4;

import java.util.Scanner;

public class Test {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String sentence=input.nextLine();

        String[]words=sentence.split(" ");

        /*for(String word:words){
            System.out.println(word);
        }*/

        Stack stack=new Stack(words.length);

        for(String word:words){
            stack.push(word);
        }

        String x=" ";
        while(!stack.IsStackEmpty()){
            x+= stack.pop()+" ";

        }
        System.out.println("Reversed Sentence is: " +x);
        System.out.println("Top element of the stack is: ");
    }
}
