package IteratorPattern;

import java.util.Vector;
import java.util.*;

public class ReverseIterator implements Iterator {


    Vector swimmerList;
    int pos;


    public ReverseIterator(Vector swimmerList) {
        this.swimmerList = swimmerList;
        pos = swimmerList.size()-1;
    }

    @Override
    public boolean hasNext() {
        return (pos >= 0);
    }

    @Override
    public Object next() {
        Swimmer swimmer = (Swimmer)swimmerList.elementAt(pos);
        pos--;
        return swimmer;
    }
}
