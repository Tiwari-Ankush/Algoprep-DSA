
// "static void main" must be defined in a public class.


// ###########################################
// hashmap intro
// A HashMap in Java is used to store key-value pairs for efficient data retrieval.
// It allows constant-time complexity, O(1), for basic operations like add, remove, and check if a key exists.

// Where to use:

// When you need fast lookups and don't require ordering.
// For implementing caches, associative arrays, or when the data needs to be accessed by unique keys.
// In scenarios where quick insertion and retrieval of elements are crucial, such as in databases or in-memory data storage solutions.

// HASHMAP CONTAINS KEY VALUE PAIR
// SOME FACTS >>
// 0 . ordering in hashmap is predictable random order
//     1. keys can be only of the following types >>
//         int >> Integer
//         long >> Long
//         boolean >> Boolean
//         char >> Character
//         double >> Double
//         String >> String
//         Not allowed >> arrays, objects, null

// 2. Values can be of any type.
// 3. keys are unique in HashMap
// 4. if we are entering the element in same index then it will replace the previous entered element at that key or index
// 5. if the key is not present in the hashmap then after returning .get() operation
// it will return null.

// 6. A HashSet is not indexed, so you can't access its elements using an index.
// Instead, you should iterate over the HashSet using a loop.



// Syntax >>
//     Hashmap <Integer , Integer> hm = new Hashmap<>();

// basic operations are >>
// hm.put(key,value);
// hm.get(key); >>it access the value of that paarticular provided key
// hm.containsKey(key);>> it checks key is present or not >> it just returns true or false
// hm.size(); >> checking the size of hashmap >> TC O(1)
// hm.remove(key); >> it will remove the key along with its value

// public class Java07hashmap {

//     // taking array as user input and then placing the each and every element array in the hashmap from array
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         //taking array input
//         for(int i=0;i<n;i++){
//         arr[i]= sc.nextInt();
//     }
//         //printing the array
//         for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }
//         System.out.println();


//         // HashMap <Integer, Integer> hm = new HashMap<>();

// //         for(int i=0;i<n;i++){
// //             hm.put(arr[i],i);
// //         }

// //         //iterating through a hashmap and printing
// //         for(int key : hm.keySet()){
// //         System.out.print(key+" ");
// //         }
// //         hashmap(arr, n);


// //     }


// //     public static void hashmap(int arr[], int n){
// //         HashMap <Integer, Integer> hm = new HashMap<>();
// //         for(int i=0; i<n;i++){
// //             if(hm.containsKey(arr[i])==true){
// //                 int temp = hm.get(arr[i]);
// //                 hm.put(arr[i],temp+1);
// //             }else{
// //                 hm.put(arr[i],1);
// //             }
// //         }
// //         for(int key : hm.keySet()){
// //         System.out.print(key+" ");
// //         }

// //     }
// // }



// // frequency of eacch query
// public class Java07hashmap {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int q_size = sc.nextInt();
//         int[] arr = new int[n];
//         int[] q_arr = new int[q_size];

//         //taking array input
//         for(int i=0;i<n;i++){
//         arr[i]= sc.nextInt();
//     }

//         //taking q_arr as array input
//         for(int i=0;i<q_size;i++){
//         q_arr[i]= sc.nextInt();
//     }
//         //printing the array
//         for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }
//         System.out.println();

//         hashmap(arr, q_arr);


//     }


//     public static void hashmap(int arr[], int q_arr[]){
//         HashMap <Integer, Integer> hm = new HashMap<>();
//         for(int i=0; i<arr.length;i++){
//             // Count occurrences of each element in arr
//             if(hm.containsKey(arr[i])==true){
//                 int temp = hm.get(arr[i]);
//                 hm.put(arr[i],temp+1);
//             }else{
//                 hm.put(arr[i],1);
//             }
//         }

//                         System.out.println("Occurence of keys are: ");

//         for(int i=0;i<q_arr.length;i++){
//             if(hm.containsKey(q_arr[i]) ==true){
//                 System.out.println(q_arr[i]+" =  "+hm.get(q_arr[i]));
//             }
//             else{
//                 System.out.println("0");
//             }
//         }

//         // run this full code you will get the clue for q_arr
//         for(int key : hm.keySet()){
//         System.out.print(key+" ");
//         }

//     }
// }


// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
// hashset
// it is nothing but only key part of the hashmap

// Syntax >>
//     HashSet<Integer> hs = new HashSet <>();
// few operations >>
//     hs.add();
//     hs.remove();
//     hs.contains();
//     hs.size();


// ######################################################
import java.util.*;
// frequency of eacch query using hashset.
// public class Java07hashmap {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];


//         //taking array input
//         for(int i=0;i<n;i++){
//         arr[i]= sc.nextInt();
//     }

//         //adding the array elements into hashSet
//         HashSet<Integer> hs = new HashSet <>();

//         for(int i=0;i<n;i++){
//             hs.add(arr[i]);
//     }
//         //printing the array
//         for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }
//         System.out.println();

//         // printing the hashset
//         // System.out.print(hs);
//         // for (Integer element : hs) {
//         //     System.out.println(element+" ");
//         // }
//         hashmap(arr, hs);


//     }


//     public static void hashmap(int[]  arr,HashSet<Integer> hs){
//         HashMap <Integer, Integer> hm = new HashMap<>();
//         for(int i=0; i<arr.length;i++){
//             // Count occurrences of each element in arr
//             if(hm.containsKey(arr[i])==true){
//                 int temp = hm.get(arr[i]);
//                 hm.put(arr[i],temp+1);
//             }else{
//                 hm.put(arr[i],1);
//             }
//         }

//                         System.out.println("Occurence of keys are: ");
//         // Iterate over the HashSet to print the frequency using for each loop:
//         // for (int key : hs) {
//         //     System.out.println(key + " = " + hm.get(key));
//         // }

//         // using traditional for loop, for that we need to convert hashset into arraylist:
//         ArrayList<Integer> list = new ArrayList<>(hs);
//         for(int i=0;i<list.size();i++){
//             if(hm.containsKey(list.get(i)) ==true){
//                 int key = list.get(i);
//                 System.out.println(key+" = "+hm.get(key));
//             }
//             else{
//                 System.out.println("0");
//             }
//         }

// // //print all keys int the hashmap as keyset
// //         for(int key : hm.keySet()){
// //         System.out.print(key+" ");
// //         }

//     }
// }
// #####################################################
// task:: >>
// take this occurence and add it into new hashmap with key as a element in the hashset and value as a occurence value
// #####################################################



// finding first non repeating elements

// public class Java07hashmap {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];


//         //taking array input
//         for(int i=0;i<n;i++){
//         arr[i]= sc.nextInt();
//     }

//         //adding the array elements into hashSet
//         HashSet<Integer> hs = new HashSet <>();

//         for(int i=0;i<n;i++){
//             hs.add(arr[i]);
//     }
//         //printing the array
//         for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }
//         System.out.println();

//         // printing the hashset
//         // System.out.print(hs);
//         // for (Integer element : hs) {
//         //     System.out.println(element+" ");
//         // }

//         int nonRepeatingElement = nonRepeating(arr);
//         if (nonRepeatingElement != -1) {
//             System.out.println("First non-repeating element: " + nonRepeatingElement);
//         } else {
//             System.out.println("No non-repeating element found.");
//         }


//     }


//     public static int nonRepeating(int[] arr){
//         HashMap <Integer, Integer> hm = new HashMap<>();
//         for(int i=0; i<arr.length;i++){
//             // Count occurrences of each element in arr
//             if(hm.containsKey(arr[i])==true){
//                 int temp = hm.get(arr[i]);
//                 hm.put(arr[i],temp+1);
//             }else{
//                 hm.put(arr[i],1);
//             }
//         }

//         // chcking non repeating
//            for(int i=0; i<arr.length;i++){
//                if(hm.get(arr[i])==1){
//                    return arr[i];
//                }
//            }
//         return -1;

//     }
// }



// ###################################################
// number of distict elements

// public class Java07hashmap {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];


//         //taking array input
//         for(int i=0;i<n;i++){
//         arr[i]= sc.nextInt();
//     }

//         //adding the array elements into hashSet
//         HashSet<Integer> hs = new HashSet <>();

//         for(int i=0;i<n;i++){
//             hs.add(arr[i]);
//     }
//         //printing the array
//         for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }
//         System.out.println();

//         // printing the hashset
//         // System.out.print(hs);
//         // for (Integer element : hs) {
//         //     System.out.println(element+" ");
//         // }

