package CompositePattern;

public class Drive extends ComputerComponent{
    public double netPrice() {
        return 10.00;
    }

    public double discountPrice() {
        return 4.00;
    }

    public double computePrice() {
        return discountPrice();
    }
}

