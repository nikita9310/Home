package com.company;

import java.util.Scanner;

public class Deliteli {
    public static int countDelitel(int number){
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int count = countDelitel(number);
        System.out.println(count);




    }
}
