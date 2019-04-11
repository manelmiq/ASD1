package CompositePattern;

public  abstract class ComputerComponent implements PriceInterface {
    public void add(ComputerComponent computerComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(ComputerComponent computerComponent){
        throw new UnsupportedOperationException();
    }
    public void getChild(int i ){
        throw new UnsupportedOperationException();
    }

}
