// BIT MANIPULATION

// "static void main" must be defined in a public class.

// ###############################
// // DECIMAL TO BINARY CONVERSION
// // 1. USING BUILT IN METHOD OF JAVA

// public class Java05bitManipulation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         String binaryString = Integer.toBinaryString(n);
//         System.out.println("Binary representation: " + binaryString);
//     }
// }


// // 2. using manual method or logic
// public class Java05bitManipulation {

//     public static String decimalToBinary(int n) {
//         if (n == 0) return "0";

//         StringBuilder binary = new StringBuilder();
//         while (n > 0) { //loop untill n>0
//             // if n = 29
//             int remainder = n % 2; // 29%2 ==1
//             binary.insert(0, remainder); // at 0th index 1 is inserted
//             n /= 2; // 29/2 = 14 : new n is now 14
//         }
//         return binary.toString();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         String binaryString = decimalToBinary(n);
//         System.out.println("Binary representation: " + binaryString);
//     }
// }


// // 3. using xor operations -- getting complex
// // Bit Length: Java's int type is 32 bits long, so you need to consider all 32 bits. thats why
// // we need to iterate over the bits of a 32-bit integer.
// public class Java05bitManipulation {

//     public static String toBinary(int n) {
//         StringBuilder binary = new StringBuilder();
//         for (int i = 31; i >= 0; i--) {
//             if ((n & (1 << i)) != 0) {
//                 // (1 << i) is left shift bitmasking
//                 binary.append('1');
//             } else if (binary.length() > 0) {
//                 binary.append('0');
//             }
//         }
//         return binary.length() == 0 ? "0" : binary.toString();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         String binaryString = toBinary(n);
//         System.out.println("Binary representation: " + binaryString);
//     }
// }

// let n =29;
// for Iteration i = 31
// and also same for Iteration i = 30 to i = 5
// Bitmask: 1 << 31 results in 10000000000000000000000000000000 (binary).
// Bitwise AND Operation: 29 & (1 << 31)
// 29 in binary: 00000000000000000000000000011101
// Bitmask: 10000000000000000000000000000000
// Result: 00000000000000000000000000000000 (binary), which is 0 in decimal.
// Action: Since the result is 0, we do not append '1' or '0' because the binary string is still empty.

// after that:
// Iteration i = 4

// Bitmask: 1 << 4 results in 00000000000000000000000000010000 (binary).
// Bitwise AND Operation: 29 & (1 << 4)
// 29 in binary: 00000000000000000000000000011101
// Bitmask: 00000000000000000000000000010000
// Result: 00000000000000000000000000010000 (binary), which is 16 in decimal.
// Action: The result is 16, which is non-zero. So, we append '1' to the StringBuilder (binary now contains '1').

// same for i =3,2,1,0



// ###################################################
// ###################################################

// binary to decimal using built in and manual method only

// // 1.built in method
// public class BinaryToDecimal {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String binaryString = scanner.nextLine();
//         int decimalNumber = Integer.parseInt(binaryString, 2);
//     System.out.println(decimalNumber);
//     }
// }


// // 2. manual method

// public class BinaryToDecimal {
//     public static int binaryToDecimal(String binaryString) {
//         int decimal = 0;
//         int length = binaryString.length();

//         for (int i = 0; i < length; i++) {
//             char bit = binaryString.charAt(i);
//             int bitValue = Character.getNumericValue(bit); // it represent bit to numeric value like for '0'>>0,'1'>>1
//             int power = length - i - 1;
//             decimal += bitValue * Math.pow(2, power);
//         } return decimal;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String binaryString = scanner.nextLine();
//     System.out.println(binaryToDecimal(binaryString));
//     }
// }



// // #################################################
// // binary string addition >> getting complex bro
// public class Java05bitManipulation {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String binary1 = scanner.nextLine();
//         String binary2 = scanner.nextLine();
//         String sum = addBinary(binary1, binary2);
//         System.out.println(sum);
//         scanner.close();
//     }

//     public static String addBinary(String a, String b) {
//         StringBuilder result = new StringBuilder();
//         int carry = 0;
//         int length1 = a.length();
//         int length2 = b.length();
//         int maxLength = Math.max(length1, length2);

//         for (int i = 0; i < maxLength; i++) {
//             int bit1 = i < length1 ? a.charAt(length1 - 1 - i) - '0' : 0;
//             int bit2 = i < length2 ? b.charAt(length2 - 1 - i) - '0' : 0;
//             int sum = bit1 + bit2 + carry;
//             carry = sum / 2;
//             result.append(sum % 2);
//         }

//         if (carry != 0) {
//             result.append(carry);
//         } return result.reverse().toString();
//     }
// }




// #################################################

// BITWISE OPERATORS >>
// AND &
// OR  |
// XOR  ^
// LEFT SHIFT  <<
// RIGHT SHIFT >>

// public class Java05bitManipulation {
//     public static void main(String[] args) {
//         System.out.println(23&10);
//         System.out.println(23^10);
//         System.out.println(23|10);

//     }
// }



// ##############################################
// given an integer positive number, identify whether no is even or odd using bit manipulations.
// note: use of + - * / are not allowed

// public class Java05bitManipulation {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         // hint: rightmost bit is always 0 for even number
//         if((n&1)==0){
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }

//     }
// }


// ############################################
// properties
// 1. commutative property >>
//     a&b = b&a
//     a|b = b|a
//     a^b = b^a
// 2. associative property >>
//     a&b&c = (a&b)&c = a&(b&c)
//     a|b|c = (a|b)|c = a|(b|c)
//     a^b^c = (a^b)^c = a^(b^c)

// 3. >>
//     N&N =N
//     N&0 =0
//     N|N =N
//     N^0 =N
//     N^N =0
// ############################################



// ----------------------------
// given array, every element appears twice except for one element which appears once, find that unique element

// public class Java05bitManipulation {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int ans =0;
//         for(int i=0;i<arr.length;i++){
//             ans =ans ^arr[i];
//         }
//         System.out.println(ans);
//     }
// }


// #################################################
// left shift(<<) basically doubles origginal no
// N<<k  => N*2^k : k is shifting positions like 1,2,... and N is number which we want to shift

// right shift(>>) basically half of origginal no
// N>>k => {N/(2^k)}

// public class Java05bitManipulation {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();

//         System.out.println(n<<k);
//         System.out.println(n>>k);

//     }
// }



import java.util.Scanner;

public class Java05bitManipulation {

    public static int toggleOddBits(int n) {
        // Ensure n is positive
        n = Math.abs(n);

        // Convert n to binary string
        String binaryString = Integer.toBinaryString(n);

        // Convert binary string to character array
        char[] binaryArray = binaryString.toCharArray();

        // Traverse the array and toggle odd-positioned bits
        for (int i = 0; i < binaryArray.length; i++) {
            if ((i & 1) != 0) { // Check if the position is odd using bitwise AND
                binaryArray[i] = (char) (binaryArray[i] ^ 1); // Toggle bit using XOR
            }
        }

        // Convert the modified binary array back to a string
        String toggledBinaryString = new String(binaryArray);

        // Convert the binary string back to a decimal number
        int toggledNumber = Integer.parseInt(toggledBinaryString, 2);

        // Return the bitwise AND of the original number and the toggled number
        return n & toggledNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        int result = toggleOddBits(n);
        System.out.println("Result after toggling odd-positioned bits and performing bitwise AND: " + result);
    }
}


