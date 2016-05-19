
/**
 * Created by hema on 5/16/16.
 */
public class Queue {
    LinkedList linkedList = new LinkedList();

    public void add(int value){
        linkedList.insertStart(value);
    }

    public void remove(){
        linkedList.deleteFirst();
    }

    public int getValue(int pos){
        return linkedList.getValue(pos);
    }

    public int peek(){
        return linkedList.getHead();
    }

    public int size(){
        return linkedList.size();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public void printQueue(){
        linkedList.printList();
    }
}