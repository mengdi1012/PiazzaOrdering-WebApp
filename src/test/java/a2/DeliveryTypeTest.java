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
    public void testGetDevelieryTypePickup() throws Exception {
        assertEquals(DeliveryType.pickup, DeliveryType.getDevelieryType("pickup"));
    }

    @Test
    public void testGetDevelieryTypeInhouse() throws Exception {
        assertEquals(DeliveryType.inhouse, DeliveryType.getDevelieryType("Store Delivery"));
    }

    @Test
    public void testGetDevelieryTypeUbereats() throws Exception {
        assertEquals(DeliveryType.ubereats, DeliveryType.getDevelieryType("Uber Eats"));
    }

    @Test
    public void testGetDevelieryTypeFoodora() throws Exception {
        assertEquals(DeliveryType.foodora, DeliveryType.getDevelieryType("Foodora"));
    }




}