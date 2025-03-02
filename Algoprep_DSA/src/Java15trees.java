
// {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
// 15. TREES CONCEPT  - recursion concept required
// }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}

// trees intro
// In Data Structures and Algorithms (DSA), **trees** are hierarchical structures consisting of nodes connected by edges. A tree starts with a **root node** and has sub-nodes called **children**. Each node can have zero or more children, and a child node can only have one parent, making trees **acyclic**. The most common type of tree is a **binary tree**, where each node has up to two children.

// Key operations include insertion, deletion, traversal (in-order, pre-order, post-order), and searching. Trees are used in many applications like hierarchical data storage, searching, and managing sorted data.

// ### Prerequisites for Trees in Java:
// 1. **Basic understanding of Java**: Classes, objects, and methods.
// 2. **Recursion**: For tree traversals and manipulations.
// 3. **Linked Lists**: Knowledge of node-based structures.
// 4. **Stacks and Queues**: Useful for certain tree operations like breadth-first search (BFS).
// 5. **Pointers/References**: Handling connections between nodes.


// naming convention >>
//     parent <-> child : parent is immediate aboce and child is immediate below
//     Ancestors : all the nodes in path from given node to root node.
//     descendents: all the nodes below the given node
//     leaf nodes: nodes having 0 child nodes.

// property of tree >>
//         we can ahve exactly 1 root node
//         for any node it can have exactly 1 parent
//         it cant have cycle


// height of node >>
//     length of longest path from node to any of its
//     descendent leaf nodes
// >> heigth(leaf node):0
// >> h(node): max(height of child nodes)+1;

// Depth of node >>
//     length of path from given node to root node
// >> depth of rootnode =0
// >> Depth(node)= Depth(parent node)+1;

// binary tree >> everry node have atmax 2 child nodes

// #########
// basic tree structure >>

 class Node {
     int val;
     Node left, right;

     // Constructor to create a new node
     Node(int val) {
         this.val = val;
         left = right = null;
     }
 }

public class Java15trees {
    public static void main(String[] args) {
        // Creating three nodes
        Node n1 = new Node(1);  // Root node
        Node n2 = new Node(2);  // Left child of n1
        Node n3 = new Node(3);  // Right child of n1

        // Setting up the relationships
        n1.left = n2;  // n2 is the left child of n1
        n1.right = n3; // n3 is the right child of n1

        // Display the structure
        System.out.println("Parent node: " + n1.val);
        System.out.println("Left child of n1: " + n1.left.val);
        System.out.println("Right child of n1: " + n1.right.val);
    }
}

// // ###########

// // tree traversal
// // 3 types of traversals are there >>
// //     1. preorder traversal >> N-L-R
// //     2. inorder traversal >> L-N-R
// //     3. postorder traversal >> L-R-N

//      14
//     /  \
//   18    19
//  /  \     \
// 7    3     8
//     /     / \
//   10     4   15
// // Preorder : 14 18 7 3 10 19 8 4 15
// // Inorder : 7 18 10 3 14 19 4 8 15
// // postorder : 7 10 3 18 4 15 8 19 14

// class Node {
//     int val;
//     Node  left, right;

//     // Constructor to create a new node
//     Node(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

// public class Java15trees {
//     public static void main(String[] args) {
//         // Creating nodes
//         Node root = new Node(14);  // Root node
//         Node n18 = new Node(18);
//         Node n19 = new Node(19);
//         Node n7 = new Node(7);
//         Node n3 = new Node(3);
//         Node n10 = new Node(10);
//         Node n8 = new Node(8);
//         Node n4 = new Node(4);
//         Node n15 = new Node(15);

//         // Setting up the tree structure
//         root.left = n18;
//         root.right = n19;

//         n18.left = n7;
//         n18.right = n3;

//         n3.left = n10;
//         n19.right = n8;

//         n8.left = n4;
//         n8.right = n15;

//         System.out.print("Preorder : "); Pretraversal(root);
//         System.out.println();

//                 System.out.print("Inorder : "); Intraversal(root);
//                 System.out.println();

//         System.out.print("postorder : "); Posttraversal(root);

//     }
//     public static void Pretraversal(Node root){
//         if (root ==null){
//             return;
//         }
//         System.out.print(root.val+" ");
//         Pretraversal(root.left);
//         Pretraversal(root.right);
//     }


//     public static void Intraversal(Node root){
//         if (root ==null){
//             return;
//         }
//         Intraversal(root.left);
//         System.out.print(root.val+" ");
//         Intraversal(root.right);
//     }


