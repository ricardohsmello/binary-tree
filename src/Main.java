public class Main {

 public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.add(12);
        tree.add(4);
        tree.add(8);
        tree.add(2);
        tree.add(6);
        tree.add(16);

        System.out.println("#printing inOrder#\n");
        tree.inOrder(tree.getRoot());
        System.out.println("\n#printing preOrder#\n");
        tree.preOrder(tree.getRoot());
        System.out.println("\n#printing postOrder#\n");
        tree.postOrder(tree.getRoot());


    }
}
