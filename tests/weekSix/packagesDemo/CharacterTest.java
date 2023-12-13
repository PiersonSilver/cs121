package weekSix.packagesDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    private Character test = new Character("test");

    @Test
    void setName() {
        assertEquals("test", test.getName());
    }
    @Test
    void testConstructor(){
        Character test2 = new Character("test2");
        assertNotNull(test2);
    }
    @Test
    void nameTest(){
        assertTrue(test.getName().equals("test"));
        assertFalse(test.getName().equals("nottest"));

    }
}