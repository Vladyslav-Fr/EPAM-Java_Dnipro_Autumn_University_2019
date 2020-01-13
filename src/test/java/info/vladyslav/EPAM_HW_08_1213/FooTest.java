package info.vladyslav.EPAM_HW_08_1213;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooTest {
    private Foo fooThreeThreads = new Foo();

    @Test
    public void fooTest1() throws InterruptedException {
        assertEquals("firstsecondthird", fooThreeThreads.fooThreeThreads(new int[]{1, 2, 3}));
    }

    @Test
    public void fooTest2() throws InterruptedException {
        assertEquals("firstsecondthird", fooThreeThreads.fooThreeThreads(new int[]{1, 3, 2}));
    }
}

