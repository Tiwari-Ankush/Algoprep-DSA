public class Java16heaps {
}

// {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
// 16. HEAPS CONCEPT / Priority queue
// }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}

// introduction to heap / PQ
// A **heap** in DSA is a specialized binary tree-based data structure that satisfies the **heap property**:
// - In a **max heap**, each parent node is greater than or equal to its children.
// - In a **min heap**, each parent node is less than or equal to its children.

// Key points:
// - Heaps are typically used to implement **priority queues**.
// - They allow efficient access to the largest or smallest element in constant time.
// - Insertion and deletion in heaps take **O(log n)** time due to the tree's balanced structure.

// Heaps are often implemented using arrays, where:
// - The left child of node `i` is at index `2*i + 1`.
// - The right child is at index `2*i + 2`.
// - The parent is at index `(i - 1) / 2`.


// it has two types called minheap and maxheap
// 1. Min PQ >>
//     PriorityQueue<Integer> PQ = new PriorityQueue<>();
// 2. Max PQ >>
//     PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());

// operations of PQ >>
//     .add(); .remove();  .size();
//     .peek(); >> get the min ele if MinPQ
//              >> get the max ele if MaxPQ
//      The .poll() method in a PriorityQueue retrieves and removes the element at the front of the queue,

// implementation>>
// import java.util.PriorityQueue;
// import java.util.Collections;

// public class Java16heaps {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> minPQ = new PriorityQueue<>();
//         PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

//         minPQ.add(10);
//         minPQ.add(30);
//         minPQ.add(20);
//         minPQ.add(25);

//         maxPQ.add(10);
//         maxPQ.add(30);
//         maxPQ.add(20);
//         maxPQ.add(25);

//         System.out.println("MinPQ peek: " + minPQ.peek());
//         System.out.println("MaxPQ peek: " + maxPQ.peek());

//         System.out.println("MinPQ poll: " + minPQ.poll());
//         System.out.println("MaxPQ poll: " + maxPQ.poll());

//         System.out.println("MinPQ after poll: " + minPQ);
//         System.out.println("MaxPQ after poll: " + maxPQ);
//     }
// }

// ##############
// K smallest element. and kth largest
// given N distinct elements, Print K smallest elements
// arr[10] = {8,3,10,4,11,2,7,6,14,1};
// k=4: 1, 2 ,3 ,4  as ootput

// idea1: sort the array and return the first k elements
// idea 2 : add all the elements to min and get the first k elements

// code:
// import java.util.PriorityQueue;

// public class Java16heaps {
//     public static void main(String[] args) {
//         int[] arr = {8, 3, 10, 4, 11, 2, 7, 6, 14, 1};
//         int k = 3;
//         kthsmallest(arr, k);
//         System.out.println();
//         kthlargest(arr,k);
//     }

//     public static void kthsmallest(int[] arr, int k) {
//         PriorityQueue<Integer> minPQ = new PriorityQueue<>();

//         // Add all elements to the min-heap
//         for (int num : arr) {
//             minPQ.add(num);
//         }

//         // Poll the smallest k elements from the min-heap

//         for (int i = 0; i < k; i++) {
//             System.out.print(minPQ.poll() + " ");
//         }
//     }


//     public static void kthlargest(int[] arr, int k) {
//         PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

//         // Add all elements to the min-heap
//         for (int num : arr) {
//             maxPQ.add(num);
//         }

//         // Poll the smallest k elements from the min-heap
//         for (int i = 0; i < k; i++) {
//             System.out.print(maxPQ.poll() + " ");
//         }
//     }
// }

// ############

// median of an array >>{leetcode hard}
// Median = middle element of sorted array or numbers

// eg> 4,6,10, 14 >> (6+10)/2 = 8 is median

// print median of each iteration>>
// approach >>
// create two bucekts -
// 1. left bucket,  2.right bucket
// if element count is even >>
//     median = (max of left bucket+ min of right bucket)/2
// if element count is odd >>
//     median = max of left bucket only

// i.e >>
//     if(left.size()==right.size()){
//         ultimately new number should go to left PQ but to maintain inequality you havr to pass it via right PQ
//     }

//     if(left.size()!=right.size()){
//         ultimately new number should go to right PQ but to maintain inequility you have to pass it via left PQ
//     }


// TC: O(nlogn)
// SC = O(n)
// public class Java16heaps {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8};

//               PriorityQueue<Integer> left = new PriorityQueue<>();
//                   PriorityQueue<Integer> right = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0;i<arr.length;i++){
//             addnum(arr[i],left,right);
//         }

//         double ans = median(left,right);
//         System.out.println("median is: "+ans);

//     }
//     public static void addnum(int num,PriorityQueue<Integer> left, PriorityQueue<Integer> right){
//         if(left.size() == right.size()){
//             right.add(num);
//             left.add(right.remove());
//         }else{
//             left.add(num);
//             right.add(left.remove());
//         }
//     }

//     public static double median(PriorityQueue<Integer> left, PriorityQueue<Integer> right){
//         if(left.size() == right.size()){
//             return (left.peek() + right.peek())/2.0 ;
//         }
//         else{
//             return left.peek()*1.0;
//         }
//     }
// }
