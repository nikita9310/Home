package com.company;

import java.util.Scanner;

public class TovarMain {
    public static double percentDiscount(int total){
        double result;
        if(total > 1000 && total < 2000)
            result = total - (total*0.05);
        else if(total >= 2000)
            result = total - (total*0.1);
        else
            result = total;
        return result;
    }

    static String getRubles(int num)
    {
        String result;
        int lastDigit = num % 10;

        if (num >= 5 && num <= 20)
            result = "рублей";
        else if (lastDigit == 1)
            result = "рубль";
        else if (lastDigit >= 2 && lastDigit <= 4)
            result = "рубля";
        else
            result = "рублей";
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во товаров: ");
        int count = scanner.nextInt();

        int total = 0;
        int max = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("Введите стоимость товара");
            int cost = scanner.nextInt();
            if (cost > max)
                max = cost;

            total = total + cost;
        }
        double totalWithDiscount = percentDiscount(total);
        System.out.println("Цена со скидкой = " + totalWithDiscount);

        System.out.println("Самый дорогой товар = " + max);
        System.out.println("Итого = " + total + " " + getRubles(total));
    }
}
