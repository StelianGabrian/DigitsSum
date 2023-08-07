package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here to calculate the sum of the three digits of a number

        String number = scanner.nextLine();
        int digit1 = Integer.parseInt(number.substring(0,1));
        int digit2 = Integer.parseInt(number.substring(1,2));
        int digit3 = Integer.parseInt(number.substring(2,3));
        System.out.println(digit1+digit2+digit3);

    }
}