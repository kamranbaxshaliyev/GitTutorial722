package ders2;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        multiDimensional();
    }

    public static void multiDimensional() {
        int[][] arr1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}; //1
        int[][] arr = new int[2][5]; //2
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        System.out.println("Entering the array elements:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                Scanner oScan = new Scanner(System.in);
                System.out.print("Enter the [" + i + "][" + j + "] element: ");
                arr[i][j] = oScan.nextInt();
            }
        }

        System.out.println();

        System.out.println("Printing the elements of an array:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println("The [" + i + "][" + j + "] element: " + arr[i][j]);
            }
        }
    }

    public static void oneDimensional() {
        //int[] arr = {0, 0, 0, 0, 0}; //1
        int[] arr = new int[5]; //2

        System.out.println("Entering the array elements:");
        for(int i = 0; i < arr.length; i++) {
            Scanner oScan = new Scanner(System.in);
            System.out.print("Enter the " + i + " element: ");
            arr[i] = oScan.nextInt();
        }

        System.out.println();

        System.out.println("Printing the elements of an array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("The " + i + " element: " +arr[i]);
        }
    }
}