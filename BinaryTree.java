public class BinaryTree {
    // built tree preorder.......
    static class Node {
        int data ;
        Node  left;
        Node  right ;

        Node (int data ){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    static class binarytree {
        static int idx  = -1;
        public static Node BuildTree (int Nodes[]){
            idx++;
             
            if (Nodes[idx] == -1){
                return null;

            }
            Node newNode = new Node(Nodes[idx]);
            newNode.left = BuildTree (Nodes);
            newNode.right = BuildTree(Nodes);

            return newNode ;

        }
    }
    public static void main (String args [] ){
        int Nodes []= {1 ,2 ,4, -1,-1, -1, 5 ,-1 -1, 3 -1 , 6};
        binarytree tree = new binarytree();
        Node  root  = tree.BuildTree(Nodes);
        System.out.println(root.data);
    }
}
