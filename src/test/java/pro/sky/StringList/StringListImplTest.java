package pro.sky.StringList;

import org.junit.jupiter.api.Test;
import pro.sky.StringList.exception.InvalidIndexException;
import pro.sky.StringList.exception.NullItemException;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    private final StringListImpl stringListImpl = new StringListImpl();
    private final StringListImpl otherstringListImpl = new StringListImpl();

    String expectedStr1 = "строка1";
    String expectedStr2 = "строка2";

    @Test
    void testToString() {
        stringListImpl.add(expectedStr1);
        stringListImpl.add(expectedStr2);
        String expected = "list=[строка1, строка2, null, null, null, null, null, null, null, null]";
        String actual = stringListImpl.toString();
        assertEquals(expected, actual);
    }

    @Test
    void add() {
        assertEquals(expectedStr1, stringListImpl.add(expectedStr1));
    }

    @Test
    void testAdd() {
        stringListImpl.add(expectedStr1);
        stringListImpl.add(expectedStr2);
        assertEquals(2, stringListImpl.size());

    }

    @Test
    void set() {
        stringListImpl.add(0, expectedStr1);
        stringListImpl.set(0, expectedStr2);
        assertTrue(stringListImpl.contains(expectedStr2));
        assertFalse(stringListImpl.contains(expectedStr1));
        assertThrows(NullItemException.class, () -> stringListImpl.set(0, null));
        assertThrows(InvalidIndexException.class, () -> stringListImpl.set(11, expectedStr1));
    }

    @Test
    void remove() {
        stringListImpl.add(expectedStr1);
        stringListImpl.remove(expectedStr1);
        assertEquals(expectedStr1, stringListImpl.get(0));
    }

    @Test
    void testRemove() {
        stringListImpl.add(0, expectedStr1);
        stringListImpl.remove(0);
        assertFalse(stringListImpl.contains(expectedStr1));
        assertThrows(InvalidIndexException.class, () -> stringListImpl.remove(2));
    }

    @Test
    void contains() {
        stringListImpl.add(expectedStr1);
        assertTrue(stringListImpl.contains(expectedStr1));
    }

    @Test
    void indexOf() {
        stringListImpl.add(expectedStr1);
        stringListImpl.add(expectedStr2);
        assertEquals(0, stringListImpl.indexOf(expectedStr1));
    }

    @Test
    void lastIndexOf() {
        stringListImpl.add(expectedStr1);
        stringListImpl.add(expectedStr2);
        assertEquals(0, stringListImpl.indexOf(expectedStr1));
    }

    @Test
    void get() {
        stringListImpl.add(expectedStr1);
        assertTrue(stringListImpl.get(0).equals(expectedStr1));
        assertFalse(stringListImpl.get(0).equals(expectedStr2));
        assertThrows(InvalidIndexException.class, () -> stringListImpl.get(-5));
    }

    @Test
    void testEquals() {
        stringListImpl.add(expectedStr1);
        otherstringListImpl.add(expectedStr1);
        assertTrue(stringListImpl.equals(otherstringListImpl));
    }

    @Test
    void size() {
        stringListImpl.add(expectedStr1);
        stringListImpl.add(expectedStr2);
        assertEquals(2, stringListImpl.size());

    }

    @Test
    void isEmpty() {
        assertTrue(stringListImpl.isEmpty());
        stringListImpl.add(expectedStr1);
        assertFalse(stringListImpl.isEmpty());
    }

    @Test
    void clear() {
        stringListImpl.add(expectedStr1);
        stringListImpl.add(expectedStr2);
        stringListImpl.clear();
        assertEquals(stringListImpl.size(), 0);
    }

    @Test
    void toArray() {
        stringListImpl.add(expectedStr1);
        stringListImpl.add(expectedStr2);
        String[] expectedArray = {"строка1", "строка2", null, null, null, null, null, null, null, null};
        String[] actualArray = {"строка1", "строка2", null, null, null, null, null, null, null, null};
        assertArrayEquals(expectedArray, actualArray);
    }
}