package ObserverPattern.part1;

import java.util.ArrayList;

public class Counter implements Subject
{
//    private TextFrame textframe;
//    private RectFrame rectframe;
//    private Oval ovalframe;

    private ArrayList<AbstractFrame> frames;
    private ArrayList<Observer> observers;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        Notify();
    }

    private int count;

    public Counter (TextFrame tf, RectFrame rf, Oval of){
        frames = new ArrayList<>();
        observers = new ArrayList<>();
        frames.add(tf);
        frames.add(rf);
        frames.add(of);
        observers.add(tf);
        observers.add(rf);
        observers.add(of);
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

    @Override
    public void Attach(Observer o) {
        observers.add(o);

    }

    @Override
    public void Detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void Notify() {
        for(Observer o : observers){
            o.update(count);
        }
    }
}