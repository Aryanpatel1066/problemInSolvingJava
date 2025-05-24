package JavaFromScratch;

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//problem 1) print the sum first n Natural number
//        System.out.println("enter the N numbers: ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for(int i = 1 ;i<=n;i++){
//             sum = sum + i;
//         }
//        System.out.println(sum);

//problem 2) print the table of n for n time (1 to n )

//        System.out.println("enter the N value for print table:");
//        int n = sc.nextInt();
//         for(int i = 1;i<=n;i++){
//             for(int j =1;j<=10;j++) {
//                 System.out.print(i+" x "+j+" = "+j * i+ ", ");
//             }
//             System.out.println();
//          }

//problem 3) print all even number till n
//        System.out.println("enter n value to print even: ");
//        int n = sc.nextInt();
//
//        for(int i = 1;i<=n;i++){
//            if(i%2 == 0){
//                System.out.println(i);
//            }
//        }
  //problem 4) print the num is prime or not
//        System.out.println("enter the number to check wheather this is prime or not: ");
//        int n = sc.nextInt();
//        boolean  itPrime =true;
//
//        for (int i = 2;i<=n;i++){
//            if (n <= 1){
//                itPrime = false;
//             }
//            else if(n%i==0){
//                itPrime = false;
//                break;
//             }
//        }
//        if(itPrime == true){
//            System.out.println("it is prime number");
//        }
//        else{
//            System.out.println("it is non prime number");
//        }

        //5. Count Digits in a Number
//        System.out.println("enter the number: ");
//        int n = sc.nextInt();
//        int count = 0;
//        while (n!=0){
//           int digit = n % 10;
//           n = n/10;
//           count ++;
//        }
//        System.out.println(count);

        //6. Reverse a Number
//        System.out.println("enter the number: ");
//        int n = sc.nextInt();
//        int digit =0 ;
//        while(n!=0){
//            digit = n % 10;
//            n=n/10;
//            System.out.print(digit);
//        }
         //7.  Check Armstrong Number (An Armstrong number is a number that is equal
        // to the sum of cubes of its digits. Write a program to check if a number is an
        // Armstrong number. 153)

//        System.out.println("Enter number to check Armstrong or not: ");
//        int n = sc.nextInt();
//        int original = n;
//
//        int count = 0;
//        int temp = n;
//
//        // Step 1: Count number of digits
//        while (temp != 0) {
//            count++;
//            temp /= 10;
//        }
//
//        int sum = 0;
//        temp = n;
//
//        // Step 2: Calculate sum of digits raised to the power of count
//        while (temp != 0) {
//            int digit = temp % 10;
//            sum += Math.pow(digit, count);
//            temp /= 10;
//        }
//
//        // Step 3: Compare
//        if (sum == original) {
//            System.out.println(original + " is an Armstrong number.");
//        } else {
//            System.out.println(original + " is not an Armstrong number.");
//        }

        //question 8 : fibonacci series

        System.out.println("enter the number to want print fibona series");
        int n = sc.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        System.out.println(a + " ");

        for(int i = 0;i<n;i++) {
                sum = a + b;
                a = b;
                b = sum;
                System.out.println(sum);

        }

    }
}
