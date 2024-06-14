
class Node{

    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = next;

    }
}

class linkedlist{
    private Node head;

    public linkedlist(){
        this.head = null;
    }

    // method insert element at the beginning of the element 
    list public void insertAtTheBegininning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head =newNode;
    }


    // method insert element at the end of the list 
    public void insertAtTheEnd(int data){
     Node newNode =new Node(data);

     if(head == null){
        head = newNode;
     }
}
