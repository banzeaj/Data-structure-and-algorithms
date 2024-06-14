import java.util.EmptyStackException;

public class Stack{
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new int [maxSize];
        this.top = -1;
    }

    public void push(int element){
        if(isFull()){
             System.out.println("Stack is full cannot push element ");
             return;
        }

        top++;
        stackArray[top] =element;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty cannot pop element ");
            return -1;
        }

        int poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty cannot peek element ");
            return -1;
        }
        return stackArray[top];
    }

    public static void main(String[] args){

     Stack stack = new Stack(5);
     // pushing element onto the stack
     
     stack.push(10);
     stack.push(20);
     stack.push(30);

     // peeking the top element of the stack

     System.out.println("top element of after pushed" + stack.peek());

     //popping element from the stack 

     System.out.println("popping element "+ stack.pop());
     System.out.println("popping element "+ stack.pop());
     System.out.println("popping element" + stack.pop());

     // TODO code applicaion logic here
    }

    private boolean isFull(){
        return(top == maxSize-1);
    }
    private boolean isEmpty(){
        return(top==-1);
    }
}