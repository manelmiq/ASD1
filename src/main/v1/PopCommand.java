package main.v1;

public class PopCommand extends Command {

	public PopCommand(Editor editor) {
		super(editor);
	}

	@Override
	protected boolean execute() {
		if (getEditor().getStack().getStackVector().isEmpty())
			return false;

		setBackup(getEditor().getStack().getStackVector());

 		getEditor().getStack().pop();
		getEditor().JList1.setListData(getEditor().getStack().getStackVector()); // refresh the JList
		getEditor().repaint();
		return true;
	}

	@Override
	public void redo() 
	{
		setBackup(getEditor().getStack().getStackVector());
		getEditor().getStack().pop();		
		getEditor().JList1.setListData(getEditor().getStack().getStackVector()); // refresh the JList
		getEditor().repaint();

	}

}
