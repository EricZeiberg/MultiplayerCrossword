package com.ericzeiberg.crossword;

public class Cell {

    private int x, y;
    private Entry down, across;
    private String c; // Current char
    private String a; // Correct chart
    private boolean isFirstLetter;

    public Cell(int x, int y, Entry down, Entry across, String answerChar, boolean isFirstLetter) {
        this.x = x;
        this.y = y;
        this.down = down;
        this.across = across;
        this.c = "";
        this.a = answerChar;
        this.isFirstLetter = isFirstLetter;
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

    public void setDown(Entry down) {
        this.down = down;
    }

    public void setAcross(Entry across) {
        this.across = across;
    }

    public boolean isFirstLetter() {
        return isFirstLetter;
    }

    public void setFirstLetter(boolean firstLetter) {
        isFirstLetter = firstLetter;
    }

    public int getClueNumber(){
        if (across != null){
            return across.getId();
        }
        else {
            return down.getId();
        }
    }
}
