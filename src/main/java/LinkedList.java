/**
 * Created by hema on 5/12/16.
 */
class Node{
    int value;
    Node next;

    Node(){
        value = Integer.MIN_VALUE;
        next = null;
    }
}
public class LinkedList {
    Node head;

    LinkedList(Node head){
        this.head = head;
    }


    public void insertStart(int value){
        if(head.value == Integer.MIN_VALUE){
            head = new Node();
            head.value = value;
            head.next = null;
        }
        else{
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertLast(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        Node current = new Node();
        current = head;
        while(current != null){
            if(current.next != null)
                current = current.next;
            else
                break;
        }
        current.next = newNode;
    }


    public void insert(int value, int pos){
        Node newNode = new Node();
        newNode.value = value;
        if(pos-1 == 0){
            insertStart(value);
        }
        else if(pos-1 > 0){
            //insert at a particular position in middle
            int i = 1;
            Node current = new Node();
            current = head;
            while(i < pos-1){
                current = current.next;
                i++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        else{
            //insert at the end
            Node current = new Node();
            current = head;
            int i= 0;
            while(current != null){
                if(current.next != null){
                    current = current.next;
                    i++;
                }
                else{
                    if(pos -1 != i){
                        System.out.println("Position mentioned is outside of the list");
                    }
                    else{
                        current.next = newNode;
                    }
                    break;
                }
            }

        }
    }


    public void deleteFirst(){
        Node current = new Node();
        current = head;
        head = current.next;
    }

    public void deleteLast(){
        Node current = new Node();
        current = head;
        if(current.next != null){
            while(current != null){
                if(current.next.next != null)
                    current = current.next;
                else
                    break;
            }
            current.next = null;

        }
        else{
            head = null;
        }
    }

    public void delete(int pos){
        int i = 1;
        Node current = new Node();
        current = head;
        while(i < pos-1){
            current = current.next;
            i++;
        }
        if(i == 1){
            //deleting head node
            head = current.next;
        }
        else {
            i--;
            if(current.next.next != null) {
                //deleting from middle of list
                current.next = current.next.next;
            }
            else {
                //delete last node
                current.next = null;
            }

        }
    }

    public int getValue(int pos){
        int i = 1;
        Node current = new Node();
        current = head;
        while(i<pos-1){
            current = current.next;
            i++;
        }
        System.out.println("Value in location "+pos+" is "+current.next.value);

        return current.next.value;
    }

    public void printList(){
        if(head != null){
            Node current = new Node();
            current = head;
            while(current != null){
                System.out.print(current.value +"\t");
                current = current.next;
            }
        }
        else{
            System.out.println("List is empty");
        }


    }
}
