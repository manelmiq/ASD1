package CommandPattern;

public class PopCommand extends Command{
    PopCommand(Editor Editor) {
        super(Editor);
    }

    @Override
    public boolean execute() {
        this.getEditor().getStack().pop();
        this.getEditor().JList1.setListData(this.getEditor().getStack().getStackVector()); // refresh the JList
        this.getEditor().repaint();
        return true;
    }
}
