public class Queue_Runner {
    public static void main(String[] args) {
        Queue queue = new Queue(8);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(50);


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        System.out.println("Queue is Empty "+queue.isEmpty());
        System.out.println("Queue is full "+queue.isFull());

        System.out.println(queue.peek());
        System.out.println(queue.size());



        
    }
}

class Queue{
    int front;
    int[] array;
    int rear;

    Queue(int size){
         front=-1;
         rear=-1;
        array=new int[size];
    }

    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue Full(element not inserted):"+element);
            return;
        }            
        rear++;        
        array[rear]=element;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        front++;
        int result = array[front];
        return result;
    }

    public boolean isEmpty(){
            if(front==rear || rear==-1){
                return true;
            }
            return false;

    }

    public boolean isFull(){
        if(rear+1==array.length){
            return true;
        }
        return false;
    }

    public int size(){
         return rear-front;
    }

    public  int peek(){
        return array[front+1];
    }
    
}


//  Queue Operations
// Dequeue
// Enqueue
// isEmpty
// isFull
// peek
// size



