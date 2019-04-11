package CompositePattern;

import java.util.Vector;

public class Cabinet extends ComputerComponent{
    private ComputerComponent board;
    private Vector<ComputerComponent> drivelist = new Vector();

    public void setBoard(Board b) {
        board = b;
    }

    public void add(ComputerComponent c) {
        drivelist.addElement(c);
    }

    public double netPrice() {
        return 6.00;
    }

    public double discountPrice() {
        return 3.00;
    }

    public double computePrice() {
        double tmp = netPrice();
        if (board != null)
            tmp += board.computePrice();
        for (ComputerComponent drive : drivelist)
            tmp += drive.computePrice();
        return tmp;
    }
}
