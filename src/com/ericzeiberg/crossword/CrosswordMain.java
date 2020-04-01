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
                    if (i == 0){
                        cells[e.getX() + i][e.getY()] = new Cell(e.getX() + i, e.getY(), null, e, Character.toString(answerChar), true);
                    }
                    else {
                        cells[e.getX() + i][e.getY()] = new Cell(e.getX() + i, e.getY(), null, e, Character.toString(answerChar), false);
                    }
                }
            }
        }
        // Down processing
        for (Entry e : down.getEntries()){
            for (int i = 0; i < e.getLength(); i++) {
                char answerChar = e.getAnswer().toCharArray()[i];
                boolean isFirstLetter = i == 0;
                if (cells[e.getX()][e.getY() + i] != null) {
                    cells[e.getX()][e.getY() + i].setDown(e);
                    cells[e.getX()][e.getY() + i].setFirstLetter(isFirstLetter);
                }
                else {
                        cells[e.getX()][e.getY()  + i] = new Cell(e.getX(), e.getY() + i, e, null, Character.toString(answerChar), isFirstLetter);
                }
            }

        }

        initGUI(across, down, new Crossword(cells));
    }

    private void initGUI(ClueList across, ClueList down, Crossword cells) {
        MainFrame frameObject = new MainFrame(across, down, cells);

    }


}
