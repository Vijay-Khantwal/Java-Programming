package Trees;

import java.util.Scanner;

class BinaryTree {

    public BinaryTree() {
    }
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    //insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        if(node == null){
            return ;
        }
        System.out.println("Do you want to insert to the left of:"+node.value+" True/False");
        if(scanner.nextBoolean()){
            System.out.println("Enter the element");
            node.left = new Node(scanner.nextInt());
            populate(scanner,node.left);
        }

        System.out.println("Do you want to insert to the right of:"+node.value+" True/False");
        if(scanner.nextBoolean()){
            System.out.println("Enter the element");
            node.right = new Node(scanner.nextInt());
            populate(scanner,node.right);
        }
    }

    public void display() {
        display(this.root, "");
    }
    private void display(Node node, String indent) {
        if(node == null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");

    }
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node, int level) {
        if(node == null) {
            return;
        }
        prettyDisplay(node.right,level +1);
        if(level == 0){
            System.out.println(node.value);
        }
        else{
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);
        }

        prettyDisplay(node.left,level+1);

    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        preOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.value + " ");
        preOrder(node.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.value + " ");
    }


}
