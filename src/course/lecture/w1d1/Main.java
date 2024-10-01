package course.lecture.w1d1;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(3);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(5);
        linkedList.append(10);
        linkedList.append(15);
        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }
}