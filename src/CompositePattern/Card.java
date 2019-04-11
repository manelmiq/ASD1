package CompositePattern;

public class Card extends ComputerComponent {
    public double netPrice() {
        return 10.00;
    }

    public double discountPrice() {
        return 1.00;
    }

    public double computePrice() {
        return netPrice();
    }
}

