package com.ericzeiberg.crossword;

import java.util.ArrayList;
import java.util.List;

public class CrosswordData {

    private  List<Entry> acrossEntries = new ArrayList<>();
    private List<Entry> downEntries = new ArrayList<>();

    public CrosswordData() {
        acrossEntries.add(new Entry(1, 1, 0, "Eager Involvement", "enthusiasm", EntryDirection.ACROSS));
        acrossEntries.add(new Entry(8, 0, 2, "Stream of water", "river", EntryDirection.ACROSS));
        acrossEntries.add(new Entry(9, 6, 2, "Take as one's own", "adopt", EntryDirection.ACROSS));
        acrossEntries.add(new Entry(10, 0, 4, "Ball game", "golf", EntryDirection.ACROSS));
        acrossEntries.add(new Entry(12, 5, 4, "Guard", "sentry", EntryDirection.ACROSS));
        acrossEntries.add(new Entry(14, 0, 6, "Language communication", "speech", EntryDirection.ACROSS));
        acrossEntries.add(new Entry(17, 7, 6, "Fruit", "plum", EntryDirection.ACROSS));
        acrossEntries.add(new Entry(21, 0, 8, "In addition", "extra", EntryDirection.ACROSS));
        acrossEntries.add(new Entry(22, 6, 8, "Boundary", "limit", EntryDirection.ACROSS));
        acrossEntries.add(new Entry(23, 0, 10, "Executives", "management", EntryDirection.ACROSS));

        downEntries.add(new Entry(2, 2, 0, "Pertaining to warships", "naval", EntryDirection.DOWN));
        downEntries.add(new Entry(3, 4, 0, "Solid", "hard", EntryDirection.DOWN));
        downEntries.add(new Entry(4, 6, 0, "Apportion", "share", EntryDirection.DOWN));
        downEntries.add(new Entry(5, 8, 0, "Concerning", "about", EntryDirection.DOWN));
        downEntries.add(new Entry(6, 10, 0, "Friendly", "matey", EntryDirection.DOWN));
        downEntries.add(new Entry(7, 0, 1, "Boast", "brag", EntryDirection.DOWN));
        downEntries.add(new Entry(11, 3, 4, "Enemy", "foe", EntryDirection.DOWN));
        downEntries.add(new Entry(13, 7, 4, "Doze", "nap", EntryDirection.DOWN));
        downEntries.add(new Entry(14, 0, 6, "Water vapour", "steam", EntryDirection.DOWN));
        downEntries.add(new Entry(15, 2, 6, "Consumed", "eaten", EntryDirection.DOWN));
        downEntries.add(new Entry(16, 4, 6, "Loud, resonant sound", "clang", EntryDirection.DOWN));
        downEntries.add(new Entry(18, 8, 6, "Yellowish, citrus fruit", "lemon", EntryDirection.DOWN));
        downEntries.add(new Entry(19, 10, 6, "Mongrel dog", "mutt", EntryDirection.DOWN));
        downEntries.add(new Entry(20, 6, 7, "Shut with force", "slam", EntryDirection.DOWN));
    }

    public  List<Entry> getAcrossEntries() {
        return acrossEntries;
    }

    public  List<Entry> getDownEntries() {
        return downEntries;
    }
}
