package ie.atu.week_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter myCount;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myCount = new Counter();
    }

    @Test
    void testIncrement(){
        assertEquals(1, myCount.increment());
    }

    @Test
    void testConstructor()
    {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () ->{new Counter(5);});
        assertEquals("This is not a valid number", exMessage.getMessage());
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}