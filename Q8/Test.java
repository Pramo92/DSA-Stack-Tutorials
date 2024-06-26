package Q8;

public class Test {
    public static void main(String []args){
        int arr[]={1,4,16,7,45,};

        //int max=0;
       Stack stack=new Stack(arr.length);
       /*for(int i=0;i<arr.length;i++){
           int val=arr[i];
           stack.push(val);
           if(max<val){
               max=val;
               System.out.println("Step "+(i+1)+": push "+val+", current maximum "+max);
           }
       }*/

        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);
        }
        int max= stack.pop();
        while(!stack.IsStackEmpty()){
            int x = stack.pop();
            if (max<x){
                max= x;
            }
        }
        System.out.println("Current Maximum: " + max );
    }

    }

