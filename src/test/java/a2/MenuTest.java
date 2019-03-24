package a2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {
    Menu menu;

    @Before
    public void setUp() {
        menu = Menu.getMenuInstance();
    }

    @Test
    public void getMenuInstance() {
        Menu anotherOrderManager = Menu.getMenuInstance();
        assertEquals(anotherOrderManager,menu);
    }
}