package com.gmail.at.kotamadeo;

import com.gmail.at.kotamadeo.utils.Utils;

public class Main {
    public static void main(String[] args) {
        copyrightPrint();
    }

    private static void copyrightPrint() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append(Utils.ANSI_GREEN + "© " + Utils.ANSI_RESET);
        stringBuilder.append(Utils.ANSI_BLUE + "Eric \"Kotamadeo\" Temnitsky" + Utils.ANSI_RESET);
        System.out.println(stringBuilder);
    }
}
