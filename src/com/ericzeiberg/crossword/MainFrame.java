package com.ericzeiberg.crossword;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private ClueList acrossClues;
    private ClueList downClues;
    private CrosswordPanel crosswordPanel;
    private Crossword crossword;

    public MainFrame(ClueList acrossClues, ClueList downClues, Crossword crossword) throws HeadlessException {
        super("Crossword Puzzle");
        this.acrossClues = acrossClues;
        this.downClues = downClues;
        this.crossword = crossword;

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));


        JPanel crosswordArea = new JPanel();
        crosswordArea.setLayout(new BoxLayout(crosswordArea, BoxLayout.X_AXIS));
        JPanel gridPanel = new JPanel(new BorderLayout(10, 10));
        gridPanel.add(new JLabel("", SwingConstants.CENTER), BorderLayout.NORTH);
        crosswordPanel = new CrosswordPanel(crossword, this);
        gridPanel.add(crosswordPanel, BorderLayout.CENTER);
        crosswordArea.add(gridPanel);

        JPanel clueArea = new JPanel(new GridLayout(2, 1, 5, 5));
        clueArea.setPreferredSize(new Dimension(220, 200));

        JPanel acrossCluesPanel = new JPanel(new BorderLayout());
        acrossCluesPanel.add(new JLabel("Across Clues", SwingConstants.CENTER), BorderLayout.NORTH);
        acrossCluesPanel.add(new JScrollPane(acrossClues), BorderLayout.CENTER);

        JPanel downCluesPanel = new JPanel(new BorderLayout());
        downCluesPanel.add(new JLabel("Down Clues", SwingConstants.CENTER), BorderLayout.NORTH);
        downCluesPanel.add(new JScrollPane(downClues), BorderLayout.CENTER);

        clueArea.add(acrossCluesPanel);
        clueArea.add(downCluesPanel);

        crosswordArea.add(clueArea);
        mainPanel.add(crosswordArea);

        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600, 600));
        pack();
        setVisible(true);
    }

    public ClueList getAcrossClues() {
        return acrossClues;
    }

    public ClueList getDownClues() {
        return downClues;
    }
}
