package system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте длину пароля:");
        int length = in.nextInt();
        System.out.print("Введите количество паролей:");
        int quantity = in.nextInt();
        for(int i = 1; i <= quantity; i++)
            System.out.println(passwordGenerator.generatePassword(length));
    }
}
