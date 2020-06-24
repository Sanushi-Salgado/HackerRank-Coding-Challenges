package com.sanushi.coding_challenges;

import java.util.*;

/*Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr

*/
public class ReverseWords {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int numberOfTestCases = 0;
        do{
            numberOfTestCases = input.nextInt();
        }while(!(numberOfTestCases >=1 && numberOfTestCases <= 100));


        // Create an array to store the input strings
        String[] array = new String[numberOfTestCases];

        int count =  0;
        while (count < numberOfTestCases){

            String str = input.next();
            int s = str.length();

            while(!(s >=1 && s <= 2000)){
                str = input.next();
            }

            array[count] = str;
            count++;
        }

        for(int i=0; i<array.length; i++){

            // Need to escape the dot
            String[] arr = (array[i]).split("\\.");

            for(int j=arr.length-1; j>=0; j--){
                if(j != 0)
                    System.out.print(arr[j] + ".");
                else
                    System.out.print(arr[j]);
            }
            System.out.println();
        }

    }
}
