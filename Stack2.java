import java.util.EmptyStackException;

public class Stack2 {
 
 private int maxSize;
 private int[] stackArray;
 private int top;
 
 public Stack2(int size){
 
 this.maxSize = size;
 this.stackArray = new int[maxSize];
 this.top = -1;
 }
 
 public void push(int element){
 if(isFull()){
 
 System.out.println("Stack is full cannot push element");
 return; 
 }

 top++;
 stackArray[top] = element;
 }
 public int pop(){
 if(isEmpty()){
 
 System.out.println("Stack is empty cannot pop element");
 return -1;
 }
 int poppedElement = stackArray[top];
 top--;
 return poppedElement;
 
 }
 
 public int peek(){
 if(isEmpty()){
 
 System.out.println(" Stack is empty cannot peek element");
 return -1;
 }
 return stackArray[top];
 }
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 
 Stack2 stack = new Stack2(5);
 // pushing element onto the stack
 stack.push(10);

 stack.push(20);
 stack.push(30);
 //peeking the top element of the stack 
 System.out.println("Top element after pushes " + stack.peek());
 // popping element from the stack 
 System.out.println("Popped element " + stack.pop());
 System.out.println("Popped element " + stack.pop());
 System.out.println("Popped element " + stack.pop());
 //popping elelment when is empty 
 System.out.println("Popped element " + stack.pop());
 // TODO code application logic here
 }
 private boolean isFull() {
 return (top==maxSize-1);
 }
 private boolean isEmpty() {
 return (top==-1);
 }
}