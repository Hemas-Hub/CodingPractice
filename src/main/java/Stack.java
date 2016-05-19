/**
 * Created by hema on 5/17/16.
 */
public class Stack {
    LinkedList list = new LinkedList();

    public void add(int value){
        list.insertLast(value);
    }

    public void remove(){
        list.deleteLast();
    }

    public int getValue(int pos){
        return list.getValue(pos);
    }

    public int peek(){
        return list.getLastValue();
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void printQueue(){
        list.printList();
    }
}
