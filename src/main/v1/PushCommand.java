package main.v1;

public class PushCommand extends Command {

	public PushCommand(Editor editor) {
		super(editor);
	}

	@Override
	protected boolean execute() {
		setBackup(getEditor().getStack().getStackVector());
		getEditor().setPushstring("");
		PushDialog dialog = new PushDialog(getEditor()); // ask the user what to push
		dialog.setVisible(true);
		if (!getEditor().getPushstring().equals("")) // after the dialog is closed,
			getEditor().getStack().push(getEditor().getPushstring()); // pushstring contains the user input
		getEditor().JList1.setListData(getEditor().getStack().getStackVector()); // refresh the JList
		getEditor().repaint();
		return true;
	}

	@Override
	public void redo() 
	{
		setBackup(getEditor().getStack().getStackVector());
		String s = getEditor().getStack().getStackVector().firstElement();
		getEditor().getStack().push(s);	
		getEditor().JList1.setListData(getEditor().getStack().getStackVector());
		getEditor().repaint();

	}	

}
