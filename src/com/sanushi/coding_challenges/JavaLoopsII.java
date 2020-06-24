package com.sanushi.coding_challenges;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaLoopsII {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int queries = sc.nextInt();

        Map<String, Integer> query = new LinkedHashMap<>();

        for(int i=1; i<=queries; i++){
            query.put("query" + i + "-a", sc.nextInt());
            query.put("query" + i + "-b", sc.nextInt());
            query.put("query" + i + "-c", sc.nextInt());
        }

        for (Map.Entry<String, Integer> entry: query.entrySet()) {
            entry.getKey();
        }

    }

}
