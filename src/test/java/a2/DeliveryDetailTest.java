package a2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeliveryDetailTest {
    DeliveryDetail deliveryDetail;
    String address = "10 St.George";
    String orderDetail = "{Cheese, small}";
    String orderNumber = "1";

    @Before
    public void setUp() throws Exception {
        deliveryDetail = new DeliveryDetail(address, orderDetail, orderNumber);
    }

    @Test
    public void testGetAddress() {
        assertEquals(address, deliveryDetail.getAddress());

    }

    @Test
    public void testGetOrderDetails() {
        assertEquals(orderDetail, deliveryDetail.getOrderDetails());

    }

    @Test
    public void testGetOrderNumber() {
        assertEquals(orderNumber, deliveryDetail.getOrderNumber());
    }
}