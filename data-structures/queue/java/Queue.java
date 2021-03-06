import java.util.ArrayList; 

public class Queue<T> {

  private ArrayList<T> arr;
  private int total;

  public Queue() {
    arr = new ArrayList<T>();
    total = 0;
  }

  private void enqueue(T x) {
    arr.add(x);
    total++;
  }

  private void enqueueBatch(ArrayList<T> xs) {
    arr.addAll(xs);
    total = total + xs.size();
  }

  private void dequeue() {
    if (total > 0) {
      arr.remove(0);
      total--;
    }
    else { 
      throw new MyException("Cannot remove from an empty queue");
    }
  }

  private void dequeueBatch(int n) {
    int counter = n;
    if (counter <= total) {
      while (counter > 0) {
        dequeue();
        counter--;
      }
    }
    else {
      throw new MyException("Cannot remove from an empty queue");
    }

  }

  private T peek() {
    return arr.get(0);
  }

}

