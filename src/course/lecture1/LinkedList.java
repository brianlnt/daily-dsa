package course.lecture1;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList(int data) {
        Node newNode = new Node(data);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void print(){
        Node temp = this.head;
        String result = "";
        while(temp != null){
            result += temp.data + ", ";
            temp =temp.next;
        }
        if(result != ""){
            System.out.println("[" + result.substring(0, result.length() - 2) + "]");
        } else {
            System.out.println("[]");
        }
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        this.tail.next = newNode;
        this.tail = newNode;
        this.length += 1;
    }

    public void reverse(){
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        Node after = temp;
        Node before = null;
        while(temp != null){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
