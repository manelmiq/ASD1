package ObserverPattern.part2;

import java.util.ArrayList;
import java.util.Observable;

public class Counter extends Observable {


    private ArrayList<AbstractFrame> frames;
    private ArrayList<Observer> observers;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        System.out.println("here");
        System.out.println(count);
        setChanged();
        notifyObservers();
    }

    private int count;

    public Counter (TextFrame tf, RectFrame rf, Oval of){
        frames = new ArrayList<>();
        observers = new ArrayList<>();
        frames.add(tf);
        frames.add(rf);
        frames.add(of);
//        addObserver();
        count = 0;
    }

    public void increment(){
        count++;
        setCount(count);
    }

    public void decrement(){
        if (count >0){
            count--;
            setCount(count);

        }
    }


}