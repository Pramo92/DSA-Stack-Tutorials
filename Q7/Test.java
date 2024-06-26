package Q7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the expression:");
        String exp = input.nextLine();

        char[] expc = exp.toCharArray();
        Q7.Stack stack = new Stack(exp.length());

        for (char x : expc) {
            if (x == '{' || x == '[' || x == '(') {
                stack.push(x);
            } else if (x == '}' || x == ']' || x == ')') {
                if (stack.IsStackEmpty()) {
                    System.out.println("Parentheses are not balanced");
                    System.exit(1);
                } else {
                    char top = stack.pop();
                    if ((x == '}' && top != '{') || (x == ']' && top != '[') || (x == ')' && top != '(')) {
                        System.out.println("Parentheses are not balanced");
                        System.exit(1);
                    }
                }
            }
        }

        if (stack.IsStackEmpty()) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("Parentheses are not balanced");
        }
    }
}
