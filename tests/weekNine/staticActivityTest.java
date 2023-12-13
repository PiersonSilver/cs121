package weekNine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class staticActivityTest {

    @Test
    void testInstanceCount() {
        assertEquals(2, staticActivity.count());
    }
    @BeforeEach
    public void setUp(){
        staticActivity P = new staticActivity("Pierson", "Silver", 21);
        staticActivity T = new staticActivity("Taylor", "Lauria", 25);
    }
}