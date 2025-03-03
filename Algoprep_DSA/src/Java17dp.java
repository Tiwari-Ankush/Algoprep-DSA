// {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
// 17. DYNAMIC PROGRAMMING CONCEPT -*IMP
// }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}

// dynamic programming intro
// Dynamic programming (DP) is a technique used to solve complex problems by breaking them down into simpler subproblems, solving each subproblem just once, and storing its solution for future use. This avoids the need to recompute the solution to the same subproblem multiple times, making the algorithm more efficient.

// DP is often applied to optimization problems, such as finding the shortest path, the longest subsequence, or the maximum profit. Two common approaches are:

// 1. Top-down (Memoization): Solving the problem recursively while storing the results of subproblems.
// 2. Bottom-up (Tabulation): Iteratively solving the subproblems and building up the solution.


// when to use DP
// Use Dynamic Programming (DP) when:
// 1. Optimal Substructure: The problem can be divided into smaller overlapping subproblems, and the solution to the overall problem can be derived from solutions to subproblems.
// 2. Overlapping Subproblems: The same subproblems are solved multiple times, so you can store their solutions to avoid redundant work (memoization or tabulation).


// steps for DP
// 1. Identify if DP is Suitable:
// Check for Optimal Substructure (problem can be broken into smaller subproblems).
// Check for Overlapping Subproblems (same subproblems get solved multiple times).
// 2. Define State:
// Define a DP table (array or matrix) where each entry represents a solution to a subproblem.
// Example: In a Fibonacci problem, the state dp[i] can represent the i-th Fibonacci number.
// 3. Recurrence Relation:
// Identify the relation between subproblems.
// Example: In Fibonacci, the recurrence relation is dp[i] = dp[i-1] + dp[i-2].
// 4. Base Case:
// Set initial values for the base cases.
// Example: For Fibonacci, dp[0] = 0, dp[1] = 1.
// 5. Iterative or Recursive Solution:
// Top-Down (Memoization): Solve subproblems recursively and store results.
// Bottom-Up (Tabulation): Iteratively fill the DP table.
// ###########

// fibonacci series soln using dynamic programming
import java.util.*;

// public class Java17dp {

//     static int[] dp; // now it can  accessible globally insode any function

//     public static void main(String[] args) {
//         int n=10;
//          dp = new int[n + 1];
//         Arrays.fill(dp, -1);

//         System.out.println(fib(n));
//     }
//     public static int fib(int n){
//         if(n==0 || n==1){
//             return n;
//         }

//         // ----------
//         if(dp[n]!=-1){
//             return dp[n];
//         } //-----------

//         int x= fib(n-1);
//         int y = fib(n-2);
//         // -----------
//         dp[n]=x+y;
//         // ----------
//         return dp[n];
//     }
// }


// ##############
// #n stairs
// given N , how many ways we can go from 0 - nth stair.
// Note: you can take steps of length 1 or 2

// no of ways reach(n) =no of ways to reach(n-1)+ no of ways to reach (n-2)

// total number of ways = x*1+y*1 +z*1 = x+y+z
// Golden rule of recursion:.
// No of calls = no of choices

// public class Java17dp {

//     static int[] dp;

//     public static void main(String[] args) {
//         int n=4;
//          dp = new int[n + 1];
//         Arrays.fill(dp, -1);

//         System.out.println(stairs(n));
//     }
//     public static int stairs(int n){
//         if(n==2 || n==1){
//             return n;
//         }

//         // ----------
//         if(dp[n]!=-1){
//             return dp[n];
//         } //-----------

//         int x= stairs(n-1);
//         int y = stairs(n-2);
//         // -----------
//         dp[n]=x+y;
//         // ----------
//         return dp[n];
//     }
// }


// ################
// steps for DP:
// 1. dp state: what are we trying to solve at one instance
// 2. recurrence relatioon: relation betn problem and subproblem (base case)
// 3. dp table: where we are going to store anwers of i instance
// ############


// // sqre - find minimum number of perfect square required to sum =N.


// public class Java17dp {

//     static int[] dp;

//     public static void main(String[] args) {
//         int n=6;
//          dp = new int[n + 1];
//         Arrays.fill(dp, -1);

//         System.out.println(square(n));
//     }
//     public static int square(int n){
//         if(n==0 || n==1){
//             return n;
//         }

//         // ----------
//         if(dp[n]!=-1){
//             return dp[n];
//         } //-----------

//         int smallest = Integer.MAX_VALUE;

//         for(int i=1;i*i <=n;i++){
//             int temp= square(n-(i*i));
//             smallest = Math.min(smallest,temp);
//         }
//         dp[n]=smallest+1;
//         // ----------
//         return dp[n];
//     }
// }

