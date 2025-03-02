public class Java14queues {
}

// {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
// 14. QUEUES CONCEPT
// }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}

// queue basics and operations
// syntax >>
//     Queue <Integer> q = new LinkedList<>();
// operations in O(1)
//     >>  q.add(x) insert x at the end of the queue
//         q.remove() delete element from front
//         q.peek() return the front element
//         q.size() no of elements in queue


// public class Java14queues {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n =sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Queue <Integer> q = new LinkedList<>();

//         for(int i:arr){
//             q.add(i);
//         }
//         System.out.println(q.peek());
//         display(q);
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//         System.out.println(q.size());
//         display(q);

//     }
//     public static void display(Queue <Integer> queue){
//         for(int ele: queue){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }

// }

// #######################################
// // reverse fisrt k elements in queue TC=O(N): SC = O(N)
// public class Java14queues {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n =sc.nextInt();
//         int k = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Queue <Integer> q = new LinkedList<>();

//         for(int i:arr){
//             q.add(i);
//         }

//         display(q); // Display original queue
//         q = reverse(q, k); // Call reverse and assign returned queue
//         display(q); // Display reversed queue

//     }

//     public static Queue<Integer> reverse(Queue<Integer> q, int k) {
//         Stack<Integer> st1 = new Stack<>();

//         // Push first k elements from the queue into the stack
//         for (int i = 0; i < k; i++) {
//             st1.push(q.remove());
//         }

//         // Pop from the stack and add back to the queue
//         while (!st1.isEmpty()) {
//             q.add(st1.pop());
//         }

//         // Move the remaining elements (after the first k) to the back of the queue
//         for (int i = 0; i < (q.size() - k); i++) {
//             q.add(q.remove());
//         }

//         // Return the modified queue
//         return q;
//     }


//     public static void display(Queue <Integer> queue){
//         for(int ele: queue){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }

// }

// // #############################################
// // // implement queue using stack
// // Idea 1: Add Efficient Approach
// // -add(n): Push element n into s1.
// // -remove():
// // 1. Move n-1 elements from s1 to s2.
// // 2. The last element remaining in s1 is the element to remove (our answer).
// // 3. Move all elements back from s2 to s1.

// import java.util.Scanner;
// import java.util.Stack;

// public class Java14queues {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input array size and elements
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int[] arr = new int[n];

//         // Create stack to represent the queue
//         Stack<Integer> st = new Stack<>();

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             add(st, arr[i]); // Add elements to the queue
//         }

//         display(st); // Display original queue

//         // Example of remove operation
//         System.out.println("Removed element: " + remove(st)); // Remove front element
//         display(st); // Display queue after removal
//     }

//     // Add Efficient Approach
//     public static void add(Stack<Integer> st, int n) {
//         st.push(n);
//     }

//     public static int remove(Stack<Integer> st) {
//         Stack<Integer> st2 = new Stack<>();

//         // Move n-1 elements to st2
//         while (st.size() > 1) {
//             st2.push(st.pop());
//         }

//         // Get the last element, which is the front of the queue
//         int removedElement = st.pop();

//         // Move all elements back to st
//         while (!st2.isEmpty()) {
//             st.push(st2.pop());
//         }

//         return removedElement;
//     }

//     // Display method
//     public static void display(Stack<Integer> st) {
//         for (int ele : st) {
//             System.out.print(ele + " ");
//         }
//         System.out.println();
//     }
// }
// // **********

// // idea 2: Remove Efficient Approach:
// // -add(n):
// // 1. Move all elements from s1 to s2.
// // 2. Push n into s1.
// // 3. Move all elements back from s2 to s1.
// // -remove(): Remove the top element from s1.

// import java.util.Scanner;
// import java.util.Stack;

// public class Java14queues {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input array size and elements
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int[] arr = new int[n];

//         // Create stack to represent the queue
//         Stack<Integer> s1 = new Stack<>();

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             add(s1, arr[i]); // Add elements to the queue
//         }

//         display(s1); // Display original queue

//         // Example of remove operation
//         System.out.println("Removed element: " + remove(s1)); // Remove front element
//         display(s1); // Display queue after removal
//     }

//     // Remove Efficient Approach
//     public static void add(Stack<Integer> s1, int n) {
//         Stack<Integer> s2 = new Stack<>();

//         // Move all elements from s1 to s2
//         while (!s1.isEmpty()) {
//             s2.push(s1.pop());
//         }

//         // Push n to s1
//         s1.push(n);

//         // Move all elements back from s2 to s1
//         while (!s2.isEmpty()) {
//             s1.push(s2.pop());
//         }
//     }

//     public static int remove(Stack<Integer> s1) {
//         // Simply pop from s1 to remove the front element
//         return s1.pop();
//     }

//     // Display method
//     public static void display(Stack<Integer> st) {
//         for (int ele : st) {
//             System.out.print(ele + " ");
//         }
//         System.out.println();
//     }
// }

// // #########################################
// // Kth number using only 1 & 2
// // generate Kth number in series using digits 1 and 2 only
// // eg. k = 5; >> 1 2 11 12 21
// import java.util.Scanner;
// import java.util.Stack;

// public class Java14queues {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         System.out.println("The " + k + "th number is: " + k_num(k));
//     }

//     public static String k_num(int k) {
//         Queue <String> q = new LinkedList<>();
//         q.add("1"); q.add("2"); // ie. q= 1 2
//         String ans = "";
//         for(int i=0;i<k;i++){
//             String temp = q.remove(); //ie. temp =1
//              // Print the current number in the series
//             System.out.print(temp + " ");

//             if(i==k-1){
//                 ans = temp;
//             }

//             q.add(temp+"1");//like q= 1 1
//             q.add(temp+"2");// q= 1 2
//         }
//         System.out.println();
//         return ans;
//     }


// }

// // *************
// // generate Kth Palindrome number in series using digits 1 and 2 only
// // Note: only consider even digit number
// // eg. k =5; 11 22 1111 1221 2112

// public class Java14queues {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         System.out.println("The " + k + "th palindrome number is: " + k_num(k));
//     }

//     public static String k_num(int k) {
//         Queue<String> q = new LinkedList<>();
//         q.add("11");
//         q.add("22"); // Start the queue with the first two palindromes

//         String ans = "";

//         for (int i = 0; i < k; i++) {
//             String temp = q.remove(); // Remove the front of the queue

//             if (i == k - 1) { // Store the kth palindrome
//                 ans = temp;
//             }

//             // Generate the next palindromes by adding '1' and '2' to both sides
//             String left = temp.substring(0, temp.length() / 2);
//             q.add(left + "11" + left); // Add "11" in the middle
//             q.add(left + "22" + left); // Add "22" in the middle
//         }

//         return ans;
//     }
// }
