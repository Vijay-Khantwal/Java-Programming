package LinkedList;

public class RecursionReverse {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(4);
        list1.insertLast(5);
        list1.insertLast(6);
        list1.insertLast(7);

        list1.display();
        reverse(list1,list1.head);
//        list1.tail.next = null;  required if this statement not put in reverse function (reference line)
        System.out.println("After Reversing:- ");
        list1.display();
    }

    static void reverse(LL list,LL.Node node){
        if(node == list.tail){
            list.head = node;
            return;
        }

        reverse(list,node.next);
        list.tail.next = node;
        list.tail = node;
        list.tail.next = null; // reference given to this line
    }
}