// ##########
// unique paths in grid
// // number of ways to go from (0,0)->(n-1,m-1) cell
// // movement allowed: cell : 1step right or 1step down/bottom

// public class Java17dp {

//     static int[][] dp;

//     public static void main(String[] args) {
//         int i=3,j=2;
//          dp = new int[i+1][j+1];

//         // Arrays.fill(): You can't use Arrays.fill() on a 2D array directly. You need to manually initialize the 2D array with -1
//          // Fill the 2D array with -1
//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }

//         System.out.println(pathcount(i,j));
//     }
//     public static int pathcount(int i, int j){
//         if(i==0 || j==0){
//             return 1;
//         } if(i<0 || j<0){
//             return 0;
//         }if(i==0 && j==0){
//             return 1;
//         }
//         // ---------- Check the dp table
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         } //-----------

//         int x= pathcount(i-1,j);
//         int y = pathcount(i,j-1);

//         // ---------- Store the result in dp table
//         dp[i][j] =x+y;
//         // ----------
//         return dp[i][j];
//     }
// }



// // #########
// // *2 - blocked and unblocked cell

// // number of ways to go from (0,0)->(n-1,m-1) cell
// // movement allowed: cell : 1step right or 1step down/bottom

// // mat[i][j] ==0 :blocked cell, mat[i][j] ==1: unblocked cell >> path cant go via blocked cell

// public class Java17dp {

//     static int[][] dp;

//     public static void main(String[] args) {
//              Scanner sc = new Scanner(System.in);

//         // Input for the size of the matrix
//         int i = sc.nextInt(); // Number of rows
//         int j = sc.nextInt(); // Number of columns

//         // Initialize dp array with size (i+1)x(j+1)
//         int[][] mat = new int[i][j]; // no need for i+1, j+1 if you don't need extra row/column

//         // Input elements into dp matrix
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 mat[row][col] = sc.nextInt();
//             }
//         }
//         // Initialize dp array for memoization
//         dp = new int[i][j];

//         // Fill dp with -1 (indicating unvisited cells)
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 dp[row][col] = -1;
//             }
//         }
//         // Output the matrix to check if it's correctly filled
//         System.out.println("Matrix filled by user:");
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 System.out.print(mat[row][col] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println(pathcount(mat,i-1,j-1));
//     }
//     public static int pathcount(int[][] mat, int i, int j){
//          if(i<0 || j<0 || mat[i][j] == 0){
//             return 0;
//         }
//         if(i==0 && j==0){
//             return 1;
//         }

//         // ---------- Check the dp table
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         } //-----------


//         int x= pathcount(mat,i-1,j);
//         int y = pathcount(mat,i,j-1);

//         // ---------- Store the result in dp table
//         dp[i][j] =x+y;
//         // ----------
//         return dp[i][j];
//     }
// }


// ------------------------------------
// minimum path sum
// given a 2d array filled with non-negative number. find a path from (0,0)->(n-1,m-1) which minimizes the total cost path
// movement allowed right and bottom

// public class Java17dp {

//     static int[][] dp;

//     public static void main(String[] args) {
//              Scanner sc = new Scanner(System.in);

//         // Input for the size of the matrix
//         int i = sc.nextInt(); // Number of rows
//         int j = sc.nextInt(); // Number of columns

//         // Initialize dp array with size (i+1)x(j+1)
//         int[][] mat = new int[i][j]; // no need for i+1, j+1 if you don't need extra row/column

//         // Input elements into dp matrix
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 mat[row][col] = sc.nextInt();
//             }
//         }
//         // Initialize dp array for memoization
//         dp = new int[i][j];

