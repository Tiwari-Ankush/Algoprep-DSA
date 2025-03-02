public class Java13stacks {
}
// {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
// 13. STACKS CONCEPT
// }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
// ########################################
// introduction to the stack

// it is the concept which is worked on the concept called last in first out

// syntax >>
//     Stack <Integer> st = new Stack<>();
// operations >> all having TC of O(1).
//     st.push(num);
//     st.pop();
//     st.peek();  returns the top most element
//     st.size();

// public class Java13stacks {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Stack <Integer> st = new Stack<>();
//         // st.push(10);
//         // st.push(20);
//         // st.push(30);
//         // System.out.println(st.peek());
//         // st.pop();
//         // System.out.println(st.peek());
//         int n =sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         for(int i:arr){
//             st.push(i);
//         }
//         display(st);

//     }
//     public static void display(Stack <Integer> st){
//         for(int ele: st){
//             System.out.print(ele+" ");
//         }
//     }

// }

// ########################################
// linkedlist as stack
// Node class: Represents a node in the linked list. Each node has a data field and a next pointer to the next node.
// LinkedListStack class: Implements a stack using a linked list with methods push(), pop(), peek(), and display(). All of these operations (except display()) are done in constant time O(1).

// if we add the new values or elements from the tail of the linkedlist then its going with 0(N) TC.

// import java.util.Scanner;

// // Node class representing a single node in the linked list
// class Node {
//     int data;
//     Node next;

//     // Default constructor
//     Node() {
//         this.data = 0;
//         this.next = null;
//     }

//     // Constructor to create a new node with data
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// // Stack implementation using LinkedList (LIFO)
// class LinkedListStack {
//     private Node top;

//     // Constructor to initialize an empty stack
//     public LinkedListStack() {
//         this.top = null;
//     }

//     // Method to push an element onto the stack (O(1) time)
//     public void push(int data) {
//         Node newNode = new Node(data);
//         newNode.next = top;
//         top = newNode;
//         System.out.println("Pushed element: " + data);
//     }

//     // Method to pop the top element from the stack (O(1) time)
//     public int pop() {
//         if (top == null) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         int popped = top.data;
//         top = top.next;  // Move top to the next node
//         return popped;
//     }

//     // Method to peek the top element without popping it (O(1) time)
//     public int peek() {
//         if (top == null) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         return top.data;
//     }

//     // Method to display all elements in the stack (not O(1), but for visualization)
//     public void display() {
//         Node temp = top;
//         System.out.print("Linkedlist is: ");
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     // Method to check if the stack is empty (O(1) time)
//     public boolean isEmpty() {
//         return top == null;
//     }
// }

// public class Java13stacks {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Stack implementation using Java's in-built stack
//         Stack<Integer> st = new Stack<>();

//         int n = sc.nextInt(); // Input number of elements
//         int[] arr = new int[n];

//         // Reading input values
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Pushing elements to the built-in stack
//         for (int i : arr) {
//             st.push(i);
//         }

//         // Display elements of the built-in stack
//         display(st);

//         // Linked list-based stack implementation
//         LinkedListStack llStack = new LinkedListStack();

//         // Pushing elements to the LinkedListStack
//         for (int i : arr) {
//             llStack.push(i);
//         }

//         // Display elements of the LinkedListStack
//         llStack.display();

//         // Peek the top element of the LinkedListStack
//         System.out.println("Peeked element: " + llStack.peek());

//         // Pop elements from the LinkedListStack
//         System.out.println("Popped element: " + llStack.pop());

//         // Display remaining elements after pop
//         llStack.display();
//     }

//     // Display method for the built-in stack
//     public static void display(Stack<Integer> st) {
//         System.out.print("stack is: " );
//         for (int ele : st) {
//             System.out.print(ele + " ");
//         }
//         System.out.println();
//     }
// }


// ########################################
// remove adjacent duplicates
// >> given a string S, remove equal pair of adjacent character. return the final string

// public class Java13stacks {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         char[] arr = str.toCharArray();
//         System.out.print("Original array: ");
//         System.out.println(arr);

//         String result = duplicate(arr);
//         System.out.print("After removing duplicates: ");
//         System.out.println(result);

//     }
//     public static String duplicate(char[] arr){
//         Stack <Character> st = new Stack<>();
//         for(int i=0;i<arr.length;i++){

//         if(st.size()==0 || st.peek()!=arr[i]){
//             st.push(arr[i]);

