package com.company;
import java.util.Scanner;
public class Main {
    private static int bigChar(int checkChr) {
        if (checkChr > 90)
            return checkChr - 25;
        else if (checkChr < 65)
            return checkChr + 25;
        return checkChr;
    }
    private static int littleChar(int checkChr) {
        if (checkChr > 122)
            return checkChr - 25;
        else if (checkChr < 97)
            return checkChr + 25;
        return checkChr;
    }
    private static String codCaesar(char [] codidStr, int offset) {
        for (int i = 0; i < codidStr.length; i++) {
            if (codidStr[i] >= 'A' && codidStr[i] <= 'Z') {
                codidStr[i] = (char)bigChar(codidStr[i] + offset);
            }
            else if (codidStr[i] >= 'a' && codidStr[i] <= 'z') {
                codidStr[i] = (char)littleChar(codidStr[i] + offset);
            }
        }
        return new String(codidStr);
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите текст для кодирования");
        char[] charForCoding = reader.nextLine().toCharArray();
        System.out.println("Введите ключ кодирования/декодирования 1-25");
        System.out.println("Для декодирования введите отрецательное значения ключа");
        int k = reader.nextInt();
        System.out.println(codCaesar(charForCoding,k));
    }
}