//         // Fill dp with -1 (indicating unvisited cells)
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 dp[row][col] = -1;
//             }
//         }
//         // Output the matrix to check if it's correctly filled
//         System.out.println("Matrix filled by user:");
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 System.out.print(mat[row][col] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println(minPathSum(mat,i-1,j-1));
//     }
//     public static int minPathSum(int[][] mat, int i, int j){

//         if(i<0 || j<0){
//             return Integer.MAX_VALUE;
//         }
//         if(i==0 && j==0){ return mat[0][0];}
//         if(dp[i][j]!=-1){
//             return dp[i][j];
//         }

//         int x= minPathSum(mat,i-1,j);
//         int y = minPathSum(mat,i,j-1);


//         dp[i][j]=Math.min(x,y)+mat[i][j];
//         return dp[i][j];
//     }

// }

// ------------------------------

// cherry pickup

// note:: int[][] mat = new int[3][4];
// mat.length = Number of rows (in this case, 3).
// mat[0].length = Number of columns (in this case, 4).
// 👉 mat[0].length tells how many columns are in the first row.
// given 2D array each cell contains 0,1
//     0 means cell is empty
//     1 means cell is having a cherry
//  returns the minimum number of cherrries you can collect by moving right or down and doing a full cycle.

// #full cycle means: >>
//     (0,0)->(n-1,m-1) & (n-1,m-1)->(0,0)

// instead of taking back when half cycle is completed we can take the 2 persons starts from start to end this will also acts as a full cycle.
// lets take 2 person starts from (0,0)
// so there are possibilities of movement for that 2 persons 2^2 possibilities
// p1 >>>> p2 >>> cherries pickedup
// R  ---- R  ---  let x
// R  ---- D  ---  let y
// D  ---- R  ---  let z
// D  ---- D  ---  let a
// then max of (x,y,z,a) will be my ans.
//     remember: if at that instance , cherry is there then what..
//         >>
//         max(x,y,z,a)+mat[i][j];

// Note: if both persons are at same position >>
//         then the contribution become only one cherry
// if both having different positions >>
//     then there contributions also separated



//sample input
//        5
//        6
//        1 1 1 1 0 0
//        0 0 0 1 0 1
//        1 0 0 1 0 0
//        0 0 0 1 0 0
//        0 0 0 1 1 1

//output :12

// // #1 approach >> without DP >> only recursion
// public class Java17dp {

//     public static void main(String[] args) {
//              Scanner sc = new Scanner(System.in);

//         // Input for the size of the matrix
//         int i = sc.nextInt(); // Number of rows
//         int j = sc.nextInt(); // Number of columns

//
//         int[][] mat = new int[i][j]; // no need for i+1, j+1 if you don't need extra row/column

//         // Input elements into dp matrix
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 mat[row][col] = sc.nextInt();
//             }
//         }

//
//         // Output the matrix to check if it's correctly filled
//         System.out.println("Matrix filled by user:");
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 System.out.print(mat[row][col] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println(cherryPickup(mat,0,0,0,0));
//     }

//     public static int cherryPickup(int[][] mat,int row1,int col1, int row2, int col2){
//         // step3:basecase
//         //negative base case
//         if (row1>=mat.length || row2>=mat.length || col1>=mat[0].length || col2 >=mat[0].length){
//             return Integer.MIN_VALUE;
//         }
//                 //blocked case
// if(mat[row1][col1]==-1 || mat[row2][col2]==-1){
//     return Integer.MIN_VALUE;
// }

//         //if we reached to the bottom right
//         if(row1==mat.length-1&&col1==mat[0].length-1&& row2==mat.length-1&&col2==mat[0].length-1){
//             return mat[row1][col1];
//         }



//         int temp1= cherryPickup(mat,row1,col1+1,row2,col2+1);
//             int temp2 =cherryPickup(mat,row1,col1+1,row2+1,col2);
//             int temp3 = cherryPickup(mat,row1+1,col1,row2,col2+1);
//             int temp4 = cherryPickup(mat,row1+1,col1,row2+1,col2);


//          int ans = Math.max(Math.max(temp1, temp2), Math.max(temp3, temp4));
//         // int ans = Math.max(temp1,temp2,temp3,temp4);

//         int contri =0;
//         if(row1==row2 && col1==col2){
//             contri=mat[row1][col1];
//         }else{
//             contri = mat[row1][col1]+mat[row2][col2];
//         }


//     return ans +contri;


//     }
// }
// --------------



// //// #2 >> with 4D DP :)

// public class Java17dp {

//     static int[][][][] dp;

//     public static void main(String[] args) {
//              Scanner sc = new Scanner(System.in);

//         // Input for the size of the matrix
//         int i = sc.nextInt(); // Number of rows
//         int j = sc.nextInt(); // Number of columns

//         // Initialize dp array with size (i+1)x(j+1)
//         int[][] mat = new int[i][j]; // no need for i+1, j+1 if you don't need extra row/column

//         // Input elements into dp matrix
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 mat[row][col] = sc.nextInt();
//             }
//         }
//         // Initialize 4d dp array for memoization
//         dp = new int[i][j][i][j];

//         // Fill dp with -1 (indicating unvisited cells)
//         for (int row1 = 0; row1 < i; row1++) {
//             for (int col1 = 0; col1 < j; col1++) {
//                 for (int row2 = 0; row2 < i; row2++) {
//                     for (int col2 = 0; col2 < j; col2++) {
//                         dp[row1][col1][row2][col2] = -1;
//                     }
//                 }
//             }
//         }

//         // Output the matrix to check if it's correctly filled
//         System.out.println("Matrix filled by user:");
//         for (int row = 0; row < i; row++) {
//             for (int col = 0; col < j; col++) {
//                 System.out.print(mat[row][col] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println(cherryPickup(mat,0,0,0,0));
//     }

//     public static int cherryPickup(int[][] mat,int row1,int col1, int row2, int col2){
//         // step3:basecase
//         //negative base case
//         if (row1>=mat.length || row2>=mat.length || col1>=mat[0].length || col2 >=mat[0].length){
//             return Integer.MIN_VALUE;
//         }
//                 //blocked case
// if(mat[row1][col1]==-1 || mat[row2][col2]==-1){
//     return Integer.MIN_VALUE;
// }

//         //if we reached to the bottom right
//         if(row1==mat.length-1&&col1==mat[0].length-1&& row2==mat.length-1&&col2==mat[0].length-1){
//             return mat[row1][col1];
//         }

//         if(dp[row1][col1][row2][col2]!=-1){
//             return dp[row1][col1][row2][col2];
//         }

//         int temp1= cherryPickup(mat,row1,col1+1,row2,col2+1);
//             int temp2 =cherryPickup(mat,row1,col1+1,row2+1,col2);
//             int temp3 = cherryPickup(mat,row1+1,col1,row2,col2+1);
//             int temp4 = cherryPickup(mat,row1+1,col1,row2+1,col2);


//          int ans = Math.max(Math.max(temp1, temp2), Math.max(temp3, temp4));

//         int contri =0;
//         if(row1==row2 && col1==col2){
//             contri=mat[row1][col1];
//         }else{
//             contri = mat[row1][col1]+mat[row2][col2];
//         }


//         dp[row1][col1][row2][col2]=ans+contri;

//         return dp[row1][col1][row2][col2];


//     }
// }



// -------------

//// #3 >> with 3D DP :)

public class Java17dp {

    static int[][][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the size of the matrix
        int i = sc.nextInt(); // Number of rows
        int j = sc.nextInt(); // Number of columns

        // Initialize dp array with size (i+1)x(j+1)
        int[][] mat = new int[i][j]; // no need for i+1, j+1 if you don't need extra row/column

        // Input elements into dp matrix
        for (int row = 0; row < i; row++) {
            for (int col = 0; col < j; col++) {
                mat[row][col] = sc.nextInt();
            }
        }
        // Initialize 4d dp array for memoization
        dp = new int[i][j][i]; // 3D DP array for (row1, col1, row2)

        // Fill dp with -1 (indicating unvisited cells)
        for (int row1 = 0; row1 < i; row1++) {
            for (int col1 = 0; col1 < j; col1++) {
                Arrays.fill(dp[row1][col1], -1);  // Fill with -1
            }
        }

        // Output the matrix to check if it's correctly filled
        System.out.println("Matrix filled by user:");
        for (int row = 0; row < i; row++) {
            for (int col = 0; col < j; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }


        System.out.println(cherryPickup(mat,0,0,0));
    }

    // row1+col1=row2+col2
    public static int cherryPickup(int[][] mat,int row1,int col1, int row2){

        int col2=row1+col1-row2;
        // step3:basecase
        //negative base case
        if (row1>=mat.length || row2>=mat.length || col1>=mat[0].length || col2 >=mat[0].length){
            return Integer.MIN_VALUE;
        }
        //blocked case
        if(mat[row1][col1]==-1 || mat[row2][col2]==-1){
            return Integer.MIN_VALUE;
        }

        //if we reached to the bottom right
        if(row1==mat.length-1&&col1==mat[0].length-1&& row2==mat.length-1&&col2==mat[0].length-1){
            return mat[row1][col1];
        }

        if(dp[row1][col1][row2]!=-1){
            return dp[row1][col1][row2];
        }

        int temp1= cherryPickup(mat,row1,col1+1,row2);
        int temp2 =cherryPickup(mat,row1,col1+1,row2+1);
        int temp3 = cherryPickup(mat,row1+1,col1,row2);
        int temp4 = cherryPickup(mat,row1+1,col1,row2+1);


        int ans = Math.max(Math.max(temp1, temp2), Math.max(temp3, temp4));

        int contri =0;
        if(row1==row2 && col1==col2){
            contri=mat[row1][col1];
        }else{
            contri = mat[row1][col1]+mat[row2][col2];
        }


        dp[row1][col1][row2]=ans+contri;

        return dp[row1][col1][row2];


    }
}


