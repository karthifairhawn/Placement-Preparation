public class LinkedList_Runner{
    public static void main(String[] args) {

        LinkedList list=new LinkedList(20);

        // Insertion of data
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        // Insert at first
        list.insertAtFirst(70);

        // Deletion
        list.remove(2);

        // Searcg 
        System.out.println(list.findIndexOf(8000));


        // Insert at specif index
        list.insertAtSpecificIndex(60,3);
                
        // Display
        list.show();
    }
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class LinkedList{
    Node head;
    int size;

    LinkedList(int headData){
        this.head=new Node(headData);
    }

    public void insert(int newData){
        Node newNode=new Node(newData); 
        Node currentNode=head;
        while(currentNode.next!=null) currentNode = currentNode.next;        
        currentNode.next=newNode; 
    }
    
    public void show(){
        Node currentNode=head;
        
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;            
        }
    }
    
    public void insertAtFirst(int newData){
        Node first=new Node(newData);
        first.next=head;
        head=first;
    }

    public void remove(int index){
        Node previousNode;
        Node currentNode=head;        
        for(int i=0;i<index-1;i++){
            currentNode=currentNode.next;
        }        
        previousNode=currentNode;
        previousNode.next=previousNode.next.next;
    }

    public void insertAtSpecificIndex(int newData,int index){
            Node newNode=new Node(newData);
            Node currentNode=head;
            Node previousNode;
            Node nextNode;

            for(int i=0;i<index-1;i++) currentNode=currentNode.next; 
            
            previousNode=currentNode;
            nextNode=currentNode.next;

            previousNode.next=newNode;
            newNode.next=nextNode;

    }

    public int findIndexOf(int findData){
        Node currentNode=head;
        int index=0;

        while(currentNode!=null){
            if(currentNode.data==findData){
                return index;                
            }
            currentNode=currentNode.next;
            index++;                        
        }
        return -1;

        
        
         
    }
}


                
// node -a     node -b     node-c   || node -d     node -e          
// data - 10   data -20    data -30    data -40    data -50
// next - b    next -c     next -e     next-e      next - null
// 0            1          2           3           4



// Linked List Operations
// Show
// Remove
// Insert
// insertAtFirst
// insertAtSpecificIndex
// FindIndex