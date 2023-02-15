public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public BinaryTree() {
        this.root = null;
    }

    // 10
    public void add(int value) {
        Node node = new Node(value);

        if (root == null) {
            this.root = node;
        } else {
            Node current = this.root;

            while(true) {
                if (node.getValue().compareTo(current.getValue()) < 0) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(node);
                        break;
                    }
                 } else {
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(node);
                        break;
                    }
                }
             }
        }
    }
//            tree.add(12);
//        tree.add(4);
//        tree.add(8);
//        tree.add(2);
//        tree.add(6);
//        tree.add(16);


    public void inOrder(Node current) {
        if (current != null) {
            inOrder(current.getLeft());
            System.out.println(current.getValue());
            inOrder(current.getRight());
        }
    }
    public void preOrder(Node current) {
        if (current != null) {
            System.out.println(current.getValue());
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }

    public void postOrder(Node current) {
        if (current != null) {
            postOrder(current.getLeft());
            postOrder(current.getRight());
            System.out.println(current.getValue());
        }
    }
}
