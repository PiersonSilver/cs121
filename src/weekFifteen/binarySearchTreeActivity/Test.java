package weekFifteen.binarySearchTreeActivity;

public class Test {
    public static void main(String[] args) {
        BinarySearchTreeDemo test = new BinarySearchTreeDemo();
        test.addNode('F');
        test.addNode('B');
        test.addNode('A');
        test.addNode('D');
        test.addNode('C');
        test.addNode('E');
        test.addNode('G');

        System.out.println("preorder:");
        test.preOrderTraverse(test.getRoot());
        System.out.println();
        System.out.println("inorder:");
        test.inOrderTraverse(test.getRoot());
        System.out.println();
        System.out.println("postorder:");
        test.postOrderTraverse(test.getRoot());

    }
}
