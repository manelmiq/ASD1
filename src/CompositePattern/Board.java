package CompositePattern;

import java.util.Vector;

public class Board extends ComputerComponent{
    private ComputerComponent bus;
    private Vector<ComputerComponent> cardlist = new Vector();

    public void setBus(Bus b) {
        bus = b;
    }

    @Override
    public void add(ComputerComponent computerComponent) {
        cardlist.add(computerComponent);
    }



    public double netPrice() {
        return 26.00;
    }

    public double discountPrice() {
        return 6.00;
    }

    public double computePrice() {
        double tmp = discountPrice();
        if (bus != null)
            tmp += bus.computePrice();
        for (ComputerComponent card : cardlist)
            tmp += card.computePrice();
        return tmp;
    }
}
