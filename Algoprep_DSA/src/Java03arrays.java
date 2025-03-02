

// "static void main" must be defined in a public class.
// public class Java03arrays {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         //taking the input array using stdin
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         // for printing the array
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         //for printing an array length
//         System.out.println("Array length is: "+arr.length);

//         //another method for initialization
//         int[] arr2 = {4,5,6,7,4,3,4};
//       for (int i=0;i<n;i++){
//         System.out.print(arr2[i]+" ");
//     }}
// }




//Sum of array having size n

// public class Java03arrays {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         //taking the input array using stdin
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         // logic for adding array elemets
//         int sum =0;
//         for(int i=0;i<n;i++){
//             sum=sum+arr[i];
//         }
//         System.out.println("array sum is " +sum);

//         // for printing the array
//         System.out.println("array elements are:")
//         for(int i=0;i<n;i++){
//             System.out.print(" "+arr[i]+" ");
//         }
//     }
// }





// Swapping indexes in array
//swap the values of 2 variables:
// public class Java03arrays {

//     // Modified swap method to work with array elements
//     public static void swap(int[] arr, int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // Taking the input array using stdin
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // Printing the array before swapping
//         System.out.println("array ele before swapping are:");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//         System.out.println();

//         // Swapping code function
//         swap(arr, 0, n - 1);

//         // Printing the array after swapping
//         System.out.println("array ele after swapping are:");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//     }
// }


// -------------------------------------------

//Reverse an array

// public class Java03arrays {


//     public static void reverse(int[] num){
//         int sp = 0;
//         int ep = num.length -1;

//         while(sp<=ep){
//             int temp = num[sp];
//             num[sp]=num[ep];
//             num[ep]=temp;

//             sp++;
//             ep--;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         // Taking the input array using stdin
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // Printing the array before swapping
//         System.out.println("array :");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//         System.out.println();


//         //calling the reverse function
//         reverse(arr);



//         // Printing the array after swapping
//         System.out.println("reverse array:");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//     }
// }




// reverse a given part of array

// public class Java03arrays {


//     public static void reversePart(int[] num,int sp,int ep){

//         while(sp<=ep){
//             int temp = num[sp];
//             num[sp]=num[ep];
//             num[ep]=temp;

//             sp++;
//             ep--;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int spt = sc.nextInt();
//         int ept= sc.nextInt();

//         // Taking the input array using stdin
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // Printing the array before swapping
//         System.out.println("array :");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//         System.out.println();


//         //calling the reversePart function
//         reversePart(arr,spt,ept);



//         // Printing the array after swapping
//         System.out.println("reverse array:");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//     }
// }





// rotate array by k (for k <=n)

// public class Java03arrays {


//     public static void reverse(int[] num,int sp, int ep){
//         // int sp = 0;
//         // int ep = num.length -1;

//         while(sp<=ep){
//             int temp = num[sp];
//             num[sp]=num[ep];
//             num[ep]=temp;

//             sp++;
//             ep--;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int k = sc.nextInt();

//         // Taking the input array using stdin
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // Printing the array before rotating
//         System.out.println("array :");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//         System.out.println();


//         //calling the reverse function
//         reverse(arr,0,n-1); //reverse the whole array first
//         reverse(arr,0,k-1); //reverse first k elements
//         reverse(arr,k,n-1); // reverse all the elements from k to array size -1


//         // Printing the array after rotation
//         System.out.println("Rotated array:");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//     }
// }


//if k value is very grater then..
//remember some points that, if k % n==0 hence n_rotations going to be zero and it will print the same array as taken input

// public class Java03arrays {


//     public static void reverse(int[] num,int sp, int ep){
//         // int sp = 0;
//         // int ep = num.length -1;

//         while(sp<=ep){
//             int temp = num[sp];
//             num[sp]=num[ep];
//             num[ep]=temp;

//             sp++;
//             ep--;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int k = sc.nextInt();

//         int n_rot = k%n;


//         // Taking the input array using stdin
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // Printing the array before rotating
//         System.out.println("array :");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//         System.out.println();


//         //calling the reverse function
//         reverse(arr,0,n-1); //reverse the whole array first
//         reverse(arr,0,n_rot-1); //reverse first k elements
//         reverse(arr,n_rot,n-1); // reverse all the elements from k to array size -1


//         // Printing the array after rotation
//         System.out.println("Rotated array:");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//     }
// }





//given N array elements, count total no. of elements having atleast 1 greater than itself

// approach
// first find the max ele from array
// count the maxCount
// return (no of elements - maxCount)

// public class Java03arrays {


// //     public static void reverse(int[] num,int sp, int ep){
// //         // int sp = 0;
// //         // int ep = num.length -1;

// //         while(sp<=ep){
// //             int temp = num[sp];
// //             num[sp]=num[ep];
// //             num[ep]=temp;

