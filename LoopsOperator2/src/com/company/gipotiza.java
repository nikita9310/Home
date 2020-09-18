package com.company;

import java.util.Scanner;

public class gipotiza {
    public static boolean checkGipotiza(int number){
        while(number != 1){
            if(number%2 == 0)
                number = number / 2;
            else
                number = (number*3+1)/2;
            System.out.println(number);
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scanner.nextInt();
        checkGipotiza(number);
    }
}
