package Trees;

public class AVL_SelfBalancingTree {
    public static class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        Node(int value){
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    private Node root;
    AVL_SelfBalancingTree(){
    }
    public int height() {
        return height(root);
    }
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(node.value < value){
            node.right = insert(value,node.right);
        }
        if(node.value > value){
            node.left = insert(value,node.left);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1 ;

        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1 ){
            //left is heavy
            if(height(node.left.left) - height(node.left.right ) > 0){
                //Left-Left case;
                return rightRotate(node);
            }
            else{
                //Left Right Case;
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.right) - height(node.left) > 1){
            //right is heavy
            if(height(node.right.right) - height(node.right.left) > 0){
                //right-right case
                return leftRotate(node);
            }
            else{
                //right-left case;
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        c.height = Math.max(height(c.left),height(c.right)) + 1;
        p.height = Math.max(height(p.left),height(p.right)) + 1;

        return p ;
    }
    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right)) + 1;
        c.height = Math.max(height(c.left),height(c.right)) + 1;

        return c;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
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

}
