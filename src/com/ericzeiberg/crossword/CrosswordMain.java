package com.ericzeiberg.crossword;

public class CrosswordMain {

    private ClueList across;
    private ClueList down;

    public static void main(String[] args){
        CrosswordMain main = new CrosswordMain();
    }


    public CrosswordMain() {
        CrosswordData data = new CrosswordData();
         across = new ClueList(data.getAcrossEntries());
         down = new ClueList(data.getDownEntries());
        buildCrossword(data);
    }

    private void buildCrossword(CrosswordData data) {

        Cell[][] cells = new Cell[11][11]; //TODO Custom puzzle size

        // Across processing
        for (Entry e : across.getEntries()){
            if (cells[e.getX()][e.getY()] == null){
                for (int i = 0; i < e.getLength(); i++) {
                    char answerChar = e.getAnswer().toCharArray()[i];
                    cells[e.getX() + i][e.getY()] = new Cell(e.getX() + i, e.getY(), null, e, Character.toString(answerChar));
                }
            }
        }
        // Down processing
        for (Entry e : down.getEntries()){
            if (cells[e.getX()][e.getY()] == null){
                for (int i = 0; i < e.getLength(); i++) {
                    char answerChar = e.getAnswer().toCharArray()[i];
                    //cells[e.getX()][e.getY()  + i] = new Cell(e.getX(), e.getY() + i, null, e, Character.toString(answerChar));
                }
            }
        }

        initGUI(across, down, new Crossword(cells));
    }

    private void initGUI(ClueList across, ClueList down, Crossword cells) {
        MainFrame frameObject = new MainFrame(across, down, cells);

    }


}
