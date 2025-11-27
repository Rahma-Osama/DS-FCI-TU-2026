package BST;

class BST {

    class Node {
        int key;
        Node left, right;

        Node(int data) {
            key = data;
            left = right = null;
        }
    }

    Node root;

    BST() {
        root = null;
    }

   
}



