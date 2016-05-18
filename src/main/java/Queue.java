public class Queue {
    LinkedList linkedList = new LinkedList();

    public void add(int value){
        linkedList.insertStart(value);
    }

    public void remove(){
        linkedList.deleteLast();
    }

    public int getValue(int pos){
        return linkedList.getValue(pos);
    }

    public static void main(String arg[]){
        Queue queue = new Queue();
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.remove();
        queue.add(8);
        System.out.println(queue.getValue(2));
    }
}