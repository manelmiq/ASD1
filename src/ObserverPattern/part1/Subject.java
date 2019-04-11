

package ObserverPattern.part1;

public interface Subject{

    void Attach(Observer o);
    void Detach(Observer o);
    void Notify();
}