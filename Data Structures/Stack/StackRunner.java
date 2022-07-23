public class StackRunner {
    public static void main(String[] args) {

        Stack newStack = new Stack(5);
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.push(40);
        newStack.push(50);
         System.out.println(newStack.isFull());

        System.out.println("Removed element " + newStack.pop());

        System.out.println("Top Most element is " + newStack.peek());
        System.out.println("size of stack is " + newStack.size());
        System.out.println(newStack.isEmpty());

       


    }
}

class Stack {
    int[] array;
    int boundaryValue;

    Stack(int initialStackSize) {
        array = new int[initialStackSize];
        System.out.println("Stack created");
        boundaryValue=-1;

    }
    public void push(int newValue){
        if(isFull()){
            System.out.println("Stack Over Flow (Not pushed =)"+newValue);
            return;
        }
        boundaryValue++;
        array[boundaryValue]=newValue;
    }
    public int pop(){
        int result = array[boundaryValue];
        boundaryValue--;
        return result;
    }
    public int peek() {
        return array[boundaryValue];

    }
    
    public int size(){
        return boundaryValue+1;

    }

    public boolean isEmpty(){
        if(boundaryValue==-1) return true;                
        return false;          
    }

    public boolean isFull(){
        if(boundaryValue+1==array.length) return true;
        return false;


    }

}

// Stack Functions

// isEmpty()
// isFull()
// push(int)
// pop()
// peek()
// size()
