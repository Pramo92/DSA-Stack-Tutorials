package Q6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();

        Stack stack = new Stack(String.valueOf(num).length());

        int num2 = num;
        while (num != 0) {
            int x = num % 8;
            stack.push(x);
            num /= 8;
        }
        String octal = "";
        while (!stack.IsStackEmpty()) {
            octal += stack.pop();
        }

        System.out.println("Octal Value Is: " + octal);

        while (num2 > 0) {
            int x = num2 % 16;
            stack.push(x);
            num2 /= 16;
        }

        String hexa = "";
        while (!stack.IsStackEmpty()) {
            int x = stack.pop();
            if (x < 10) {
                hexa += x;
            }else if(x==10){
                hexa+='A';
            } else if (x==11) {
                hexa += 'B';
            } else if (x==12) {
                hexa += 'C';
            } else if (x==13) {
                hexa += 'D';
            } else if (x==14) {
                hexa += 'E';
            }else {
                hexa += 'F';
            }
        }

        System.out.println("Hexadecimal Value Is: " + hexa);
    }
}