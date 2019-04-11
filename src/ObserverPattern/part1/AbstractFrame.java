package ObserverPattern.part1;


public class AbstractFrame extends javax.swing.JFrame implements Observer {

    public int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void update(int counter) {

        setCount(counter);
    }
}
