package CompositePattern;

public class Bus extends ComputerComponent{
    public double netPrice() {
        return 5.00;
    }

    public double discountPrice() {
        return 1.00;
    }

    public double computePrice() {
        return netPrice();
    }
}