//           }
//             else{
//                 st.pop();
//             }
//         }
//         char[] p_arr = new char[st.size()];
//         for(int i=p_arr.length-1;i>=0;i--){
//             p_arr[i] = st.pop();
//         }

//         String newstr = String.valueOf(p_arr);
//         return newstr;

//     }


// }

// // output
//// Original array: adcbbecccded
//// After removing duplicates: adcecded

// ########################################
// // balanced parenthesis


// public class Java13stacks {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         char[] arr = str.toCharArray();
//         System.out.print("Original array: ");
//         System.out.println(arr);

//         boolean result = parenthesis(arr);
//         if(result){
//         System.out.println("Valid.");
//         }else{
//         System.out.println("in-Valid.");
//         }

//     }
//      public static boolean parenthesis(char[] arr) {
//         Stack<Character> st = new Stack<>();
//         for (int i = 0; i < arr.length; i++) {
//             char current = arr[i];

//             if (current == '(' || current == '[' || current == '{') {
//                 st.push(current);
//             }

//             else if (current == ')' || current == ']' || current == '}') {
//                 if (st.isEmpty()) {
//                     return false;
//                 }

//                 char top = st.peek();

//                 if ((current == ')' && top == '(') ||
//                     (current == ']' && top == '[') ||
//                     (current == '}' && top == '{')) {
//                     st.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         return st.isEmpty();
//     }

// }


// // ########################################
// // combining both alphabets and parenthese

// public class Java13stacks {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         char[] arr = str.toCharArray();
//         System.out.print("Original array: ");
//         System.out.println(arr);

//         boolean isValidParentheses = checkParentheses(arr);
//         String resultString = removeDuplicates(arr);

//         if(isValidParentheses){
//             System.out.println("Valid Parentheses.");
//         } else {
//             System.out.println("Invalid Parentheses.");
//         }

//         System.out.print("After removing duplicates: ");
//         System.out.println(resultString);
//     }

//     // Method to check for balanced parentheses
//     public static boolean checkParentheses(char[] arr) {
//         Stack<Character> st = new Stack<>();

//         for (char current : arr) {
//             // If it's an opening bracket, push to the stack
//             if (current == '(' || current == '[' || current == '{') {
//                 st.push(current);
//             }
//             // If it's a closing bracket, check for matching opening bracket
//             else if (current == ')' || current == ']' || current == '}') {
//                 if (st.isEmpty()) {
//                     return false;  // No matching opening bracket
//                 }

//                 char top = st.peek();
//                 if ((current == ')' && top == '(') ||
//                     (current == ']' && top == '[') ||
//                     (current == '}' && top == '{')) {
//                     st.pop();  // Pop the matching opening bracket
//                 } else {
//                     return false;  // Mismatched brackets
//                 }
//             }
//         }

//         return st.isEmpty();  // True if all brackets are balanced
//     }

//     // Method to remove consecutive duplicates of a-z and A-Z
//     public static String removeDuplicates(char[] arr) {
//         Stack<Character> st = new Stack<>();

//         for (char current : arr) {
//             // If it's an alphabetic character, check for duplicates
//             if (Character.isLetter(current)) {
//                 if (st.isEmpty() || st.peek() != current) {
//                     st.push(current);
//                 } else {
//                     st.pop();  // Remove duplicate
//                 }
//             }
//         }

//         // Create the resulting string from the stack
//         StringBuilder result = new StringBuilder();
//         while (!st.isEmpty()) {
//             result.insert(0, st.pop());
//         }

//         return result.toString();
//     }
// }




// ########################################
// min stack  in 0(1) TC.

// public class Java13stacks {
//     static Stack<Integer> st = new Stack<>();
//     static Stack<Integer> minStack = new Stack<>();

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i : arr) {
//             push(i);
//         }

//         display(st);
//         System.out.println("\nMinimum element: " + getMin());
//     }

//     public static void push(int x) {
//         st.push(x);

//         if (minStack.isEmpty() || x <= minStack.peek()) {
//             minStack.push(x);
//         }
//     }

//     public static void pop() {
//         if (!st.isEmpty()) {
//             int popped = st.pop();
//             if (popped == minStack.peek()) {
//                 minStack.pop();
//             }
//         }
//     }

//     public static int getMin() {
//         if (!minStack.isEmpty()) {
//             return minStack.peek();
//         }
//         return -1;  // If stack is empty, return an indicator value
//     }

//     public static void display(Stack<Integer> st) {
//         for (int ele : st) {
//             System.out.print(ele + " ");
//         }
//     }
// }
// // ########################################

