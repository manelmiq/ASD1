package ObserverPattern.part2;

import java.util.Observable;
import java.util.Observer;

public class SimpleCounter implements Observer {
    private  Integer count;

    public SimpleCounter(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void update(Observable o, Object c) {
        this.count = (Integer) c;
    }
}
