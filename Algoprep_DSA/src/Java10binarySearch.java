public class Java10binarySearch {
}
// if array is not sorted before search then sort it first

// Binary Search_ Search in Array
// Given a sorted array of n integers and a number k, Return true if k is present otherwise return false.

// Input Format:
// First line contains integer n representing the length of array
// Second line contains n integers
// Third line contains integer k

// Output Format:
// Return true if k is present else false.

// Constraints:
// 1 <= n <= 10^9

// public class Java10binarySearch {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]= sc.nextInt();
//         }
//         int k = sc.nextInt();

//         boolean ans = binary(arr,k);
//         if(ans){ System.out.println("true");}
//         else{System.out.println("false");}
//     }
//     public static boolean binary(int[] arr, int k) {
//         Arrays.sort(arr);
// int l = 0;
//         int h = arr.length - 1;

//         while (l <= h) {
//         int mid = l + (h - l) / 2;
//             if (arr[mid] == k) {
//                 return true;
//             } else if (arr[mid] < k) {
//                 l = mid + 1;
//             } else {
//                 h = mid - 1;
//             }
//         }
//         return false;
//     }
// }

// talking about time complexity>>
// n >> n/2 >>n/4 >>....  so TC is o(logn)
// SC o(1)

// // #####################################
// // given a sorted arr[n] find floor of given num k
// // floor >> it is a just smaller number( means gratest no <= k in arr[])

// public class Java10binarySearch {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]= sc.nextInt();
//         }
//         int k = sc.nextInt();
//         System.out.println("floor of "+k+" is: "+binary(arr,k));
//     }
//     public static int binary(int[] arr, int k) {
//         Arrays.sort(arr);
//         int l = 0;
//         int h = arr.length - 1;
//         int ans = Integer.MIN_VALUE;
//         while (l <= h) {
//         int mid = l + (h - l) / 2;
//             if (arr[mid] == k) {
//                 return k;
//             } else if (arr[mid] < k) {
//                 ans =arr[mid];
//                 l= mid +1;
//             } else {
//                 // ans = arr[mid];
//                 h = mid -1;
//             }
//         }
//         return ans;
//     }
// }

// // talking about time complexity>>
// // n >> n/2 >>n/4 >>....  so TC is o(logn)
//                           // SC o(1)


// #######################

// Every element occurs twice except for one element, find tthat unique element
// note: duplicates are adjancent to each other.
// elements are not sorted

// we can take xor of elements, and at the end we got the single occured element >> having tc O(n)
// so better than the O(n) we need to use another idea >> binary search
//     like we check the occurence at the positions like even or odd
//     pre single occurence : numbers are starting from even
//     post single occurence : numbers are starting from odd


// public class Java10binarySearch {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]= sc.nextInt();
//         }
//         // int k = sc.nextInt();
//         System.out.println(unique(arr));
//     }
//     public static int unique(int[] arr) {

//         // for 0th index
//         if(arr[0]!=arr[1]){
//             return arr[0];
//         }

//         // for last index
//         if(arr[arr.length-1]!= arr[arr.length-2]){
//             return arr[arr.length-1];
//         }



//         int l = 2;
//         int h = arr.length - 3;

//         while (l <= h) {
//         int mid = l + (h - l) / 2;
//             if(arr[mid]!=arr[mid-1]&& arr[mid]!=arr[mid+1]){
//                 return arr[mid];
//             }

//             if(arr[mid]==arr[mid-1]){mid--;}
//             if(mid%2==0){
//                 l=mid+2;
//             }
//             else{h=mid-1;}
//         }
//         return -1;
//     }
// }

// // talking about time complexity>>
// // n >> n/2 >>n/4 >>....  so TC is o(logn)
//                           // SC o(1)



// // bonus lecture >> :) BINARY SEARCH VS TERNARY SEARCH
// binary search >>
//     dividing whole array into two parts and moving further by elemination of one side and continue...
//     talking about complexitty: n>(n/2)>... so O(1*logn with base 2)
//         WE are comparing one element in every itn and rejectiong one half so 1*logn

// ternary search >>
//     dividing whole array into three parts and move further by rejecting two parts.
//     talking about complexity: n> (n/3)> ... so O(2*logn with base 3)
//         WE are comparing two elements in every itn and hence rejectiong two halfs so 2*logn


// overall, Binary search is better than ternary search
