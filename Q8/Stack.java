package Q8;

public class Stack {
    private int top;
    private int maxSize;
    private int[] stackArray;

    public Stack(int size){
        maxSize=size;
        stackArray=new int[maxSize];
        top=-1;
    }

    public boolean IsStackEmpty(){
        return top==-1;
    }

    public boolean IsStackFull(){
        return (top==maxSize-1);
    }

    public void push(int x){
        if(IsStackFull()){
            System.out.println("Stack Is Full");
            System.exit(1);
        }else{
            //System.out.println("Inserting: "+x);
            stackArray[++top]=x;
        }
    }

    public int pop(){
        if(IsStackEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return stackArray[top--];
    }

}
