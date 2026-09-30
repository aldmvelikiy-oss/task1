package org.example;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int zagadnum = random.nextInt(101);

        int popitki = 0;
        int maxPopitki = 10;
        boolean ygadnum = false;

        System.out.println("Число от 1 до 100 загадано. Всего есть 10 попыток");

        while (popitki < maxPopitki) {
            System.out.print("Напишите предполагаемое число: ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Число не может быть меньше 1 и больше 100");
                continue;
            }

            popitki++;

            if (guess > zagadnum) {
                System.out.println("Загаданное число меньше");
                System.out.println("Сделано " + popitki + " попыток ");
            } else if (guess < zagadnum) {
                System.out.println("Загаданное число больше");
                System.out.println("Сделано " + popitki + " попыток ");
            } else {
                System.out.println("Поздравляю, вы угадали число за " + popitki + " попыток");
                ygadnum = true;
                return;
            }
        }

        if (popitki == maxPopitki) {
            System.out.println("Вы не угадали число за 10 попыток");
            System.out.println("Загаданное число было: " + zagadnum);
        }
    }
}
