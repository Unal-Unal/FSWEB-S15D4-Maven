package org.example;


import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


    }


    public static boolean checkForPalindrome(String text){
        if (text == null) return false; // null input için

        // Sadece harf ve rakamları al, küçük harfe çevir
        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanedStr.isEmpty()) return false; // boş veya sadece özel karakterler için false

        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }




    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        int n = number;

        // Decimal sayıyı 2 ile bölerek kalanları stack'e ekle
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }

        // Stack'ten çıkararak binary string oluştur
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}

