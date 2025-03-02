// {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
// 9. SORTING CONCEPT -FOUNDATION
// }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
// // Foundation >>
// //     bubble sort.
// // Level Up >>
// //     selection sort
// //     insertion sort
// //     merge sort
// //     quick sort
// //     bucket sort

// // Note >>
//         // 1. Arrays.sort(); having TC: O(NlogN)

// // arranging data in increasing/decreasing order
import java.util.*;
// public class Java09sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Arrays.sort(arr); //o(nlogn)

//                 // printing in incerasing order
//             System.out.print("increasing: ");
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//                 System.out.println();

//             // printing in decreasing order
//         System.out.print("decreasing: ");
//         for(int i=(n-1);i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//         // System.out.println();
//     }
// }

// #######################
// order of removal
// Problem statement >>
// given N elements at every step, remove an array elements.
// cost to remove element = sum of array elements present.
// Find minimum cost to remove all elements.

// note: add cost first and then remove.
// approach >>
// we need to sort the array in ascending order
// max contribution =0th index =min ele
// 2nd max contribution = 1st index = 2nd min ele...so on

// example  [4 6 2 7]
// sorted array: [2 4 6 7]
// i=3: 2+4+6+7....19
// i=2: 2+4+6......12
// i=1: 2+4........6
// i=0: 2..........2
// ..............= 39

// public class Java09sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int result =removalOrder(arr,n);

//         //     // printing in decreasing order
//         // System.out.print("decreasing: ");
//         // for(int i=(n-1);i>=0;i--){
//         //     System.out.print(arr[i]+" ");
//         // }
//         System.out.println(result);
//     }
//     public static int removalOrder(int[] arr,int n){
//             Arrays.sort(arr); //o(nlogn)
//             int ans = 0;

//         for(int i=n-1;i>=0;i--){
//             ans = ans+(arr[i]*(n-i));
//         }
//         return ans;
//     }
// }

// ##############################

// // good integer {only distinct} ie.  if data is not repeated
// // given an arry[n], calculate no of good integers.
// // good integer >> if{no of element<ele == element itself} ie. arr[i] ==index (after sorting)
// public class Java09sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int result =goodInteger(arr,n);

//         //     // printing in decreasing order
//         // System.out.print("decreasing: ");
//         // for(int i=(n-1);i>=0;i--){
//         //     System.out.print(arr[i]+" ");
//         // }
//         System.out.println(result);
//     }
//     public static int goodInteger(int[] arr,int n){
//             Arrays.sort(arr); //o(nlogn)
//             int ans = 0;

//         for(int i=0;i<n;i++){
//             if(arr[i]==i){ans++;}
//         }
//         return ans;
//     }
// }


// // good integer if data is repeated.

// public class Java09sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int result =goodIntegerDuplicate(arr,n);

//         //     // printing in decreasing order
//         // System.out.print("decreasing: ");
//         // for(int i=(n-1);i>=0;i--){
//         //     System.out.print(arr[i]+" ");
//         // }
//         System.out.println(result);
//     }
//     public static int goodIntegerDuplicate(int[] arr,int n){
//             Arrays.sort(arr); //o(nlogn)
//             int ans = 0;
//             int least =0;
//         for(int i=1;i<n;i++){
//             if(arr[i]!=arr[i-1]){
//                 least=i;
//             }
//             if(arr[i]==least){ans++;}
//         }
//         return ans;
//     }
// }
// // tc = o(nlogn)
// // sc = o(1)

// #######################
// // sorting techniques >>
//     // 1. Bubble Sort
//         // >> sort the array in asc order but we can swap adjacent elements only

public class Java09sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] result =bubble(arr,n);
        System.out.println("sorted array using buble sort: ");
        for(int ele:result){
            System.out.print(ele+" ");
        }
    }
    public static int[] bubble(int[] arr,int n){
        for(int i=0; i<n-1;i++){
            for(int j=0;j<=n-2-i;j++){
                if(arr[j]>arr[j+1]){
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

// TC = O(N^2)
// SC = O(1)
