// ****
// ****
// ****
// ****
import java.util.*;
// "static void main" must be defined in a public class.
public class Java01pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = 1; i<=n;i++){

            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//// *
//// **
//// ***

// "static void main" must be defined in a public class.
// public class Java01pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int star =1;
//         for(int i = 1; i<=n;i++){

//             for (int j=1; j<=star; j++){
//                 System.out.print("*");
//             }
//             star++;
//             System.out.println();
//         }
//     }
// }


// // --*
// // -***
// // *****
// // -***
// // --*

// // "static void main" must be defined in a public class.
// public class Java01pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int star =1;
//         int space=(n/2);
//         for(int i = 1; i<=n;i++){

//             for (int j=1; j<=space; j++){
//                 System.out.print(" ");
//             }

//             for (int k=1;k<=star; k++){
//                 System.out.print("*");
//             }


//             if(i<=n/2){
//                 space--;
//                 star +=2;

//             }else{
//                 space++;
//                 star-=2;
//             }
//             System.out.println();
//         }
//     }
// }






// // *** ***
// // **   **
// // *     *
// // **   **
// // *** ***
// // "static void main" must be defined in a public class.
// public class Java01pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int space =1;
//         int star=(n/2)+1;
//         for(int i = 1; i<=n;i++){

//             for (int j =1;j<=star;j++){
//                 System.out.print("*");

//             }
//             for(int k=1; k<=space;k++){
//                 System.out.print(" ");
//             }
//             for (int l =1;l<=star;l++){
//                 System.out.print("*");

//             }
//             if(i<=n/2){
//                 star--;
//                 space=space+2;
//             }else{
//                 space-=2;
//                 star++;
//             }


//             System.out.println();
//         }
//     }
// }


// // 1
// // 2 2
// // 3 3 3
// // 4 4 4 4

// // "static void main" must be defined in a public class.
// public class Java01pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int count = 1;
//         for(int i = 1; i<=n;i++){

//             for (int j=1; j<=count; j++){
//                 System.out.print(count);
//             }
//             count++;
//             System.out.println();
//         }
//     }
// }



// 1
// 2 3
// 4 5 6
// 7 8 9 10

// // "static void main" must be defined in a public class.
// public class Java01pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int count = 1;
//         for(int i = 1; i<=n;i++){

//             for (int j=1; j<=i; j++){
//                 System.out.print(count+" ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }
// }


// // * * * * *
// // *       *
// // *       *
// // * * * * *

// // // "static void main" must be defined in a public class.
// public class Java01pattern {

//     public static void pattern(String str){
//         for(int k=1;k<=1;k++){
//                 System.out.print(str);
//             }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int star=n+1;
//         int space=n-1;
//         for(int i = 1; i<=n;i++){

//             if(i<=1 || i==n){
//                 for (int j=1; j<=star; j++){
//                     System.out.print("*");
//             }
//             }else{
//                 String star_str="*";
//                 pattern(star_str);

//                 for(int l=1;l<=space;l++){
//                     System.out.print(" ");
//                 }
//                 pattern(star_str);
//             }
//             System.out.println();
//         }
//     }
// }





