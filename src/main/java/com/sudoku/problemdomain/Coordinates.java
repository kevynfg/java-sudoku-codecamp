package com.sudoku.problemdomain;

import java.util.Objects;

public class Coordinates {
    private final int row;
    private final int column;

    public Coordinates(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Coordinates) {
            Coordinates other = (Coordinates) obj;
            return row == other.row && column == other.column;
        }
        return false;
    }

    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj) return true;
    // if (obj == null || getClass() != obj.getClass()) return false;
    // Coordinates that = (Coordinates) obj;
    // return row == that.row &&
    // column == that.column;
    // }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }
}
