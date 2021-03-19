package com.section8.Arrays.lecture104challengeEx43;

import java.util.Arrays;

public class Main104 {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));
        reverse(myNumbers);
        System.out.println("myNumbers after reverse = " + Arrays.toString(myNumbers));

    }

    private static void reverse(int[] array) {

        for (int j = array.length; j > array.length / 2; j--) {
            int temp = array[array.length - j];
            array[array.length - j] = array[j - 1];
            array[j - 1] = temp;

        }

//        int maxIndex = array.length - 1;
//        int halfLength = array.length / 2;
//        for ( int i = 0 ; i < halfLength; i ++) {
//             int temp = array [i];
//            array [i] = array.[maxIndex - i];
//            array [maxIndex - i] = temp;
//        }

    }

}
//    -Write a method called reverse() with an int array as a parameter.
//
//            -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//            -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//            -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//            -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
//
//            Tip:
//            -Create a new console project with the name ЃeReverseArrayChallengeЃf