package com.sanushi.coding_challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Given two strings a and b consisting of lowercase characters.
The task is to check whether two given strings are anagram of each other or not.
An anagram of a string is another string that contains same characters,
only the order of characters can be different. For example, “act” and “tac” are anagram of each other.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case consist of two strings in 'lowercase' only, in a single line.

Output:
Print "YES" without quotes if the two strings are anagram else print "NO".

Constraints:
1 ≤ T ≤ 300
1 ≤ |s| ≤ 1016

Example:
Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO

Explanation:
Testcase 1: Both the string have same characters with same frequency. So, both are anagrams.
Testcase 2: Characters in both the strings are not same, so they are not anagrams.
 */
public class Anagrams {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int numberOfTestCases = 0;
        ArrayList<String> answers = new ArrayList<>();

        // Validating number of test cases
        do{
            numberOfTestCases = input.nextInt();
        }while (!(numberOfTestCases >= 1 && numberOfTestCases <= 300));


        // Create a String array two store the inputs of each test case
        String[] array = new String[numberOfTestCases];

       int count = 0;
       while (count < numberOfTestCases){
           String a = input.next();
           String b = input.next();


           array[count] = a +  " " + b;
           count++;
       }



       for(int i=0; i<array.length;i++){
           String[] arr = array[i].split("\\s+"); // geeksforgeeks, forgeeksgeeks
           String word = arr[0];
           char[] characterArray1 = word.toCharArray(); // g, e, e, k, s, f, o, r, g, e, e, k, s
           char[] characterArray2 = arr[1].toCharArray(); // f, o, r, g, e,  e, k, s, g, e, e, k, s

           if(characterArray1.equals(characterArray2))
               System.out.println("YES");
           else
               System.out.println("NO");
       }

    }

//    @Override
//    public boolean equals(Object obj){
//        char[] c = (char[]) obj;
//        return (this.length == c.length && (Arrays.asList(first).containsAll(Arrays.asList(c))));
//    }
}
