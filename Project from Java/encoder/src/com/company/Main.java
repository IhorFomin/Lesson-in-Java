package com.company;
import java.util.Scanner;

public class Main {

    public static String changeDots(String text) {
        String[] alphab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] codes = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"};
        String result = text;
        for (int i = 0; i < alphab.length; i++) {
            result = result.replaceAll(alphab[i], codes[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(changeDots(text));
    }
}