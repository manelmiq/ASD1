package main.v1;

import java.util.Vector;


public abstract class Command {
	private Editor editor;
	private Vector<String> backup;

	public Vector<String> getBackup() {
		return backup;
	}

	public void setBackup(Vector<String> backup) {
		this.backup = (Vector<String>) backup.clone();
	}

	public Command(Editor editor) {
		this.editor = editor;
	}

	public void undo() 
	{
		editor.getStack().setStackvector(backup);
		editor.JList1.setListData(backup);
		editor.repaint();
	}

	public abstract void redo();		

	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}

	protected abstract boolean execute();

}
