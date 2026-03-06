package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {

        CustomList list = new CustomList();

        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);

        list.deleteCity(vancouver);
        assertFalse(list.hasCity(vancouver));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        City calgary = new City("Calgary", "AB");
        City vancouver = new City("Vancouver", "BC");

        assertEquals(0, list.countCities());
        list.addCity(calgary);

        assertEquals(1, list.countCities());
        list.addCity(vancouver);

        assertEquals(2, list.countCities());
    }
}