// //             sp++;
// //             ep--;
// //         }
// //     }

//     public static int max(int arr[],int n){
//         int max = arr[0];
//         for (int i=0 ; i<n;i++){
//             if(arr[i]>max){
//                 max =arr[i];
//             }
//         }
//             return max;
//         }
//     public static int maxCount(int arr[],int n){
//         int count =0;
//         int max_no =max(arr,n);
//         for(int i=0;i<n;i++){
//             if(max_no==arr[i]){
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];



//         // Taking the input array using stdin
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // Printing the array before rotating
//         System.out.println("array is :");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//         System.out.println();

// //         ###########################
//        System.out.println("max is: "+max(arr,n));
//         System.out.println("count of "+ max(arr,n)+ " is: "+maxCount(arr,n));
//         System.out.println("Total no. of elements having atleast 1 greater than itself is: "+(n-maxCount(arr,n)));

// //         ###############################

//         // // Printing the array after rotation
//         // System.out.println(":");
//         // for(int i = 0; i < n; i++){
//         //     System.out.print(" " + arr[i] + " ");
//         // }
//     }
// }






// //TWO SUM
// // problem statement that given N array elements check that if there exists a Pair(i,j) such that arr[i]+arr[j]=k and i!=j:
// // k is given sum and i and j are indexes

// public class Java03arrays {

//     public static int[] twoSum(int[] nums, int n, int target) {
//         for (int i = 0; i < n-1; i++) {
//             for (int j = i + 1; j < n-1; j++) {
//                 if (nums[j] + nums[i]== target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         // In case there is no solution, we'll just return null
//         return null;
//     }


// //      // below function is for checking the pair exist ir not
// //     public static void twoSum(int arr[],int n, int k)
// //     {

// //         for(int i=0;i<n-1;i++){
// //             for(int j=i+1;j<n;j++){
// //                 if(arr[i]+arr[j]==k){
// //                     System.out.println("Elements are: "+arr[i]+ " and "+arr[j]);
// //                                         // System.out.println("Indexes are: "+i+ " and "+j);

// //                     break;
// //                 }
// //                 // break;

// //             }
// //         }
// //     }



// //     // below function is for checking the pair exist ir not
// //     public static boolean twoSum(int arr[],int n, int k)
// //     {
// //         boolean twoSumm =false;
// //         for(int i=0;i<n-1;i++){
// //             for(int j=i+1;j<n;j++){
// //                 if(arr[i]+arr[j]==k){
// //                     twoSumm =true;
// //                 }
// //                 else{
// //                     twoSumm=false;
// //                 }

// //             }
// //         }
// //         return twoSumm;
// //     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int[] arr = new int[n];



//         // Taking the input array using stdin
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         // Printing the array before rotating
//         System.out.println("array is :");
//         for(int i = 0; i < n; i++){
//             System.out.print(" " + arr[i] + " ");
//         }
//         System.out.println();


//         // boolean twosum = twoSum(arr,n,k);
//         // if(twosum){
//             // System.out.println("pair exist");
//         // }

//        int[] answer = twoSum(arr, n, k);
//         if (answer != null) {
//             System.out.println("Indices of the two numbers that add up to the target:");
//             System.out.println("Index 1: " + answer[0] + ", Value 1: " + arr[answer[0]]);
//             System.out.println("Index 2: " + answer[1] + ", Value 2: " + arr[answer[1]]);
//         } else {
//             System.out.println("No two numbers add up to the target.");
//         }

//         // // Printing the array after rotation
//         // System.out.println(":");
//         // for(int i = 0; i < n; i++){
//         //     System.out.print(" " + arr[i] + " ");
//         // }
//     }
// }



// #########################################################
// 2D ARRAYS

// public class Java03arrays{


//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
////ARRAY INITIALIZATION
//         int [][] arr =new int [r][c];
////TAKING ARRAY INPUT BY LOOP
//          for(int i =0;i<r;i++){
//             for (int j=0;j<c;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }


//     }

// }




// // PRINT MATRIX ROW WISE or STANDARD MATRIX PRINTING
// public class Java03arrays{

//     public static void rowwise(int arr[][], int r, int c){
//// for ist itn i is constant here means row remains as it is
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }


//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int [][] arr =new int [r][c];

//         for(int i =0;i<r;i++){
//             for (int j=0;j<c;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }
//         rowwise(arr,r,c);
//     }

// }




// // PRINT MATRIX COLUMN WISE
// public class Java03arrays{

//     public static void columnwise(int arr[][], int r, int c){
//         // for ist itn here j is constant means column remains as it is
//         for(int j=0;j<c;j++){
//             for(int i=0;i<r;i++){

//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }


//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int [][] arr =new int [r][c];

