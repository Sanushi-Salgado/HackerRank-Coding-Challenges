package com.sanushi.coding_challenges;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int num1 = scan.nextInt();
        String b = scan.next();
        int num2 = scan.nextInt();
        String c = scan.next();
        int num3 = scan.nextInt();

        String d = "", e = "", f = "";
        System.out.println("================================");
        if(num1 < 100 )
            d = "0" + num1;
        else if (num1 >= 100)
            d = Integer.toString(num1);

        if(num2 < 100)
            e = "0" + num2;
        else if (num2 >= 100)
            e = Integer.toString(num2);

        if(num3 < 100)
            f = "0" + num3;
        else if (num3 >= 100)
            f = Integer.toString(num3);

        System.out.printf("%-15s %s\n", a, d);
        System.out.printf("%-15s %s\n", b, e);
        System.out.printf("%-15s %s\n", c, f);
        System.out.println("================================");

    }

}
