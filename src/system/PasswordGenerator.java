package system;

import java.util.Random;

public class PasswordGenerator {
    char[] generatePassword(int len) {
        String passSymbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        char[] password = new char[len];
        for (int i = 0; i < len; i++)
        {
            password[i] = passSymbols.charAt(random.nextInt(passSymbols.length()));
        }
        return password;
    }
}