//         for(int i =0;i<r;i++){
//             for (int j=0;j<c;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }
//         columnwise(arr,r,c);
//     }

// }





// PRINT MATRIX IN WAVE FORM

// original array
// 10 20 30 40
// 50 60 70 80
// 90 100 110 120
// 130 140 150 160
// 170 180 190 200

// output
// 10 20 30 40
// 80 70 60 50
// 90 100 110 120
// 160 150 140 130
// 170 180 190 200

//  public class Java03arrays{

//     public static void waveform(int arr[][], int r, int c){
//         for(int i=0;i<r;i++){
//             if(i%2==0){


//             for(int j=0;j<c;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             }else{
//                 for (int j=c-1;j>=0;j--){
//                     System.out.print(arr[i][j]+ " ");

//                 }
//             }
//             System.out.println();
//         }
//     }


//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int [][] arr =new int [r][c];

//         for(int i =0;i<r;i++){
//             for (int j=0;j<c;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//             // System.out.println();
//         }
//         waveform(arr,r,c);
//     }

// }




//// array manipulation

//  public class Java03arrays{

//     public static void function(int[][] arr,int i1, int i2){
//             arr[i1][i2] = 99;
//         }
//     // yes we can change the array elements


//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int i1 = sc.nextInt();
//         int i2 = sc.nextInt();
//         int [][] arr =new int [r][c];

//         for(int i =0;i<r;i++){
//             for (int j=0;j<c;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//             // System.out.println();
//         }
//         System.out.println(arr[i1][i2]);
//         function(arr,i1,i2);
//         System.out.println(arr[i1][i2]);

//     }

// }




//// ARRYALIST - DYNAMIC ARRAYS -for 1D array

// // arraylist in the background is just array being used smartly

//  public class Java03arrays{

//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int n =sc.nextInt();
//         ArrayList <Integer> list = new ArrayList<>();
//         // list.add(10);
//         // list.add(20);
//         // list.add(200);
//         // list.add(2099);
//         // System.out.println(list);
//         // System.out.println(list.get(2));
//         // list.set(2,1111);
//         // System.out.println(list.get(2));
//         // list.remove(0);
//         // list.remove(1);
//         // System.out.println(list);


//         for(int i =0;i<n;i++){

//                int number =sc.nextInt();
//                 list.add(number);

//         }
//         System.out.println(list);



//     }

// }




// ################################################
// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

//// ARRYALIST - DYNAMIC ARRAYS -as 2D array

// public class Java03arrays {
//     public static void main(String[] args) {
//         // Step 1: Create the main ArrayList (2D array)
//         ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

//         // Step 2: Create and populate rows
//         ArrayList<Integer> row1 = new ArrayList<>();
//         row1.add(1);
//         row1.add(2);
//         row1.add(3);

//         ArrayList<Integer> row2 = new ArrayList<>();
//         row2.add(4);
//         row2.add(5);
//         row2.add(6);

//         ArrayList<Integer> row3 = new ArrayList<>();
//         row3.add(7);
//         row3.add(8);
//         row3.add(9);

//         // Step 3: Add rows to the main ArrayList
//         matrix.add(row1);
//         matrix.add(row2);
//         matrix.add(row3);

//         // Print the 2D ArrayList using traditional for loops
//         System.out.println("Matrix:");
//         for (int i = 0; i < matrix.size(); i++) {
//             ArrayList<Integer> row = matrix.get(i);
//             for (int j = 0; j < row.size(); j++) {
//                 System.out.print(row.get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// // for accessing the elements:
// // int element = matrix.get(1).get(2); // Gets the value 6


// // For input elements for the 2D ArrayList using a Scanner and traditional for loops,

// arraylist contains single row with n numbers
// arraylist(arraylist) means multiple rows
// it builds a matrix
// firstly we need to take the number of rows for matrix
// then for each row we can change the no of elements  coz it is dynamic so we can change the number of colums
// so during column input we need to first enter  THE NO OF COLUMS  then we took that much numbers as a column input
// like this
// 3
// 3
// 1 2 3
// 2
// 4 5
// 4
// 7 8 9 10

import java.util.ArrayList;
import java.util.Scanner;

public class Java03arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create the main ArrayList (2D array)
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Get number of rows from the user
        int numRows = sc.nextInt();

        // Iterate through each row
        for (int i = 0; i < numRows; i++) {
            // Create a new row
            ArrayList<Integer> row = new ArrayList<>();

            // Get number of columns for this row
            int numCols = sc.nextInt();

            // Get elements for this row
            for (int j = 0; j < numCols; j++) {
                int element = sc.nextInt();
                row.add(element);
            }

            // Add the row to the matrix
            matrix.add(row);
        }

        // Print the 2D ArrayList
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Integer> row = matrix.get(i);
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j) + " ");
            }
            System.out.println();
        }
    }
}
