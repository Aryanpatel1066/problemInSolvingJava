package JavaFromScratch;

import java.util.Scanner;

public class day2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //qestion1: ****
        //          ****
        //          ****

//        System.out.println("enter row number: ");
//        int row = sc.nextInt();
//        System.out.println("enter column number: ");
//        int col = sc.nextInt();
//
//        for(int i = 1;i<=row;i++){
//            for(int j = 1;j<=col;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //question2: *
        //           **
        //           ***

//        System.out.println("enter row number: ");
//        int row = sc.nextInt();
//        for(int i = 1;i<=row;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //question3: ***
        //           **
       //            *

//        System.out.println("enter row number: ");
//        int row = sc.nextInt();
//        for(int i = 1;i<=row;i++){
//            for(int j=row;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //question 4 ***
        //           * *
        //           ***

//        System.out.println("enter row number: ");
//        int row = sc.nextInt();
//
//        for(int i = 1;i<=row;i++){
//            for(int j=1;j<=row;j++){
//                if(i==1 | j==1 | i==row | j==row){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //question:5 __*
        //           _**
        //           ***

        System.out.println("enter row number: ");
        int row = sc.nextInt();

        for(int i = 1;i<=row;i++){
            for(int j = row;j>=i;j--){
                System.out.print("_");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
             }
            System.out.println();
        }

    }
}
