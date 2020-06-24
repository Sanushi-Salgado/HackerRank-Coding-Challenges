package com.sanushi.coding_challenges;

import java.util.Scanner;

public class JavaOutputFormatting {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.close();

        if(n % 2 == 1)
            System.out.println("Weird");
        else {
            if( n >= 2 && n <= 5 )
                System.out.println("Not Weird");
            else if( n >= 6 && n <= 20 )
                System.out.println("Weird");
            else if ( n > 20 )
                System.out.println("Not Weird");
        }

    }

}
