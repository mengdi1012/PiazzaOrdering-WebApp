package a2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeliveryTypeTest {

    @Test
    public void testGetAllDeliveryTypes() {
        String expect = "[Pickup] [Store Delivery] [Uber Eats] [Foodora]";
        assertEquals(expect, DeliveryType.getAllDeliveryTypes().trim());
    }

    @Test
    public void testGetDeliveryTypePickup() throws Exception {
        assertEquals(DeliveryType.pickup, DeliveryType.getDevelieryType("pickup"));
    }

    @Test
    public void testGetDeliveryTypeInhouse() throws Exception {
        assertEquals(DeliveryType.inhouse, DeliveryType.getDevelieryType("Store Delivery"));
    }

    @Test
    public void testGetDeliveryTypeUbereats() throws Exception {
        assertEquals(DeliveryType.ubereats, DeliveryType.getDevelieryType("Uber Eats"));
    }

    @Test
    public void testGetDeliveryTypeFoodora() throws Exception {
        assertEquals(DeliveryType.foodora, DeliveryType.getDevelieryType("Foodora"));
    }




}