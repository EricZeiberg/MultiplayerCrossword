package com.ericzeiberg.crossword;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.List;

public class ClueList extends JList {

    private List<Entry> entries;

    public ClueList(List<Entry> entries) {
        this.entries = entries;
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setCellRenderer(new ClueRenderer());
        addListSelectionListener(new SelectionListener());

        setListData(entries.toArray());

    }

    public List<Entry> getEntries() {
        return entries;
    }

    public class ClueRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            // set background to green if solve support is on and clue is solved
            if (isSelected)
                setBorder(BorderFactory.createLineBorder(new Color(99, 130, 191)));

            return this;
        }

    }

    public class SelectionListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            JList source = (JList) e.getSource();
            if (!source.isSelectionEmpty()) {
                // highlight clue in grid when clicked on in JList
                int selected = source.getSelectedIndex();
            }
        }
    }
}
