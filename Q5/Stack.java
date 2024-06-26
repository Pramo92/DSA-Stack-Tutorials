package Q5;

public class Stack {
    private int top;
    private int maxSize;
    private char[] stackArr;

    public Stack(int size){
        maxSize=size;
        stackArr=new char[maxSize];
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
            System.out.println("Stack is Full");
            System.exit(1);
        }
        else{
            System.out.println("Inserting " +x);
            stackArr[++top]=x;
        }
    }

    public char pop(){
        if(IsStackEmpty()){
            System.out.println("Stack Is Empty");
            System.exit(1);
        }
        return stackArr[top--];
    }

}
