/**
 * Created by hema on 5/28/16.
 */
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SetTest {
    Set set = new Set();

    @Test
    public void test() {

        assertTrue(set.isEmpty());
        set.add(3);
        set.add(5);
        set.add(7);
        assertTrue(set.size() == 3);
        set.add(5);
        assertFalse(set.size() == 4);

        set.add(9);
        assertTrue(set.contains(9));

        set.remove(9);
        assertFalse(set.contains(9));
    }
}
