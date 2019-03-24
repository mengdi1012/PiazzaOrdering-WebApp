package a2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeliveryTest {
    Delivery deliery;
    DeliveryDetail deliveryDetail;
    @Before
    public void setUp() throws Exception {
        deliery = new Delivery();
        deliveryDetail = new DeliveryDetail("10 St.George", "{Cheese, small}", "1");
    }

    @Test
    public void testRequestDeliveryServiceForPickup() {
        deliery.requestDeliveryService(deliveryDetail, DeliveryType.pickup);
        assert(true);
    }

    @Test
    public void testRequestDeliveryServiceForInhouse() {
        deliery.requestDeliveryService(deliveryDetail, DeliveryType.inhouse);
        assert(true);
    }

    @Test
    public void testRequestDeliveryServiceForUbereats() {
        deliery.requestDeliveryService(deliveryDetail, DeliveryType.ubereats);
        assert(true);
    }

    @Test
    public void testRequestDeliveryServiceForFoodora() {
        deliery.requestDeliveryService(deliveryDetail, DeliveryType.foodora);
        assert(true);
    }
}