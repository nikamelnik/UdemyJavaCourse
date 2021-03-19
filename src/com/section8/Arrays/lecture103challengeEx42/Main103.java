package com.section8.Arrays.lecture103challengeEx42;

import java.util.Scanner;

public class Main103 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count : ");

        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = readIntegers(count);


        int minValue = findMin(returnedArray);
        System.out.println("Minimum value = " + minValue);

    }


    public static int[] readIntegers(int count) {
        int[] array = new int[count];

//        System.out.println("Enter " + count + " integer values:\r");
//
//        while (count > 0)
//            for (int i = 0; i < array.length; i++) {
//                boolean hasNextInt = scanner.hasNextInt();
//                if (hasNextInt) {
//                    array[i] = scanner.nextInt();
//                    count--;
//                } else {
//                    System.out.println("Invalid number");
//                  scanner.nextLine();
//                    hasNextInt = true;
//                }
//
//            }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
           int value = array[i];
            if (value < min) {
                min = value;
            }
        }

        //System.out.println("Minimum value = " + min);
        return min;
    }


}
