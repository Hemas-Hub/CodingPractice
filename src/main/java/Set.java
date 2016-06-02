/**
 * Created by hema on 5/28/16.
 */

import java.util.Iterator;

public class Set {
    LinkedList list = new LinkedList();

    public void add(int value){
        boolean contains = contains(value);
        if(!contains){
            list.insertLast(value);
        }
        else{
            System.out.println("Duplicate value. Cannot be added to the set");
        }
    }

    public void remove(int val){
        Iterator listI = list.iterator();
        int i =1;
        while(listI.hasNext()){
            Node current = (Node) listI.next();
            if(val == current.value){
                list.delete(i);
                break;
            }
            else{
                i++;
            }
        }
    }

    public boolean contains(int val){
        Iterator listI = list.iterator();
        boolean flag = false;
        while(listI.hasNext()){
            Node current = (Node) listI.next();
            if(val == current.value){
                flag = true;
                break;
            }
            else
                continue;
        }
        return flag;
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
}
