/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

        Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

        Input Format

        The first line contains a string denoting .
        The second line contains a string denoting .

        Constraints

        Strings  and  consist of English alphabetic characters.
        The comparison should NOT be case sensitive.
        Output Format

        Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

        Sample Input 0
        anagram
        margana

        Sample Output 0
        Anagrams

        Explanation 0
        Character	Frequency: anagram	Frequency: margana
        A or a	3	3
        G or g	1	1
        N or n	1	1
        M or m	1	1
        R or r	1	1
        The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

        Sample Input 1
        anagramm
        marganaa

        Sample Output 1
        Not Anagrams

        Explanation 1
        Character	Frequency: anagramm	Frequency: marganaa
        A or a	3	4
        G or g	1	1
        N or n	1	1
        M or m	2	1
        R or r	1	1
        The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

        Sample Input 2
        Hello
        hello

        Sample Output 2
        Anagrams

        Explanation 2
        Character	Frequency: Hello	Frequency: hello
        E or e	1	1
        H or h	1	1
        L or l	2	2
        O or o	1	1
        The two strings contain all the same letters in the same frequencies, so we print "Anagrams".*/

package com.sanushi.coding_challenges;

import java.util.*;

public class JavaAnagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        if( (Arrays.asList(arr1)).contains( Arrays.asList(arr2) ) )
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

    }


}
