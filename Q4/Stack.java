package Q4;

public class Stack {
    private int top;
    private int maxSize;
    private String[] stackArray;

    public Stack(int size){
        maxSize=size;
        stackArray=new String[maxSize];
        top=-1;
    }

    public boolean IsStackEmpty(){
        return top==-1;
    }

    public boolean IsStackFull(){
        return(top==maxSize-1);
    }

    public void push(String x){
        if(IsStackFull()){
            System.out.println("Stack Is Full");
            System.exit(1);
        }
        else{
            System.out.println("Inserting: "+x);
            stackArray[++top]=x;
        }
    }

    public String pop(){
        if(IsStackEmpty()){
            System.out.println("Stack Is Empty");
            System.exit(1);
        }
        return stackArray[top--];
    }



}
