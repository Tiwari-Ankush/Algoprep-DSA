// math.floor(num) >> it returns just smaller or equal integer.
// math.ceil(num)  >> it returns just grater or equal integer.


// calculating square root of that number and counting the factors of number and checking the given number is prime or not and calculating sum of all numbers till that number num....

// "static void main" must be defined in a public class.
import java.util.*;

public class Java02problemsolving {

    public static int sqrt(int num){
        int answer =1;
        int i=1;
        while(i*i<=num){
            answer = i;
            i++;
        }
        return answer;
    }


    public static int countFactors(int num){
        int squareRootofNum= sqrt(num);
        int count=0;
        for(int i=1;i<=squareRootofNum;i++){

            if(num%i==0){
                if(i==(num/i)){
                    count+=1;
                }
                else{
                    count=count+2;
                }

                System.out.println(i+" | "+(num/i));
            }
        }
        return count;

    }

    public static void isPrime(int num,int factCount){
        if(factCount==2){
            System.out.println("hence: "+num+" is Prime number.");
        }else{
            System.out.println("hence: "+num+" is not Prime number.");
        }
    }


    public static int allSum(int num){
        int sum = ((num*(num+1))/2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("The Square root of "+n+" is about to: "+Math.floor(sqrt(n)));

        System.out.println("Factors of "+n+" are:");
        int fact = countFactors(n);
        System.out.println("Total factors count of "+n+" are "+fact);

        isPrime(n,fact);

        System.out.println("Sum of all natural numbers till "+n+" is: "+allSum(n));

//   Dont read below code its just without functions:
//         int count=0;
//         for(int i=1;i*i<=n;i++){

//             if(n%i==0){
//                 if(i==(n/i)){
//                     count+=1;
//                 }
//                 else{
//                     count=count+2;
//             }

//             System.out.println(i+" , "+(n/i));
//         }}
//         System.out.println("Total factors count of "+n+" are "+count);
    }
}




