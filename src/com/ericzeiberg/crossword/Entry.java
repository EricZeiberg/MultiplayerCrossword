package com.ericzeiberg.crossword;

public class Entry {

    private int id, length, x, y;
    private String clue, answer;
    private EntryDirection direction;

    public Entry(int id,  int x, int y, String clue, String answer, EntryDirection direction) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.clue = clue;
        this.answer = answer;
        this.direction = direction;
        this.length = answer.length();
    }

    @Override
    public String toString() {
        return clue;
    }

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getClue() {
        return clue;
    }

    public String getAnswer() {
        return answer;
    }

    public EntryDirection getDirection() {
        return direction;
    }
}
