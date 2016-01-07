package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _01SortArrayOfNumbers  {

    public static void main(String[] args) {

        System.out.println("Write a number n and n integer numbers on a different line seperated by space");
        Scanner Console = new Scanner(System.in);
        int n = Integer.parseInt(Console.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(Console.next());
            numbers[i] = number;
        }
        Arrays.sort(numbers);
        for ( int i = 0 ; i < numbers.length ; i++ ) {
            System.out.print(numbers[i] + " ");
        }
    }
}
