/**
 * Created by hema on 5/16/16.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {
    Queue queue = new Queue();
    @Test
    public void test() {

        assertTrue(queue.isEmpty());
        queue.add(3);
        queue.add(5);
        queue.add(7);
        queue.printQueue();
        System.out.println("\n");

        assertTrue(queue.size() == 3);
        assertEquals(7, queue.peek());

        queue.add(9);
        queue.printQueue();
        System.out.println("\n");

        assertTrue(queue.getValue(queue.size()) == 3);

        queue.remove();

        queue.printQueue();
        System.out.println("\n");

        assertTrue(queue.getValue(queue.size()) == 3);
    }

}