//             System.out.println("Distinct elements are: "+distinct(hs));

//         }

//     public static int distinct(HashSet<Integer> hs){
//         return (hs.size());
//     }


//     }




// ###############################################
// PAIR SUM == K  having TC o(n) ==> using hashset
// it will fail in case of like,, k =-4 and array is
// [8 9 1 -2 4 5 11 -6 -2 -2]

// we can easily do this using NESTED LOOP but got the TC O(N^2).  so O(N) is better than O(N^2)

// if we are using hashset in our code then there is no chances of condition like a==b;

// public class Java07hashmap {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k =sc.nextInt();
//         int[] arr = new int[n];


//         //taking array input
//         for(int i=0;i<n;i++){
//         arr[i]= sc.nextInt();
//     }

//         //adding the array elements into hashSet
//         HashSet<Integer> hs = new HashSet <>();

//         for(int i=0;i<n;i++){
//             hs.add(arr[i]);
//     }
//         //printing the array
//         for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }
//         System.out.println();

//         // printing the hashset
//         // System.out.print(hs);
//         // for (Integer element : hs) {
//         //     System.out.println(element+" ");
//         // }

//             // System.out.println("Distinct elements are: "+distinct(hs));

//         pairSum(hs,k);
//         }

//     public static void pairSum(HashSet<Integer> hs, int k){
//         HashMap <Integer,Integer> hm =new HashMap<>();
//         int[] arr2 = new int[hs.size()];
//         int index =0;
//         for (Integer element : hs) {
//             arr2[index] = element;
//             index++;
//         }

//         for(int i=0; i<arr2.length;i++){
//             if(hm.containsKey(arr2[i])==true){
//                 int temp = hm.get(arr2[i]);
//                 hm.put(arr2[i],temp+1);
//             }else{
//                 hm.put(arr2[i],1);
//             }
//         }

//         boolean pairfound = false;
//     // now for checking a+b==k
//         for(int i=0; i<arr2.length;i++){
//             int a = arr2[i];
//             int b = (k-a);

//             if(a!=b & hm.containsKey(b)==true){
//                 System.out.println("Pair found: "+ a + ", "+b);
//                 pairfound =true;
//                 //duplicate pairs are returning like
//                 // Pair found: 1, 8
//                 // Pair found: 8, 1
//                 // to avoid this >>
//                 hm.remove(a);
//                 hm.remove(b);
//             }


//         }
//         if (! pairfound) {
//         System.out.println("Pair not found");
//     }

//     }


//     }


// ....(only hashmap)
// PAIR SUM ==K WITHOUT hashset because
// PAIR SUM == K  having TC o(n) ==> using hashset
// it will fail in case of like,, k =-4 and array is
// [8 9 1 -2 4 5 11 -6 -2 -2]


public class Java07hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int[] arr = new int[n];


        //taking array input
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }


        //printing the array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        pairSum(arr,k);
    }

    public static void pairSum(int[] arr, int k){
        HashMap <Integer,Integer> hm =new HashMap<>();

        for(int i=0; i<arr.length;i++){
            if(hm.containsKey(arr[i])==true){
                int temp = hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }else{
                hm.put(arr[i],1);
            }
        }

        boolean pairfound = false;
        // now for checking a+b==k
        for(int i=0; i<arr.length;i++){
            int a = arr[i];
            int b = (k-a);

            if(a!=b && hm.containsKey(b)==true){
                System.out.println("Pair found: "+ a + ", "+b);
                pairfound =true;
                //duplicate pairs are returning like
                // Pair found: 1, 8
                // Pair found: 8, 1
                // to avoid this >>
                hm.remove(a);
                hm.remove(b);
            }
            else if(a==b && hm.containsKey(b)==true && hm.get(b)>1){
                System.out.println("Pair found: "+ a + ", "+b);
                pairfound =true;
                hm.remove(a);
                hm.remove(b);
            }


        }
        if (! pairfound) {
            System.out.println("Pair not found");
        }

    }


}


// TASK: >>
// return the indices of the pair that adds up to k

// approach >>
// we can modify the code to store the original indices of the elements in a separate HashMap or HashMap<Integer, List<Integer>> (if elements can repeat).
// Then, when you find a valid pair, you can use this map to retrieve and print the indices.


// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
// template code
// public class Java07hashmap {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }