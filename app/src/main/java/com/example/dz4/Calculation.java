package com.example.dz4;

public class Calculation {
    public static boolean check(String ticket){
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < ticket.length(); i++) {
            int parsedChar = Integer.parseInt(String.valueOf(ticket.charAt(i)));
            if (i % 2 == 0) sumOdd += parsedChar;
            else sumEven += parsedChar;
        }
        return sumOdd == sumEven;
    }

    public static int nextHappyTicket(String ticket){
        int happyTicket = 100001;
        for (int i = Integer.parseInt(String.valueOf(ticket)); i <= 999999; i++) {
            if (check(String.valueOf(i))) {
                happyTicket = i;
                break;
            }
        }
        return happyTicket;
    }
}
