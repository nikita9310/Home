package com.company;

import java.util.Scanner;

public class CalculatorMain {
    public static double calculate(double first, double second, int choose){
        double result = 0;
        if (choose == 1)
            result = first + second;
        else if (choose == 2)
            result = first - second;
        else if (choose == 3)
            result = first * second;
        else if (choose == 4)
            result = first / second;
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;

        do {
            System.out.println("1.Сумма");
            System.out.println("2.Разность");
            System.out.println("3.Произведение");
            System.out.println("4.Деление");
            System.out.println("0.Выход");

            choose = scanner.nextInt();
            if (choose != 0)
            {
                System.out.print("Первое число = ");
                double first = scanner.nextDouble();

                System.out.print("Второе число = ");
                double second = scanner.nextDouble();

                double result = calculate(first,second,choose);

                System.out.println("Result = " + result);
            }
        }
        while (choose != 0);
    }
}
