//Strings

// it is the collection of characters
// 1. Alphabet
// a - z lowercase
// A - Z uppercase

// 2. special characters
// @ # $ ? ! ..

// 3. Numbers
// 0 1 2 3 4 5....9

// ASCII >> 256 characters total
//     A : 65 | a : 97  |'0' : 48
//         .  |     .   |    .
//         .  |    .    |    .
//     Z : 90 | z : 122 | '9': 57

// A >>> a (A+32)=a

// #############################################
// char to int >> implicit casting /automatic
// int x ='c';

// int to char >> complicated (but few cases will be implicit)(few cases should be explicit)
// char ch = 65;
// ##############################################

//// "static void main" must be defined in a public class.
// public class Java04strings {
//     public static void main(String[] args) {

//         // String str= "Ankush";
//         // System.out.println(str);

//         char ch1 = 'A';
//         System.out.println(ch1);
//         System.out.println('a'+"c");
//         System.out.println('a'+'c');

// //      implicit casting >> char to int
//         int x ='B';
//         System.out.println(x);
// //      explicit casting >> int to char
//         char ch2 = (char) 69;
//         System.out.println(ch2);

//     }
// }


// ##############################################
// In string we cant change characters directly
// (no updation)
// Actually  STRINGS ARE IMMUTABLE
// ##############################################

//user input strings

// public class Java04strings {
//     public static void main(String[] args) {

//         Scanner sc =new Scanner(System.in);
//         String str = sc.nextLine();
//         // System.out.println(str);
//         // char ch = sc.nextLine().charAt(0);
//         // System.out.println(ch);

// //         strings are immutable
// //         System.out.println(str.charAt(3));
// //         // str.charAt(3) = "i";
// //         // str.charAt(3) = '2';
// //         System.out.println(str.charAt(3));


//     }
// }



// ###############################################
// Substring and slicing of string
// substring >> any continuous part of string
// slicing >> we provide the starting and ending index
// for cutting down that string into that piece in that
// starting point in inclusive and ending point is exclusive

// public class Java04strings {
//     public static void main(String[] args) {

//         Scanner sc =new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(str);
//         // char ch = sc.nextLine().charAt(0);
//         // System.out.println(ch);

//         String substr = str.substring(0,7);
//         System.out.println(substr);
//         System.out.println(str.length());
//         System.out.println(substr.length());




//     }
// }


// // #############################################
// // toCharArray(); and .valueOf(str);
// // String to charArray & charArray to string
// public class Java04strings {
//     public static void main(String[] args) {

//         Scanner sc =new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(str);

//         System.out.println(str.length());

// // >> String to charArray using toCharArray();
//         char[] arr = str.toCharArray();
//         System.out.println(arr);

//         for(char ch: arr){
//             System.out.print(ch+" ");
//         }
//         System.out.println();

//         for(int ele: arr){
//             System.out.print(ele+" ");
//         }
//      System.out.println();

// // >> char array to string using .valueOf(arr);

//         String newstr ="";
//         for(char chr : arr){
//             newstr+=chr;
//         }
//         System.out.println(newstr);

//         String newsubstr = "";
//         for(int i =0;i<6;i++){
//             newsubstr+=arr[i];
//         }
//         System.out.println(newsubstr);


//     }
// }


// ##############################################
// TOGGLE CHARACTERS;
// input>>ankushgt25@gmail.com
// output>>ANKUSHGT25@GMAIL.COM
// public class Java04strings {

//     public static String toggle(char[] newstr){
//         String toggle = "";
//         for(int i=0;i<newstr.length;i++){
//             if(newstr[i]>='A' && newstr[i]<='Z'){
//                 toggle+=(char)(newstr[i]+32);

//                 }else if(newstr[i]>='a'&& newstr[i]<='z'){
//                 toggle+=(char)(newstr[i]-32);

//             }else{
//                 toggle+=(char)(newstr[i]); // i.e remains as it is
//             }

//         }
//         return toggle;
//     }
//     public static void main(String[] args) {

//         Scanner sc =new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(str);

//         char[] newstr = str.toCharArray();
//         System.out.println(toggle(newstr));
//         char[] arrayOftoggle=(toggle(newstr)).toCharArray();

//         System.out.println(arrayOftoggle);
//         for(char chr : arrayOftoggle){
//             System.out.print(chr+" ");
//         }
//     }
// }



import java.util.*;
// USING STRINGBUILDER
public class Java04strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] newstr = str.toCharArray();
        StringBuilder toggle = new StringBuilder();

        for (int i = 0; i < newstr.length; i++) {
            if (newstr[i] >= 'A' && newstr[i] <= 'Z') {
                toggle.append((char) (newstr[i] + 32));
            } else if (newstr[i] >= 'a' && newstr[i] <= 'z') {
                toggle.append((char) (newstr[i] - 32));
            } else {
                toggle.append(newstr[i]);
            }
        }

        System.out.println(toggle.toString());
    }
}


// ##########################################
//// REVERSE THE GIVEN STRING

// public class Java04strings {

//     public static String Reverse(String str){
//         char[] newstr = str.toCharArray();
//         String reverseString = "";
//     // using reverse traversing of array
//         // for(int i =str.length()-1;i>=0;i--){
//         //     reverseString+=newstr[i];
//         // }

//     // using swapping technique of array
//         int sp =0;
//         int ep=newstr.length-1;
//         while(sp<ep){
//             char temp =newstr[sp];
//             newstr[sp]= newstr[ep];
//             newstr[ep]=temp;
//             sp++; ep--;
//             reverseString="".valueOf(newstr);
//         }

//         return reverseString; //reversed string
//     }
//     public static void main(String[] args) {

//         Scanner sc =new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(str);
//         System.out.println(Reverse(str));

//     }
// }


// ###############################################
// //String concatenation

// public class Java04strings {

//     public static String Concat(String str1,String str2){
//         return (str1+" "+str2);
//     }
//     public static void main(String[] args) {

//         Scanner sc =new Scanner(System.in);
//         String str1 = sc.nextLine();
//         String str2 = sc.nextLine();

//         System.out.println(Concat(str1,str2));

//     }
// }



