package CommandPattern;

import java.util.LinkedList;

public class CommandHistory {

    private LinkedList<Command> history = new LinkedList<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
