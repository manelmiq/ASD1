package main;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;


public class MyVector<Integer> extends Vector<Integer>
{
   Iterator<Integer> it;

   public void doAll(Functor<Integer> functor)
   {
        it = this.iterator();
        while (it.hasNext())
            functor.compute(it.next());
   }

   public Iterator<Integer> iterator(Predicate<Integer> pred) {
       it = new PredicateIterator<Integer>(this, pred);

       return it;
   }

   public Iterable<Integer> iterable(Predicate<Integer> pred)
   {
       return new IterableInteger<Integer>(this, pred);
   }

   public void doAll(Functor<Integer> functor, Predicate<Integer> pred) {
        it = new PredicateIterator<Integer>(this, pred);
        while (it.hasNext()) {
            Integer i = it.next();
            if (i != null)
                functor.compute(i);
        }
   }

}
