public class Node {

    private int value;
    private Node right;
    private Node left;

    public Node(int value)  {
        this.value = value;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public Node getLeft() {return left; }
    public void setLeft(Node left) {
        this.left = left;
    }

    public Integer getValue() { return value; }

}
