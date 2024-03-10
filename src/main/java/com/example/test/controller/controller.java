package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Scanner;


@Controller
public class controller {
    

    @GetMapping("/home")
    public String home(){
        System.out.println("firstttt");
        return "hello";
    }

    // Palindrome

        // public static void main(String[] args) {
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("Enter a string to check if it's a palindrome:");
        //     String input = scanner.nextLine();
            
        //     if (isPalindrome(input)) {
        //         System.out.println("The string is a palindrome.");
        //     } else {
        //         System.out.println("The string is not a palindrome.");
        //     }
            
        //     scanner.close();
        // }
        
        // public static boolean isPalindrome(String str) {
        //     int length = str.length();
        //     for (int i = 0; i < length / 2; i++) {
        //         if (str.charAt(i) != str.charAt(length - i - 1)) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }


        // Largest Element in array 

        // public static void main(String[] args) {
        //     int[] array = {10, 7, 23, 15, 9, 52, 31};
    
        //     int max = array[0]; // Assume the first element as the maximum
    
        //     for (int i = 1; i < array.length; i++) {
        //         if (array[i] > max) {
        //             max = array[i]; // Update max if current element is greater
        //         }
        //     }
    
        //     System.out.println("Largest element in the array: " + max);
        // }


        // prime number or not

            // public static void main(String[] args) {
            //     int num = 15;
                
            //     if(isPrime(num)){
            //         System.out.println(num + " is prime.");
            //     } else {
            //         System.out.println(num + " is not prime.");
            //     }
            // }
        
            // public static boolean isPrime(int num) {
            //     if (num <= 1) {
            //         return false; // Numbers less than or equal to 1 are not prime
            //     }
                
            //     for (int i = 2; i <= Math.sqrt(num); i++) {
            //         if (num % i == 0) {
            //             return false; // If num is divisible by any integer, it's not prime
            //         }
            //     }
            //     return true; // If num is not divisible by any integer, it's prime
            // }
        

            // factorial

            // public static void main(String[] args) {
            //     int n = 3; // Change this to any non-negative integer you want to find the factorial of
            //     long factorial = calculateFactorial(n);
            //     System.out.println("Factorial of " + n + " is: " + factorial);
            // }
        
            //     public static long calculateFactorial(int n) {
            //         if (n < 0) {
            //             throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            //         }
                
            //         long factorial = 1;
            //         for (int i = 1; i <= n; i++) {
            //             factorial *= i;
            //         }
            //         return factorial;
            //     }


            // Fibonacci Series

                // public static void main(String[] args) {
                //     int n = 15; // Number of terms in the Fibonacci series
                //     printFibonacci(n);
                // }
            
                // public static void printFibonacci(int n) {
                //     int firstTerm = 0, secondTerm = 1;
                //     System.out.println("Fibonacci Series up to " + n + " terms:");
            
                //     for (int i = 0; i < n; i++) {
                //         System.out.print(firstTerm + " ");
                //         int nextTerm = firstTerm + secondTerm;
                //         firstTerm = secondTerm;
                //         secondTerm = nextTerm;
                //     }
                // }
            
                   
                // Armstrong Number  
                    // public static void main(String[] args) {
                    //     int lowerLimit = 100; // Lower limit of the range
                    //     int upperLimit = 10000; // Upper limit of the range
                
                    //     System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + ":");
                    //     for (int i = lowerLimit; i <= upperLimit; i++) {
                    //         if (isArmstrong(i)) {
                    //             System.out.println(i);
                    //         }
                    //     }
                    // }
                
                    // public static boolean isArmstrong(int number) {
                    //     int originalNumber = number;
                    //     int numDigits = String.valueOf(number).length();
                    //     int sum = 0;
                
                    //     while (number > 0) {
                    //         int digit = number % 10;
                    //         sum += Math.pow(digit, numDigits);
                    //         number /= 10;
                    //     }
                
                    //     return originalNumber == sum;
                    // }
                

                    // Dublicate element in array 
                        public static void main(String[] args) {
                            int[] arr = {1, 2, 3, 4, 1, 2, 5}; // Example array with duplicate elements
                    
                            System.out.println("Duplicate elements in the array:");
                            findDuplicates(arr);
                        }
                    
                        public static void findDuplicates(int[] arr) {
                            for (int i = 0; i < arr.length - 1; i++) {
                                for (int j = i + 1; j < arr.length; j++) {
                                    if (arr[i] == arr[j]) {
                                        System.out.println(arr[i]);
                                        break; // To print each duplicate only once
                                    }
                                }
                            }
                        }
                    

                    }
