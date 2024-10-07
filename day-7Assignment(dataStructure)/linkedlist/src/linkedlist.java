class linkedList{

    private Node head;
    private Node tail;
    private int size;

    linkedList(){
        head=tail=null;
        size=0;
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(size==0){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode1=new Node(data);
        if(size==0){
            head=tail=newNode1;
        }
        newNode1.next=tail;
        tail=newNode1;
        size++;
    }

    public void display(){
        Node currNode=head;
        while(currNode!=null){
            System.out.println(currNode.data+" -> ");
            currNode=currNode.next;
        }

    }

}
