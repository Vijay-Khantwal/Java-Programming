package Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.prettyDisplay();

//        BinarySearchTree tree = new BinarySearchTree();
//        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10,12};
//        tree.populate(nums);
//        tree.prettyDisplay();
//        System.out.println();
//        System.out.println();
//        tree.heightDisplay();

//        AVL_SelfBalancingTree tree = new AVL_SelfBalancingTree();
//        for(int i=1; i <= 100; i++) {
//            tree.insert(i);
//        }
//        tree.prettyDisplay();
//        System.out.println(tree.height());

        Heap<Integer> heap = new Heap<>();

        heap.insert(35);
        heap.insert(64);
        heap.insert(27);
        heap.insert(34);
        heap.insert(10);

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
    }

}
