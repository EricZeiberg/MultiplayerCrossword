package com.ericzeiberg.crossword;

public class Crossword {

    private Cell[][] cells;

    public Crossword(Cell[][] cells) {
        this.cells = cells;
    }

    public Cell[][] getCells() {
        return cells;
    }
}
