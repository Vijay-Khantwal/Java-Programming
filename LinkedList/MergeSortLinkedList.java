package LinkedList;


public class MergeSortLinkedList {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertLast(8);
        list1.insertLast(4);
        list1.insertLast(9);
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(6);
        list1.insertLast(7);

        list1.display();
        list1.head = sort(list1.head);
        System.out.println("After Sorting");
        list1.display();
    }

    public static LL.Node sort(LL.Node head) {
        if(head == null || head.next == null){
            return head;
        }

        LL.Node mid = getMid(head);
//        System.out.println(head.value);
//        System.out.println(mid.value);
        LL.Node left = sort(head) ;
        LL.Node right = sort(mid) ;
        return merge(left,right);

    }

    private static LL.Node getMid(LL.Node head) {
        LL.Node prevMid = null;
        LL.Node fast = head;
        while(fast!=null && fast.next !=null){
            if(prevMid == null){
                prevMid = head;
            }
            else {
                prevMid = prevMid.next;
            }
            fast = fast.next.next;
        }
        LL.Node mid = prevMid.next;
        prevMid.next = null;
        return mid;
    }

    static LL.Node merge(LL.Node list1, LL.Node list2 ){
        LL.Node result = new LL.Node();
        LL.Node temp = result;
        while(list1 != null && list2 !=null){
            if(list1.value < list2.value){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2!=null){
            temp.next = list2;
        }
        return result.next;

    }

}
