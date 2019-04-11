package CommandPattern;

public class PushCommand extends Command {


    PushCommand(Editor Editor) {
        super(Editor);
    }




    @Override
    public boolean execute() {
        PushDialog dialog = new PushDialog(getEditor()); //ask the user what to push
        dialog.setVisible(true);
        if (!getEditor().getPushstring().equals("")) // after the dialog is closed,
            this.getEditor().getStack().push(getEditor().getPushstring());  // pushstring contains the user input
        getEditor().JList1.setListData(this.getEditor().getStack().getStackVector());  // refresh the JList
        getEditor().repaint();
        return true;

    }
}
