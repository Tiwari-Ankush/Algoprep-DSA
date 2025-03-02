public class Java12linkedList {
}

// {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
//            12. LINKED LISTS
// }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}

// ### LinkedList in Java: Basic Overview

// A **LinkedList** is a data structure where elements (called nodes) are stored in a sequence. Each node contains:
// 1. **Data**: The actual value stored in the node.
// 2. **Reference**: A pointer to the next node in the sequence.

// In Java, `LinkedList` is a part of the Java Collections Framework and is implemented as a doubly linked list, meaning each node has references to both the next and previous nodes.

// #### Key Points:
// - **Dynamic Size**: Unlike arrays, linked lists can grow or shrink in size dynamically.
// - **Efficient Insertions/Deletions**: Adding or removing elements is efficient because it only involves changing references (pointers) without shifting elements.
// - **Slower Access**: Accessing elements by index is slower compared to arrays since you have to traverse the list from the start.

// #### Basic Operations:
// - **Add**: Add elements to the list (`addFirst()`, `addLast()`, `add(index, element)`).
// - **Remove**: Remove elements (`removeFirst()`, `removeLast()`, `remove(index)`).
// - **Access**: Access elements (`get(index)`, `getFirst()`, `getLast()`).

// #### Code Example:
// ```java
// import java.util.LinkedList;

// public class Java12linkedList {
//     public static void main(String[] args) {
//         // Creating a LinkedList
//         LinkedList<String> linkedList = new LinkedList<>();

//         // Adding elements
//         linkedList.add("A");
//         linkedList.add("B");
//         linkedList.addLast("C"); // Adding at the end
//         linkedList.addFirst("D"); // Adding at the beginning
//         linkedList.add(2, "E"); // Adding at a specific position

//         // Accessing elements
//         System.out.println("First element: " + linkedList.getFirst());
//         System.out.println("Last element: " + linkedList.getLast());
//         System.out.println("Element at index 2: " + linkedList.get(2));

//         // Removing elements
//         linkedList.removeFirst(); // Remove first element
//         linkedList.removeLast();  // Remove last element
//         linkedList.remove(1);     // Remove element at index 1

//         // Printing the final list
//         System.out.println("Final LinkedList: " + linkedList);
//     }
// }
// ```

// ### Summary:
// - **LinkedList** in Java is a dynamic data structure that allows for efficient insertions and deletions.
// - It is part of the Java Collections Framework and supports all the basic list operations.
// - Though it provides flexibility in size, accessing elements by index is slower compared to arrays.

// ###################################

// // introduction and declaration of node for linkedlist
// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//         // Creating nodes using the parameterized constructor
//         Node n1 = new Node(10);
//         Node n2 = new Node(20);

//         // creating node using non parameterized constructor
//         Node n3 = new Node();
//         n3.data =30;
//         // Linking nodes
//         n1.next = n2;
//         n2.next =n3;
//         System.out.println("n1 value: " + n1.data);
//         System.out.println("n2 value: " + n1.next.data);
//         System.out.println("n3 value: " + n2.next.data);
//     }
// }


// // ##########################
// // Displaying nodes
// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//         Node head = new Node(10);
//         Node n2 = new Node(20);
//         Node n3 = new Node(30);

//         // // for adding nodes after the head
//         // head.next =n2;
//         // n2.next =n3;
//         // display(head);

//         // for adding nodes before the head
//         n3.next =n2; n2.next=head;
//         display(n3);
//     }

// // displaying the nodes like 1 -> 2 ->...
//     public static void display(Node head){
//         Node temp =head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;

//         }
//     System.out.println("null");
//     }

// }


// ##########################
// insert node in a linkedlist at head
// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//         Node head = new Node(10);

//         display(head); //above created Node head is paseed to the display function
//         head =insert(head, 20); // new head inserted and stored at the head variable
//         head = insert(head ,50);
//         head = insert(head, 40);
//         display(head); // above head var passed to the display function
//     }

//     //inserting node at starting
//         public static Node insert(Node head, int data){
//             Node newNode = new Node(data);
//             newNode.next =head;
//             head =newNode;
//             System.out.println("data of newly inserted node is: "+head.data);
//             return head;
//         }

