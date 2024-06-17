package LinkedList;

public class BubbleSortLinkedList {
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
        bubble(list1);
        System.out.println("After Sorting");
        list1.display();
    }

    static void bubble(LL list){
        solve(list,list.size-1,0);
    }

    static void solve(LL list,int row,int col){
        if(row == 0){
            return;
        }

        if(col < row){
            LL.Node first = list.get(col);
            LL.Node second = list.get(col+1);
            if(first.value > second.value){
                //swap
                if(first == list.head){
                    first.next = second.next;
                    second.next = first;
                    list.head = second;
                }
                else if(second == list.tail){
                    LL.Node prev = list.get(col-1);
                    prev.next = second;
                    list.tail = first;
                    second.next = first;
                    first.next = null;
                }
                else{
                    LL.Node prev = list.get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            solve(list,row,++col);
        }
        else{
            solve(list,--row,0);
        }
    }
}
