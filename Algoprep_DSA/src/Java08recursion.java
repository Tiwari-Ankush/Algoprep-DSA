// recursion >>
// it is nothing but a function calling itself
// tree concept
// backtracking
// DP
// graph concept


// COncept >>
//     three steps for recursion >>
//         1. Faith: define what your function should do and have faith that it works.
//         2. Java08recursion Logic: solve our problem with subproblems
//         3. Base case: solution to smallest subproblem

// ##################################################
// given N find the sum of numbers from (1....n) using recursion

import java.util.*;

// public class Java08recursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int result = recursion(n);
//         System.out.println(result);
//     }

//     public static int recursion(int n){
//         // base smallest logic
//         if(n==1){
//             return 1;
//          }

//         int temp = recursion(n-1);
//         return temp+n;
//     }
// }
// overall TC: O(1)*N = O(N)
// overall SC: O(1)*N = O(N)

// ##################################################
// find the factorial of the number

// public class Java08recursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int result = recursion(n);
//         System.out.println(result);
//     }

//     public static int recursion(int n){
//         // base smallest logic
//         if(n==0){
//             return 1;
//          }

//         int temp = recursion(n-1);
//         return temp*n;
//     }
// }

// ###################################################
// print Nth fibonacci number with recursion

// public class Java08recursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int result = recursion(n);
//         System.out.println(result);
// //     }

//     public static int recursion(int n){
//         // base smallest logic >> fib(0) = 0 & fib(1) = 1
//         if(n==0){
//             return 0;
//          }
//         if(n==1){
//             return 1;
//         }
//         // main logic
//         int temp1 = recursion(n-1);
//         int temp2 = recursion(n-2);

//         return (temp1+temp2);
//     }
// }



// ################################################
// print increasing order means 1 to n
// public class Java08recursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         // int result = recursion(n);
//         // System.out.println(result);
//         recursion(n);
//     }
//     public static void recursion(int n){
//         if (n==0){
//             return;
//         }

//         recursion(n-1);
//         System.out.println(n);
//     }
// }



// ###################################################
// // recursion part 2

// // Pow(a,n) >>
//         // given a and N, calculate a^N
// public class Java08recursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int n = sc.nextInt();

// int result = pow(a,n);
//         System.out.println(result);
//     }
//     public static int pow(int a,int n){
//         if (n==0){
//             return 1;
//         }if(n==1){
//             return a;
//         }

//     int temp = pow(a,n-1);
//         return temp*a;
//     }
// }

// // time compl = o(1)*n = O(N)
// // space complexity = o(1)*N = o(N)



// can we make something better than 0(N)
// Pow(a,n) >>
// given a and N, calculate a^N
// public class Java08recursion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int n = sc.nextInt();

// int result = pow(a,n);
//         System.out.println(result);
//     }
//     public static int pow(int a,int n){
//         if (n==0){
//             return 1;
//         }if(n==1){
//             return a;
//         }

//     int temp = pow(a,n/2);
//         if(n%2==0){
//             return temp*temp;
//         }else{
//             return temp*temp*a;
//         }
//     }
// }

// time compl = o(1)*o(logn) = O(logN)
// space complexity = o(1)*N = o(logN)



// ########################################
// given an array, check if it is palindrome or not? using recursion
// EX> MALAYALAM, MOM , DAD

public class Java08recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        char[] ch = str.toCharArray();

        int s= 0;
        int e =(ch.length)-1;
        // System.out.println(ch);
        boolean result =palindrome(s,e,ch);
        if(result){
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+" is not Palindrome");
        }
    }
    public static boolean palindrome(int s,int e, char[] ch){
        if(s==e){return true;}
        if(s>e){return true;}
        if(ch[s]==ch[e]){
            boolean temp = palindrome(s+1,e-1,ch);
            return temp;
        }
        else{
            return false;
        }
    }
}


// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
/*
SPACE COMPLEXITY >>
    (Space used in 1 function) * (Maximum number of function in stack at point of time).
*/
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@














