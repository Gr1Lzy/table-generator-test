package com.github;

import java.util.List;


public class Table {
    private static final int PADDING = 5;

    public String generate(List<String> strings, int columnCount) {
        if (columnCount <= 0) {
            throw new IllegalArgumentException("Column count must be greater than zero.");
        }
        if (strings == null || strings.isEmpty()) {
            throw new IllegalArgumentException("Strings list cannot be null or empty.");
        }

        String columnFormat = String.format("%%-%ds", calculateColumnWidth(strings));

        StringBuilder tableBuilder = new StringBuilder();

        for (int i = 0; i < strings.size(); i++) {
            tableBuilder.append(String.format(columnFormat, strings.get(i)));

            if ((i + 1) % columnCount == 0 || i == strings.size() - 1) {
                tableBuilder.append(System.lineSeparator());
            }
        }
        return tableBuilder.toString();
    }


    private int calculateColumnWidth(List<String> strings) {
        return strings.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0) + PADDING;
    }
}
