package BinaryTree;

class Node{
    int value;
    Node left, right;

    Node(int element){
        value = element;
        left = right = null;
    }
}

class InorderTraversal {
    Node root;
    InorderTraversal(){
        root = null;
    }
    void taverse(Node node){
        if (node == null){
            return;
        }
        taverse(node.left);
        System.out.print(node.value + " ");
        taverse(node.right);
    }
    void taverse(){
        taverse(root);
    }

    public static void main(String[] args) {
        InorderTraversal pt = new InorderTraversal();
        pt.root = new Node(35);
        pt.root.left = new Node(25);
        pt.root.right = new Node(45);
        pt.root.left.left = new Node(20);
        pt.root.left.right = new Node(30);
        pt.root.left.left.left = new Node(10);
        pt.root.left.left.right = new Node(23);
        pt.root.right.left = new Node(40);
        pt.root.right.right = new Node(55);
        pt.root.right.right.left = new Node(50);
        pt.root.right.right.right = new Node(66);

        System.out.println("The Inorder traversal of given binary tree is - ");
        pt.taverse();


    }

}