public class LinkedList_Runner {
    public static void main(String args[]) {
        
        LinkedList li = new LinkedList();
        li.insert(10);
        li.insert(20);
        li.insert(30);
        li.insertAtStart(99);
        li.deleteAt(1);
        li.display();
    }
}


class LinkedList{
    Node head;
    
    public void insert(int a){
        Node n = new Node();
        n.data=a;
        n.next=null;
        
        if(head==null){
            head = n;
        }else{
            Node d = head;
            while(d.next!=null){
                d=d.next;
            }
            d.next = n;
        }
    }
    public void insertAtStart(int a){
        Node node = new Node();
        node.data=a;
        node.next = head;
        head=node;
    }
    
    public void deleteAt(int a){
        if(a==0){
            Node newnode = head.next;
            head = newnode;
        }else{
            Node newnode = new Node();            

            Node traverse = head;

            for(int i=1;i<a-1;i++){
                traverse = traverse.next;
            }

            newnode = traverse.next.next;
            traverse.next = newnode;

        }
    }
    
    public void display(){
        Node nex = head;
        while(nex.next!=null){
            System.out.println(nex.data);
            nex = nex.next;
        }
        System.out.println(nex.data);
    }
    
}

class Node{
    int data;
    Node next;
}
