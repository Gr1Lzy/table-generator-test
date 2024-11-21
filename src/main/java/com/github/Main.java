package com.github;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
                "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
                "EIGHTEEN", "NINETEEN");
        Table table = new Table();

        System.out.println("\n--------------FOUR COLUMNS--------------\n");
        System.out.println(table.generate(strings, 4));
        System.out.println("--------------THREE COLUMNS--------------\n");
        System.out.println(table.generate(strings, 3));
        System.out.println("--------------TWO COLUMNS--------------\n");
        System.out.println(table.generate(strings, 2));
    }
}