// // displaying the nodes like 1 -> 2 ->...
//     public static void display(Node head){
//         Node temp =head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;

//         }
//     System.out.println("null");
//     }

// }

// #####################################
// insertign node at the end of linked list

// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//     // Manually creating and linking nodes
//         Node n1 = new Node(10); // First node
//         Node n2 = new Node(20); // Second node
//         Node n3 = new Node(30); // Third node
//         Node n4 = new Node(40); // Fourth node

//         // Linking nodes together to form the initial linked list
//         n1.next = n2; // 10 -> 20
//         n2.next = n3; // 20 -> 30
//         n3.next = n4; // 30 -> 40

//         // Display the linked list before insertion
//         display(n1); // This should print: 10 -> 20 -> 30 -> 40 -> null

//         // Insert a new node with value 50 after the last node
//         insert(n1, 50);

//         // Display the linked list after insertion
//         display(n1);
//     }

//     //inserting node after last node
//         public static Node insert(Node head, int data){
//             Node newNode = new Node(data);
//             Node temp = head;
//             //traversing till the last node
//             while(temp.next!=null){
//                 temp =temp.next;
//             }
//             //insert new node after the last node
//             temp.next=newNode;
//             // returning head of the linkedlist
//             return head;
//         }

// // displaying the nodes like 1 -> 2 ->...
//     public static void display(Node head){
//         Node temp =head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;

//         }
//     System.out.println("null");
//     }

// }

// #####################################
// //insert node with value (data) at specific index k

// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//         Node n1 = new Node(10); // First node
//         Node n2 = new Node(20); // Second node
//         Node n3 = new Node(30); // Third node
//         Node n4 = new Node(40); // Fourth node
//         Node n5 =new Node(50);
//         n1.next = n2; // 10 -> 20
//         n2.next = n3; // 20 -> 30
//         n3.next = n4; // 30 -> 40
//         n4.next =n5;
//         display(n1); // This should print: 10 -> 20 -> 30 -> 40 -> null

//         // Insert a new node with value 70 after the last node
//         int k =3;
//         insert(n1, 70,k);
//         int m=4;
//         insert(n1, 90,m);
//         display(n1);
//     }

//         public static Node insert(Node head, int data, int k){
//             Node newNode = new Node(data);
//             Node temp = head;
//             //traversing till specified k node
//             for(int i=1;i<=k-1;i++){
//                 temp =temp.next;
//             }
//             Node tempP1 =temp.next;
//             temp.next =newNode;
//             newNode.next = tempP1;
//             return head;
//         }

//     public static void display(Node head){
//         Node temp =head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;

//         }
//     System.out.println("null");
//     }

// }



// ##########################################
// // delete head in a linkedlist

// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//     // Manually creating and linking nodes
//         Node head = new Node(10); // First node
//         Node n2 = new Node(20); // Second node
//         Node n3 = new Node(30); // Third node
//         Node n4 = new Node(40); // Fourth node

//         // Linking nodes together to form the initial linked list
//         head.next = n2; // 10 -> 20
//         n2.next = n3; // 20 -> 30
//         n3.next = n4; // 30 -> 40

//         // Display the linked list before insertion
//         display(head); // This should print: 10 -> 20 -> 30 -> 40 -> null

//         // Insert a new node with value 50 after the last node
//         head =delete(head);

//         // Display the linked list after insertion
//         display(head);
//         head =delete(head);
//         display(head);
//     }

//     //deleting head
//         public static Node delete(Node head){
//             if(head==null){
//                 return null;
//             }
//             return head.next; // Return the second node as the new head
//         }

// // displaying the nodes like 1 -> 2 ->...
//     public static void display(Node head){
//         Node temp =head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;

//         }
//     System.out.println("null");
//     }

// }

// // ##############################
// // //deleting last node

// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//     // Manually creating and linking nodes
//         Node head = new Node(10); // First node
//         Node n2 = new Node(20); // Second node
//         Node n3 = new Node(30); // Third node
//         Node n4 = new Node(40); // Fourth node
//         Node n5 =new Node(50);
//         // Linking nodes together to form the initial linked list
//         head.next = n2; // 10 -> 20
//         n2.next = n3; // 20 -> 30
//         n3.next = n4; // 30 -> 40
//         n4.next =n5;

