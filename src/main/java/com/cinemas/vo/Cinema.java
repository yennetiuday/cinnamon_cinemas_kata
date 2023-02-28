package com.cinemas.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cinema {
    private static final List<String> ROWS = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    private List<String> row_seats_combo;
    private Integer number_of_rows, number_of_seats_per_row;

    public Cinema(int number_of_rows, int number_of_seats_per_row){
        setSeatNumbers(number_of_rows, number_of_seats_per_row);
    }

    private void setSeatNumbers(int number_of_rows, int number_of_seats_per_row) {
        row_seats_combo = new ArrayList<>();
        for (int row_number = 0; row_number < number_of_rows; row_number++) {
            for(int seat_number = 1; seat_number <= number_of_seats_per_row; seat_number++) {
                row_seats_combo.add(ROWS.get(row_number) + seat_number);
            }
        }
    }

    public List<String> getRow_seats_combo() {
        return row_seats_combo;
    }

    public int getNumber_of_rows() {
        return number_of_rows;
    }

    public int getNumber_of_seats_per_row() {
        return number_of_seats_per_row;
    }
}