//     public static void Posttraversal(Node root){
//         if (root ==null){
//             return;
//         }
//         Posttraversal(root.left);
//         Posttraversal(root.right);
//         System.out.print(root.val+" ");
//     }
// }


// ###############

// Arraylist concept in tree
// arraylist is basically a dynamic array >> array of array having dynammic sizing

// Syntaxx >>
//     List<Integer> ls = new ArrayList<>();
//     ArrayList<Integer> ls = new ArrayList<>();

// having basic functions like, ls.add(), ls.size(),
// ls.get(), ls.remove(index); IN THE O(1) TIME COMP.

// // ##################

// // size of the tree
// class Node {
//     int val;
//     Node  left, right;

//     // Constructor to create a new node
//     Node(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

// public class Java15trees {
//     public static void main(String[] args) {
//         // Creating nodes
//         Node root = new Node(14);  // Root node
//         Node n18 = new Node(18);
//         Node n19 = new Node(19);
//         Node n7 = new Node(7);
//         Node n3 = new Node(3);
//         Node n10 = new Node(10);
//         Node n8 = new Node(8);
//         Node n4 = new Node(4);
//         Node n15 = new Node(15);

//         // Setting up the tree structure
//         root.left = n18;
//         root.right = n19;

//         n18.left = n7;
//         n18.right = n3;

//         n3.left = n10;
//         n19.right = n8;

//         n8.left = n4;
//         n8.right = n15;

//         // System.out.print("Preorder : "); Pretraversal(root);
//         System.out.println("size is: "+size(root));


//     }
//         public static int size(Node root){
//             if (root ==null){
//             return 0;
//          }

//          int x =size(root.left);
//          int y= size(root.right);
//         return (x+y)+1;
//     }

// }

// // ###################
// // sum of all nodes >> given a tree , calculate sum of all nodes data in it
// // Faith: Given  root node, find and return the sum of tree

// class Node {
//     int val;
//     Node  left, right;

//     // Constructor to create a new node
//     Node(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

// public class Java15trees {
//     public static void main(String[] args) {
//         // Creating nodes
//         Node root = new Node(14);  // Root node
//         Node n18 = new Node(18);
//         Node n19 = new Node(19);
//         Node n7 = new Node(7);
//         Node n3 = new Node(3);
//         Node n10 = new Node(10);
//         Node n8 = new Node(8);
//         Node n4 = new Node(4);
//         Node n15 = new Node(15);

//         // Setting up the tree structure
//         root.left = n18;
//         root.right = n19;

//         n18.left = n7;
//         n18.right = n3;

//         n3.left = n10;
//         n19.right = n8;

//         n8.left = n4;
//         n8.right = n15;

//         // System.out.print("Preorder : "); Pretraversal(root);
//         System.out.println("Sum: "+sum(root));


//     }
//         public static int sum(Node root){
//             if (root ==null){
//             return 0;
//          }
//          int lsum =sum(root.left);
//          int rsum= sum(root.right);
//         return (lsum+rsum)+root.val;
//     }

// }

// // ####################
// // level order of the tree: SC =O(n)
// class Node {
//     int val;
//     Node  left, right;

//     // Constructor to create a new node
//     Node(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

// public class Java15trees {
//     public static void main(String[] args) {
//         // Creating nodes
//         Node root = new Node(14);  // Root node
//         Node n18 = new Node(18);
//         Node n19 = new Node(19);
//         Node n7 = new Node(7);
//         Node n3 = new Node(3);
//         Node n10 = new Node(10);
//         Node n8 = new Node(8);
//         Node n4 = new Node(4);
//         Node n15 = new Node(15);

//         // Setting up the tree structure
//         root.left = n18;
//         root.right = n19;

//         n18.left = n7;
//         n18.right = n3;

//         n3.left = n10;
//         n19.right = n8;

//         n8.left = n4;
//         n8.right = n15;


//         System.out.print("level order: ");
//               levelorder(root);

//     }
//      public static void levelorder(Node root){
//             Queue<Node> q = new LinkedList<>();
//             q.add(root);
//             while(q.size()>0){
//                 int n = q.size();
//                 for(int i=1;i<=n;i++){

//                 Node rem = q.remove();
//                 System.out.print(rem.val+" ");

//                 if(rem.left !=null){
//                     q.add(rem.left);
//                 }
//                 if(rem.right !=null){
//                     q.add(rem.right);
//                 }
//                 }
//             }
//     }

// }
// ####################
// // level order of the tree 2 : printing level wise visualization
// // SC =O(n)
// class Node {
//     int val;
//     Node  left, right;

