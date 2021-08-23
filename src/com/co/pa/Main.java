package com.co.pa;

import java.util.Scanner;

public class Main {

    public static final String FIT = "DA";
    public static final String NO_FIT = "NE";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountMatches = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int[] matches = new int[amountMatches];

        for(int i = 0; i < amountMatches; i++) {
            matches[i] = scanner.nextInt();
        }

        String result = fitMatches(matches, width, height);
        System.out.println(result);
    }

    private static String fitMatches(int[] matches, int width, int height) {
        StringBuilder result  = new StringBuilder();
        for(int i  = 0; i < matches.length; i++){
            double diagonal = Math.sqrt((width * width) + (height * height));
            String staticResult = matches[i] <= diagonal ? FIT : NO_FIT;
            result.append(staticResult).append("\n");
        }
        return result.toString();
    }
}