//         // Display the linked list before insertion
//         display(head); // This should print: 10 -> 20 -> 30 -> 40 -> null

//         // Insert a new node with value 50 after the last node
//         head =delete(head);

//         // Display the linked list after insertion
//         display(head);
//         delete(head);
//         display(head);
//     }

//     //deleting head
//         public static Node delete(Node head){
//             // Node newNode = new Node(data);
//             Node temp = head;
//             //traversing till the second last node in order to delete the last node
//             while(temp.next.next!=null){
//                 temp =temp.next;
//             }
//             //insert new node after the last node
//             temp.next=null;
//             // returning head of the linkedlist
//             return head;
//         }

// // displaying the nodes like 1 -> 2 ->...
//     public static void display(Node head){
//         Node temp =head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;

//         }
//     System.out.println("null");
//     }

// }


// ##############################
// //deleting any k node

// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//     // Manually creating and linking nodes
//         Node head = new Node(10); // First node
//         Node n2 = new Node(20); // Second node
//         Node n3 = new Node(30); // Third node
//         Node n4 = new Node(40); // Fourth node
//         Node n5 =new Node(50);
//         // Linking nodes together to form the initial linked list
//         head.next = n2; // 10 -> 20
//         n2.next = n3; // 20 -> 30
//         n3.next = n4; // 30 -> 40
//         n4.next =n5;

//         int k=3;
//         // Display the linked list before insertion
//         display(head); // This should print: 10 -> 20 -> 30 -> 40 -> null

//         // Insert a new node with value 50 after the last node
//         head =delete(head,k);

//         // Display the linked list after insertion
//         display(head);

//     }

//     //deleting spacificied node
//         public static Node delete(Node head, int k){
//             // Node newNode = new Node(data);
//             Node temp = head;
//             //traversing till the second last node in order to delete the last node
//           // Traverse to the node just before the k-th node
//     for (int i = 1; i < k - 1; i++) {
//         temp = temp.next;
//     }

//     // Bypassing the k-th node
//     temp.next = temp.next.next;

//     // Return the head of the modified list
//     return head;
//         }

// // displaying the nodes like 1 -> 2 ->...
//     public static void display(Node head){
//         Node temp =head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;

//         }
//     System.out.println("null");
//     }

// }


// #####################################
// reverse a linked list

// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//     // Manually creating and linking nodes
//         Node head = new Node(10); // First node
//         Node n2 = new Node(20); // Second node
//         Node n3 = new Node(30); // Third node
//         Node n4 = new Node(40); // Fourth node
//         Node n5 =new Node(50);
//         // Linking nodes together to form the initial linked list
//         head.next = n2; // 10 -> 20
//         n2.next = n3; // 20 -> 30
//         n3.next = n4; // 30 -> 40
//         n4.next =n5;

//         int k=3;
//         System.out.println("Original Linkedlist: ");
//         display(head); // This should print: 10 -> 20 -> 30 -> 40 -> null

//         // Insert a new node with value 50 after the last node
//         head =reverse(head);

//         System.out.println("Reversed Linkedlist: ");
//         display(head);

//     }

//     //deleting spacificied node
//         public static Node reverse(Node head){
//             Node curr =head;
//             Node prev =null;
//             while(curr!=null){
//                 Node nextNode =curr.next;
//                 curr.next= prev;
//                 prev=curr;
//                 curr =nextNode;
//             }
//             head = prev;
//             return head;
//         }

// // displaying the nodes like 1 -> 2 ->...
//     public static void display(Node head){
//         Node temp =head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;

//         }
//     System.out.println("null");
//     }

// }


// #####################################
// find mid of linkedlist
// given head of linkedlist, find the mid of it
//create slow and fast pointer
// approach >> move s pointer by 1 and f pointer by 2; and add even and odd condition

// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//     // Manually creating and linking nodes
//         Node head = new Node(10); // First node
//         Node n2 = new Node(20); // Second node
//         Node n3 = new Node(30); // Third node
//         Node n4 = new Node(40); // Fourth node
//         Node n5 =new Node(50);
//         Node n6 =new Node(60);
//         // Linking nodes together to form the initial linked list
//         head.next = n2; // 10 -> 20
//         n2.next = n3; // 20 -> 30
//         n3.next = n4; // 30 -> 40
//         n4.next =n5;
//         n5.next=n6;
//         int k=3;
//         System.out.println("Original Linkedlist: ");
//         display(head); // This should print: 10 -> 20 -> 30 -> 40 -> null


