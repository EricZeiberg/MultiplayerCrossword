package com.ericzeiberg.crossword;

public class Cell {

    private int x, y;
    private Entry down, across;
    private String c; // Current char
    private String a; // Correct chart

    public Cell(int x, int y, Entry down, Entry across, String answerChar) {
        this.x = x;
        this.y = y;
        this.down = down;
        this.across = across;
        this.c = "";
        this.a = answerChar;
    }

    protected boolean hasAcross() {
        return across != null;
    }

    protected boolean hasDown() {
        return down != null;
    }

    public Entry getDown() {
        return down;
    }

    public Entry getAcross() {
        return across;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getAnswer() {
        return a;
    }
}
