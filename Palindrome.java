package com.example.demo;

public class Palindrome {

    public static void main(String[] args) {
        boolean ispalindrome1 = isCallerPalindrome(1,"kolil");
        System.out.print("ispalindrome1 :");
        System.out.println(ispalindrome1);
        boolean ispalindrome2 = isCallerPalindrome(2,"kodok");
        System.out.print("ispalindrome2 :");
        System.out.println(ispalindrome2);
        boolean ispalindrome3 = isCallerPalindrome(3,"plastik");
        System.out.print("ispalindrome3 :");
        System.out.println(ispalindrome3);
    }

    public static boolean isCallerPalindrome(int type, String str) {
        if (type == 1) {
            // versi 1
            return isPalindromeWithVarTempemporary(str);
        } else if (type == 2) {
            // versi 2
            return isPalindromeWithNoTemporaryVar(str);
        } else {
            // versi 3
            return isPalindromeRecursive(str, 0);
        }
    }

    private static boolean isPalindromeRecursive(String value, int i) {
        // VERSI 3
        // i = 0
        // value = kodok
        // value.length()/ 2 = 5:2 = 2
        // 0 < 2 == true
        // value.charAt(i) = k
        // value.charAt(value.length() - i - 1) = 5-0-1 = k

        // value = kodok
        // i = 1
        // 1 < 5/2 = true
        // value.charAt(i) != value.charAt(value.length() - i - 1)
        // o != o = false

        // value = kodok
        // i = 2
        // 2 < 2 = false
        // true

        if (i < value.length() / 2) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)) {
                return false;
            } else {
                return isPalindromeRecursive(value, i + 1);
            }
        } else {
            return true;
        }
    }

    public static boolean isPalindromeWithVarTempemporary(String value) {
        // VERSI 1
        // -------------------
        // k, o , d , o , k
        // l nya 5
        // last idx = 4
        // 4.3.2.1.0
        // value = koli l = length nya 5
        // value.length()-1 = 4
        String temp = "";

        for (int i = value.length() - 1; i >= 0; i--) {
            // System.out.println("value.length() : " + i);
            temp = temp + value.charAt(i);
            // System.out.println("value.charAt(i) : " + value.charAt(i));
            // System.out.println("temp : " + temp);
            // System.out.println("---------------------------");
        }
        // System.out.println(temp);
        // System.out.println(value.equals(temp));

        return temp.equals(value);
    }

    public static boolean isPalindromeWithNoTemporaryVar(String value){
        for (int i = 0; i < value.length() / 2; i++) {
            int indexAwal = i;
            int indexAkhir = value.length() - i - 1;
            // loop1 : 5 - 0 - 1 = 4  || k != k == false
            // loop2 : 5 - 1 - 1 = 3  || o != o == false
            // loop3 : 5 - 2 - 1 = 2  || no need cause value.length() / 2
            // loop4 : 5 - 3 - 1 = 1  || no need cause value.length() / 2
            // loop5 : 5 - 4 - 1 = 0  || no need cause value.length() / 2

            if (value.charAt(indexAwal) != value.charAt(indexAkhir)) {
                // System.out.println(value.charAt(indexAwal) +" $!= "+value.charAt(indexAkhir));
                return false;
            }
            // System.out.println(value.charAt(indexAwal) +" !!= "+value.charAt(indexAkhir));
        }

        return true;
    }
}
