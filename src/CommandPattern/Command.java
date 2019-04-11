package CommandPattern;

public abstract class Command {

    private Editor editor;
    private String content;

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }







    Command(Editor Editor) {
        this.editor = Editor;

    }

    void backup() {
//        backup = Editor.textField.getText();
    }

    public void undo() {
//        Editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
