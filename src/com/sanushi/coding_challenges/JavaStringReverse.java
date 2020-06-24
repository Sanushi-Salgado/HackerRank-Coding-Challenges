/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
        Given a string , print Yes if it is a palindrome, print No otherwise.

        Constraints

        will consist at most  lower case english letters.
        Sample Input
        madam

        Sample Output
        Yes
 */

package com.sanushi.coding_challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        ArrayList<Character> front = new ArrayList<>();
        ArrayList<Character> reverse = new ArrayList<>();

        for(int i=0; i<str.length(); i++)
            front.add( str.charAt(i) );

        for(int i=str.length()-1; i>=0; i--)
            reverse.add( str.charAt(i) );


        if( front.equals(reverse) )
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