//         System.out.println(middle(head).data);



//     }

// // finding mid
//         public static Node middle(Node head){
//             Node s = head;
//             Node f =head;
//             while(f.next!=null && f.next.next!=null){
//                 s=s.next;
//                 f=f.next.next;
//             }
//             return s;
//         }

// // displaying the nodes like 1 -> 2 ->...
//     public static void display(Node head){
//         Node temp =head;
//         while(temp!=null){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;

//         }
//     System.out.println("null");
//     }

// }


// // #####################################
// // floyd cycle
// // The Floyd Cycle Detection Algorithm, also known as the Tortoise and Hare algorithm, is a technique used to detect cycles in a linked list. This algorithm is particularly useful in identifying if a linked list contains a loop (cycle) and, if so, finding the starting point of the loop.

// // if s and f meets then we have a cycle.
// // if there is a cycle, s and f will meet as gap is being reduced by 1 node in 1 iteration
// // slow can never complete the cycle

// class Node {
//     int data;  // Correct field name is 'data'
//     Node next;

//     Node(){
//         this.data =0;
//         this.next =null;
//     }

//     // Constructor to create a new node
//     Node(int data) {
//         this.data = data;
//         this.next = null;  // Initially, the next node is null
//     }
// }

// public class Java12linkedList {
//     public static void main(String[] args) {
//     // Manually creating and linking nodes
//         Node head = new Node(10); // First node
//         Node n2 = new Node(20); // Second node
//         Node n3 = new Node(30); // Third node
//         Node n4 = new Node(40); // Fourth node
//         Node n5 = new Node(50); // Fifth node
//         Node n6 = new Node(60); // Sixth node
//         Node n7 = new Node(70); // Seventh node
//         Node n8 = new Node(80); // Eighth node
//         Node n9 = new Node(90); // Ninth node
//         Node n10 = new Node(100); // Tenth node
//         Node n11 = new Node(110); // Eleventh node

//         // Linking nodes together to form the initial linked list
//         head.next = n2;  // 10 -> 20
//         n2.next = n3;    // 20 -> 30
//         n3.next = n4;    // 30 -> 40
//         n4.next = n5;    // 40 -> 50
//         n5.next = n6;    // 50 -> 60
//         n6.next = n7;    // 60 -> 70
//         n7.next = n8;    // 70 -> 80
//         n8.next = n9;    // 80 -> 90
//         n9.next = n10;   // 90 -> 100
//         n10.next = n11;  // 100 -> 110
//         n11.next = n6;   // 110 -> 60 (Creating the cycle)
//         System.out.println("Original Linked List with Cycle:");
//         display(head); // This should print until the cycle starts repeating

//         Node cycleStart = detectCycle(head);
//         if (cycleStart != null) {
//             System.out.println("Cycle detected! The cycle starts at node with value: " + cycleStart.data);
//         } else {
//             System.out.println("No cycle detected.");
//         }
//     }

// // finding cycle is present or not.
//         public static Node detectCycle(Node head){
//             Node s = head;
//             Node f =head;
//              // Move `s` by 1 step and `f` by 2 steps until they meet
//         while (f != null && f.next != null) {
//             s = s.next;
//             f = f.next.next;

//             // If `s` and `f` meet, a cycle is detected
//             if (s == f) {
//                 break;
//             }
//         }
//              // If no cycle was detected
//         if (f == null || f.next == null) {
//             return null;
//         }
//             // To find the start of the cycle, move `s` back to head and advance both pointers one step at a time
//         s = head;
//         while (s != f) {
//             s = s.next;
//             f = f.next;
//         }
//             return s; // it is the start of the cycle
//     }

// // displaying the nodes like 1 -> 2 ->...
//     public static void display(Node head){
//         Node temp =head;
//         int count =0;
//         while(temp!=null&& count <20){
//             System.out.print(temp.data+" -> ");
//             temp =temp.next;
//             count++;

//         }
//     System.out.println("...");
//     }

// }



// ####################################
