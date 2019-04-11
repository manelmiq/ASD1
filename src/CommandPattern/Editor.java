package CommandPattern;

import javax.swing.*;
import java.awt.event.ActionEvent;

/* ************************************
 *
 *  Editor.
 *
 * ************************************/

public class Editor extends javax.swing.JFrame {
    private VStack stack = new VStack();  // the stack object
    private String pushstring = "  "; // the string to push on the stack
    private CommandHistory history; // the string to push on the stack

    Editor editor = this;

    public Editor() {
        setTitle("Stack Application");
        history = new CommandHistory();
        setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(480, 300);
        setVisible(false);

        JButtonPush.setText("Push");
        getContentPane().add(JButtonPush);
        JButtonPush.setBounds(38, 48, 110, 30);

        JButtonPop.setText("Pop");
        getContentPane().add(JButtonPop);
        JButtonPop.setBounds(38, 98, 110, 30);

        JButtonUndo.setText("Undo");
        getContentPane().add(JButtonUndo);
        JButtonUndo.setBounds(38, 144, 110, 30);

        JButtonRedo.setText("Redo");
        getContentPane().add(JButtonRedo);
        JButtonRedo.setBounds(38, 190, 110, 30);

        JScrollPane scrollPane = new JScrollPane(JList1);
        JList1.setListData(stack.getStackVector());
        scrollPane.setBounds(218, 38, 160, 200);

        getContentPane().add(scrollPane);

        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        SymAction lSymAction = new SymAction();

        JButtonPush.addActionListener(lSymAction);
        JButtonPop.addActionListener(lSymAction);
        JButtonUndo.addActionListener(lSymAction);
        JButtonRedo.addActionListener(lSymAction);

    }

    public VStack getStack() {
        return stack;
    }

    public void setStack(VStack stack) {
        this.stack = stack;
    }

    public String getPushstring() {
        return pushstring;
    }

    public void setPushstring(String pushstring) {
        this.pushstring = pushstring;
    }

    public CommandHistory getHistory() {
        return history;
    }

    public void setHistory(CommandHistory history) {
        this.history = history;
    }

    //
    javax.swing.JButton JButtonPush = new javax.swing.JButton();
    javax.swing.JButton JButtonPop = new javax.swing.JButton();
    javax.swing.JButton JButtonUndo = new javax.swing.JButton();
    javax.swing.JButton JButtonRedo = new javax.swing.JButton();
    javax.swing.JList JList1 = new javax.swing.JList();
    //


    static public void main(String args[]) {
        try {
            // Add the following code if you want the Look and Feel
            // to be set to the Look and Feel of the native system.

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }

            //Create a new instance of our application's frame, and make it visible.
            (new Editor()).setVisible(true);
        } catch (Throwable t) {
            t.printStackTrace();
            //Ensure the application exits with an error condition.
            System.exit(1);
        }
    }


    void exitApplication() {
        try {
            this.setVisible(false);    // hide the Frame
            this.dispose();            // free the system resources
            System.exit(0);            // close the application
        } catch (Exception e) {
        }
    }

    class SymWindow extends java.awt.event.WindowAdapter {
        public void windowClosing(java.awt.event.WindowEvent event) {
            Object object = event.getSource();
            if (object == Editor.this)
                JFrame1_windowClosing(event);
        }
    }

    void JFrame1_windowClosing(java.awt.event.WindowEvent event) {
        // to do: code goes here.

        JFrame1_windowClosing_Interaction1(event);
    }

    void JFrame1_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
        try {
            this.exitApplication();
        } catch (Exception e) {
        }
    }

    class SymAction implements java.awt.event.ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent event) {
            Object object = event.getSource();
            if (object == JButtonPush)
                JButtonPush_actionPerformed(event);
            else if (object == JButtonPop)
                JButtonPop_actionPerformed(event);
            else if (object == JButtonUndo)
                JButtonUndo_actionPerformed(event);
            else if (object == JButtonRedo)
                JButtonRedo_actionPerformed(event);

        }
    }

    void JButtonPush_actionPerformed(ActionEvent event) {
        executeCommand(new PushCommand(this));
    }

    void JButtonPop_actionPerformed(java.awt.event.ActionEvent event) {
        executeCommand(new PopCommand(this));
    }


    void JButtonUndo_actionPerformed(java.awt.event.ActionEvent event) {
        Command command = history.pop();
        executeCommand(command);

    }

    void JButtonRedo_actionPerformed(java.awt.event.ActionEvent event) {
        // to do: code goes here.
        Command command = history.pop();
        executeCommand(command);
    }


    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
            this.editor.repaint();
        }
    }


    public void setPushString(String string) {
        pushstring = string;
    }


}
