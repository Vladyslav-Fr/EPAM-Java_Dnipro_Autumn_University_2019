package info.vladyslav.EPAM_HW_8_1213;

import org.junit.Test;

import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void fooTest1() throws InterruptedException {
        FooThreeThreads fooThreeThreads = new FooThreeThreads(new int[]{1, 2, 3});
        assertEquals("firstsecondthird", fooThreeThreads.getFoo());
    }

    @Test
    public void fooTest2() throws InterruptedException {
        FooThreeThreads fooThreeThreads = new FooThreeThreads(new int[]{1, 3, 2});
        assertEquals("firstsecondthird", fooThreeThreads.getFoo());
    }



}