//     // Constructor to create a new node
//     Node(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

// public class Java15trees {
//     public static void main(String[] args) {
//         // Creating nodes
//         Node root = new Node(14);  // Root node
//         Node n18 = new Node(18);
//         Node n19 = new Node(19);
//         Node n7 = new Node(7);
//         Node n3 = new Node(3);
//         Node n10 = new Node(10);
//         Node n8 = new Node(8);
//         Node n4 = new Node(4);
//         Node n15 = new Node(15);

//         // Setting up the tree structure
//         root.left = n18;
//         root.right = n19;

//         n18.left = n7;
//         n18.right = n3;

//         n3.left = n10;
//         n19.right = n8;

//         n8.left = n4;
//         n8.right = n15;


//         System.out.println("level order using queue: ");
//     // using queue
//               levelorder2(root);

//         // using array of arraylist or we can say list of list
//             System.out.println("level order using Arraylist: ");
//         ArrayList<ArrayList<Integer>> final_ans = levelorder3(root);
//         // Printing the result
//         for (ArrayList<Integer> level : final_ans) {
//             System.out.println(level);
//         }


//     }
//     //queue
//         public static void levelorder2(Node root){
//             Queue<Node> q = new LinkedList<>();
//             q.add(root);
//             while(q.size()>0){
//                 int n = q.size();
//                 for(int i=1;i<=n;i++){

//                 Node rem = q.remove();
//                 System.out.print(rem.val+" ");

//                 if(rem.left !=null){
//                     q.add(rem.left);
//                 }
//                 if(rem.right !=null){
//                     q.add(rem.right);
//                 }
//                 }
//                 System.out.println();
//             }
//     }

//     // arraylist
//        public static ArrayList<ArrayList<Integer>> levelorder3(Node root) {
//             Queue<Node> q = new LinkedList<>();
//             q.add(root);

//            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

//             while(q.size()>0){
//                 int n = q.size();

//                 ArrayList<Integer> temp = new ArrayList<>();
//                 for(int i=1;i<=n;i++){
//                       Node rem = q.remove();
//                     temp.add(rem.val);

//                     if(rem.left !=null){
//                         q.add(rem.left);
//                     }
//                     if(rem.right !=null){
//                         q.add(rem.right);
//                     }
//                 }
//                 ans.add(temp);
//             }
//            return ans;
//     }

// }
// #################

// // reverse level order
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;

// class Node {
//     int val;
//     Node left, right;

//     // Constructor to create a new node
//     Node(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

// public class Java15trees {

//     public static void main(String[] args) {
//         // Creating nodes
//         Node root = new Node(14);  // Root node
//         Node n18 = new Node(18);
//         Node n19 = new Node(19);
//         Node n7 = new Node(7);
//         Node n3 = new Node(3);
//         Node n10 = new Node(10);
//         Node n8 = new Node(8);
//         Node n4 = new Node(4);
//         Node n15 = new Node(15);

//         // Setting up the tree structure
//         root.left = n18;
//         root.right = n19;

//         n18.left = n7;
//         n18.right = n3;

//         n3.left = n10;
//         n19.right = n8;

//         n8.left = n4;
//         n8.right = n15;

//         // Performing reverse level order traversal
//         ArrayList<ArrayList<Integer>> result = reverseLevelOrder(root);

//         for (ArrayList<Integer> level : result) {
//             System.out.println(level);
//         }
//     }

//     // Method to perform reverse level order traversal from right to left
//     public static ArrayList<ArrayList<Integer>> reverseLevelOrder(Node root) {
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);

//         ArrayList<ArrayList<Integer>> levels = new ArrayList<>();

//         while (q.size()>0) {
//             int n = q.size();
//             ArrayList<Integer> temp = new ArrayList<>();

//             // Traverse each level from right to left
//             for (int i = 1; i <= n; i++) {
//                 Node rem = q.remove();
//                 temp.add(rem.val);

//                 // Add right child first, then left child to ensure right-to-left traversal
//                 if (rem.right != null) {
//                     q.add(rem.right);
//                 }
//                 if (rem.left != null) {
//                     q.add(rem.left);
//                 }
//             }
//             levels.add(temp);  // Add the level to the result list
//         }

//         // Reverse the list to get the final reverse level order
//         ArrayList<ArrayList<Integer>> reversedResult = new ArrayList<>();
//         for (int i = levels.size() - 1; i >= 0; i--) {
//             reversedResult.add(levels.get(i));
//         }

//         return reversedResult;
//     }
// }
