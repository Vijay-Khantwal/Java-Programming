package Trees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.prettyDisplay();

        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10,12};
        tree.populate(nums);
        tree.prettyDisplay();
        System.out.println();
        System.out.println();
        tree.heightDisplay();
    }

}
