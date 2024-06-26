package Q7;

public class Stack {
    private int top;
    private int maxSize;
    private char[] stackArray;

    public Stack(int size){
        maxSize=size;
        stackArray=new char[maxSize];
        top=-1;
    }

    public boolean IsStackEmpty(){
        return top==-1;
    }

    public boolean IsStackFull(){
        return (top==maxSize-1);

    }

    public void push(char x){
        if(IsStackFull()){
            System.out.println("Stack is FUll");
            System.exit(1);
        }else{
            System.out.println("Inserting" +x);
            stackArray[++top]=x;
        }
    }

    public char pop() {
        if (IsStackEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return stackArray[top--];
    }
}
